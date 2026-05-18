import JuegoVisitor from './generated/JuegoVisitor.js';

export class CustomJuegoVisitor extends JuegoVisitor {
    constructor() {
        super();
        // Esta es nuestra "tabla de símbolos" o memoria temporal, como explica la guía.
        // Nos va a servir para guardar las elecciones del jugador en tiempo de ejecución.
        this.memoria = {}; 
    }

    // 1. Nodo Raíz: prog : juego EOF ;
    visitProg(ctx) {
        return this.visit(ctx.juego());
    }

    // 2. Definición del Juego: juego : 'juego' nombre '{' escenas '}' ;
    visitJuego(ctx) {
        const nombreJuego = ctx.nombre().getText();
        console.log(`\n🎮 [Motor de Juego]: Cargando aventura "${nombreJuego}"...`);
        return this.visit(ctx.escenas());
    }

    // 3. Contenedor de Escenas: escenas : escena* ;
    visitEscenas(ctx) {
        // Recorremos y visitamos cada una de las escenas declaradas en el archivo
        ctx.escena().forEach(e => this.visit(e));
        return null;
    }

    // 4. Cada Escena Individual: escena : 'escena' nombre '{' acciones '}' ;
    visitEscena(ctx) {
        const nombreEscena = ctx.nombre().getText();
        console.log(`\n📍 ESCENA: ${nombreEscena}`);
        console.log(`--------------------------------------------------`);
        return this.visit(ctx.acciones());
    }

    // 5. Bloque de Acciones: acciones : (imprimir | leer | condicion | saltarAct)* ;
    visitAcciones(ctx) {
        // Evaluamos secuencialmente los hijos (acciones internas) si existen
        ctx.children?.forEach(accion => this.visit(accion));
        return null;
    }

    // 6. Acción Imprimir: mostrar "texto" ;
    visitImprimir(ctx) {
        // .getText() nos devuelve el string con comillas (ej: "Hola").
        // Con el .replace(/"/g, "") se las quitamos para que quede limpio en consola.
        const textoLimpio = ctx.TEXTO().getText().replace(/"/g, "");
        console.log(`💬 ${textoLimpio}`);
        return null;
    }

    // 7. Acción Leer: leer variable ;
    visitLeer(ctx) {
        const nombreVariable = ctx.nombre().getText();
        
        // Simulamos la entrada del jugador guardando un valor por defecto en la memoria.
        // Si querés interactuar de verdad en el futuro, acá meterías un prompt de consola.
        this.memoria[nombreVariable] = "avanzar"; 
        
        console.log(`⚙️  [Sistema]: Se leyó la entrada y se guardó en la variable '${nombreVariable}'`);
        return null;
    }

    // 8. Acción Condición: si comparacion saltar escena ;
    visitCondicion(ctx) {
        const destinoEscena = ctx.nombre().getText();
        
        // Invocamos al método visitComparacion(ctx) para resolver si da true o false
        const condicionCumplida = this.visit(ctx.comparacion());

        if (condicionCumplida) {
            console.log(`✨ [Condición Verdadera]: Saltando automáticamente a la escena '${destinoEscena}'`);
            // Nota: En un motor real completo, acá forzarías el flujo hacia esa escena.
        } else {
            console.log(`❌ [Condición Falsa]: No se salta a la escena '${destinoEscena}'`);
        }
        return null;
    }

    // 9. Operación de Comparación: variable == valor
    visitComparacion(ctx) {
        const nombreVariable = ctx.nombre().getText();
        const valorCrudo = ctx.valor().getText();
        const valorAComparar = valorCrudo.replace(/"/g, ""); // Limpiamos comillas por si es texto

        // Control de Error Semántico (Mismo criterio que el 'Caso 4' de la guía de estudio)
        // Si el jugador intenta evaluar una variable que no existe en memoria, lanzamos un error.
        if (!(nombreVariable in this.memoria)) {
            throw new Error(`Error semántico: La variable '${nombreVariable}' no fue inicializada antes de usarse.`);
        }

        // Retorna verdadero si el dato guardado coincide con la condición
        return this.memoria[nombreVariable] === valorAComparar;
    }

    // 10. Acción Saltar Directo: saltar escena ;
    visitSaltarAct(ctx) {
        const destinoEscena = ctx.nombre().getText();
        console.log(`🏃‍♂️ [Acción]: Saltando de forma directa a la escena '${destinoEscena}'`);
        return null;
    }
}

export default CustomJuegoVisitor;