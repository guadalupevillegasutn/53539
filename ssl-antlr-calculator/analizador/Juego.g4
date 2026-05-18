grammar Juego;

// 1. REGLAS SINTÁCTICAS (PARSER)
prog : juego EOF ;
juego : JUEGO nombre LLAVE_A escenas LLAVE_C ;
escenas : escena* ;
escena : ESCENA nombre LLAVE_A acciones LLAVE_C ;
acciones : (imprimir | leer | condicion | saltarAct)* ;
imprimir : MOSTRAR TEXTO PC ;
leer : LEER nombre PC ;
condicion : SI comparacion SALTAR nombre PC ;
comparacion : nombre IGUAL valor ;
saltarAct : SALTAR nombre PC ;
nombre : ID ;
valor : INT | TEXTO ;


// 2. REGLAS LÉXICAS (LEXER) - PALABRAS CLAVE
JUEGO    : 'juego' ;
ESCENA   : 'escena' ;
MOSTRAR  : 'mostrar' ;
LEER     : 'leer' ;
SI       : 'si' ;
SALTAR   : 'saltar' ;
IGUAL    : '==' ;
LLAVE_A  : '{' ;
LLAVE_C  : '}' ;
PC       : ';' ;

// 3. REGLAS LÉXICAS GENERALES (IDENTIFICADORES Y VALORES)

// Un único token para cualquier nombre de juego, escena o variable. Evita conflictos.
ID : [a-zA-ZáéíóúÁÉÍÓÚñÑ][a-zA-Z0-9áéíóúÁÉÍÓÚñÑ_]* ;
INT : [0-9]+ ;
TEXTO : '"' (~["\r\n])* '"' ;
// Ignorar espacios y saltos de línea
WS : [ \t\r\n]+ -> skip ;