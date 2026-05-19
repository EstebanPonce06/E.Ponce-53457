grammar Analizador; 

// REGLAS DEL PARSER 

programa : instruccion+ ;
instruccion : repeticion; 
repeticion : REPETIR LLAVE_A sentencia* LLAVE_C HASTA condicion PUNTO_COMA ; 
sentencia : salida+ | terminar ;
salida : IMPRIMIR LPAREN CADENA RPAREN PUNTO_COMA ; 
terminar : SALIR PUNTO_COMA ;
condicion : VERDADERO | FALSO ;

// REGLAS DEL LEXER 


REPETIR   : 'repetir' ;
HASTA     : 'hasta' ;
IMPRIMIR  : 'imprimir' ; 
SALIR     : 'salir' ; 
VERDADERO : 'verdadero' ;
FALSO     : 'falso' ; 


LPAREN    : '(' ;
RPAREN    : ')' ;
LLAVE_A   : '{' ;
LLAVE_C   : '}' ; 
PUNTO_COMA: ';' ; 


CADENA   : '"' (CARACTER | ' ')* '"' ; 
CARACTER : LETRA | DIGITO | SIMBOLO ;
LETRA    : [a-zA-Z] ;
DIGITO   : [0-9] ;
SIMBOLO  : [.,!?:;] ; 

WS : [ \t\r\n]+ -> skip ;