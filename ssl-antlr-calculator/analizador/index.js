import JuegoLexer from "./generated/JuegoLexer.js";
import JuegoParser from "./generated/JuegoParser.js";
import { CustomJuegoVisitor } from "./CustomJuegoVisitor.js";
import { JuegoTranslator } from "./JuegoTranslator.js";
import { ErrorListener } from "./ErrorListener.js";
import antlr4, { CharStreams, CommonTokenStream } from "antlr4";
import readline from "readline";
import fs from "fs";

async function main() {
    let input;
    try {
        input = fs.readFileSync("input.txt", "utf8");
    } catch (err) {
        input = await leerCadena();
    }

    const errorLexer = new ErrorListener("LEXICO");
    const errorParser = new ErrorListener("SINTACTICO");

    let inputStream = CharStreams.fromString(input);
    let lexer = new JuegoLexer(inputStream);
    lexer.removeErrorListeners();
    lexer.addErrorListener(errorLexer);

    let tokenStream = new CommonTokenStream(lexer);

    tokenStream.fill();
    console.log("\n==================================================");
    console.log("  TABLA DE LEXEMAS Y TOKENS RECONOCIDOS");
    console.log("==================================================");
    console.log("LEXEMA".padEnd(25) + " | " + "TOKEN");
    console.log("-".repeat(55));
    tokenStream.tokens.forEach(token => {
        if (token.type !== antlr4.Token.EOF) {
            const nombreToken = JuegoLexer.symbolicNames[token.type] ?? "TOKEN_DESCONOCIDO";
            const lexema = token.text.replace(/\r?\n|\r/g, " ");
            console.log(lexema.padEnd(25) + " | " + nombreToken);
        }
    });
    console.log("==================================================\n");

    tokenStream.reset();

    let parser = new JuegoParser(tokenStream);
    parser.removeErrorListeners();
    parser.addErrorListener(errorParser);

    let tree = parser.prog();

    const todosLosErrores = [...errorLexer.errors, ...errorParser.errors];
    console.log("==================================================");
    console.log("  ANALISIS DEL CODIGO FUENTE");
    console.log("==================================================");
    console.log("Errores lexicos:     " + errorLexer.errors.length);
    console.log("Errores sintacticos: " + errorParser.errors.length);
    console.log("Total de errores:    " + todosLosErrores.length);

    if (todosLosErrores.length > 0) {
        console.log("\n  Detalle de errores:");
        todosLosErrores.forEach(e => {
            console.log("  [" + e.tipo + "] Linea " + e.line + ":" + e.column + " -> " + e.msg);
        });
        console.log("==================================================\n");
        console.log("\n⚠️  Debido a los errores encontrados:");
        console.log("   - No se puede generar el árbol sintáctico.");
        console.log("   - No se puede realizar la traducción a JavaScript.");
        console.log("   - No se puede ejecutar el programa.");
        console.log("==================================================\n");
    } else {
        console.log("==================================================\n");

        console.log("==================================================");
        console.log("  ARBOL SINTACTICO");
        console.log("==================================================");
        console.log(tree.toStringTree(parser.ruleNames));
        console.log("==================================================\n");

        console.log("==================================================");
        console.log("  TRADUCCION A JAVASCRIPT");
        console.log("==================================================");
        const translator = new JuegoTranslator();
        const codigoJS = translator.visit(tree);
        console.log(codigoJS);
        console.log("==================================================\n");

        console.log("==================================================");
        console.log("  EJECUCION");
        console.log("==================================================");
        const interprete = new CustomJuegoVisitor();
        interprete.visit(tree);
    }
}

function leerCadena() {
    const rl = readline.createInterface({ input: process.stdin, output: process.stdout });
    return new Promise(resolve => {
        rl.question("Ingrese el codigo: ", (answer) => {
            rl.close();
            resolve(answer);
        });
    });
}

main();