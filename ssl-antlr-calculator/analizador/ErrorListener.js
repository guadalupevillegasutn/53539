import antlr4 from "antlr4";

export class ErrorListener extends antlr4.error.ErrorListener {
    constructor(tipo) {
        super();
        this.tipo = tipo;
        this.errors = [];
    }

    syntaxError(recognizer, offendingSymbol, line, column, msg, e) {
        this.errors.push({ tipo: this.tipo, line, column, msg });
    }
}
