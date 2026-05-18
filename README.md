# Analizador de Juegos - 53539

## Descripción
Analizador léxico, sintáctico e intérprete para un lenguaje de juegos de aventura, construido con ANTLR4 y JavaScript.

## Requisitos
- Node.js 16 o superior
- Java 1.8 o superior

## Instalación
Clonar el repositorio:
```bash
git clone https://github.com/guadalupevillegasutn/53539.git
```

Entrar a la carpeta del analizador:
```bash
cd 53539/analizador
```

Instalar dependencias:
```bash
npm install
```

## Cómo ejecutar
1. Colocar el código fuente a analizar en el archivo `input.txt`
2. Ejecutar:
```bash
node index.js
```

## Qué muestra la salida
1. **Tabla de lexemas y tokens** reconocidos durante el análisis léxico
2. **Análisis del código fuente** con cantidad y detalle de errores léxicos y sintácticos
3. **Árbol sintáctico** en formato texto (solo si no hay errores)
4. **Traducción a JavaScript** del código fuente (solo si no hay errores)
5. **Ejecución** del juego como intérprete (solo si no hay errores)

## Ejemplos incluidos
Copiar el contenido de cualquier archivo de la carpeta `ejemplos/` en `input.txt` y ejecutar `node index.js`.

- `correcto1.txt` — juego con múltiples escenas y saltar
- `correcto2.txt` — juego con leer, condición si y saltar
- `incorrecto1.txt` — error sintáctico: falta punto y coma
- `incorrecto2.txt` — error sintáctico: falta la palabra escena