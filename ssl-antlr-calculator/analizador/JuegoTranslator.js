import juegoVisitor from "./generated/JuegoVisitor.js";

export class JuegoTranslator extends juegoVisitor {
    constructor() {
        super();
        this.codigo = [];
        this.escenas = [];
    }

    visitProg(ctx) {
        return this.visit(ctx.juego());
    }

    visitJuego(ctx) {
        const nombre = ctx.nombre().getText();
        this.codigo.push(`// Juego: ${nombre}`);
        this.codigo.push(`const memoria = {};`);
        this.codigo.push(`function leer(variable) {`);
        this.codigo.push(`    return new Promise(resolve => process.stdout.write('> ') || require('fs').read(0, Buffer.alloc(1024), 0, 1024, null, (_, n, b) => { memoria[variable] = b.toString('utf8', 0, n).trim(); resolve(); }));`);
        this.codigo.push(`}`);
        this.codigo.push(``);
        this.visit(ctx.escenas());
        const primera = this.escenas[0];
        if (primera) this.codigo.push(`\nescena_${primera}();`);
        return this.codigo.join('\n');
    }

    visitEscena(ctx) {
        const nombre = ctx.nombre().getText();
        this.escenas.push(nombre);
        this.codigo.push(`async function escena_${nombre}() {`);
        this.visit(ctx.acciones());
        this.codigo.push(`}`);
        this.codigo.push(``);
        return null;
    }

    visitImprimir(ctx) {
        const texto = ctx.TEXTO().getText();
        this.codigo.push(`    console.log(${texto});`);
        return null;
    }

    visitLeer(ctx) {
        const variable = ctx.nombre().getText();
        this.codigo.push(`    await leer('${variable}');`);
        return null;
    }

    visitCondicion(ctx) {
        const variable = ctx.comparacion().nombre().getText();
        const valor = ctx.comparacion().valor().getText();
        const destino = ctx.nombre().getText();
        this.codigo.push(`    if (memoria['${variable}'] === ${valor}) { await escena_${destino}(); return; }`);
        return null;
    }

    visitSaltarAct(ctx) {
        const destino = ctx.nombre().getText();
        this.codigo.push(`    await escena_${destino}(); return;`);
        return null;
    }

    visitAcciones(ctx) {
        if (ctx.children) {
            for (let child of ctx.children) {
                this.visit(child);
            }
        }
        return null;
    }
}