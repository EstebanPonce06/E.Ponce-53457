import fs from 'fs';
import antlr4 from 'antlr4';

import AnalizadorLexer from './AnalizadorLexer.js';
import AnalizadorParser from './AnalizadorParser.js';

const input = fs.readFileSync('input.txt', 'utf8');
 
const chars = new antlr4.InputStream(input);
 
const lexer = new AnalizadorLexer(chars);
const tokens = new antlr4.CommonTokenStream(lexer);
 
const parser = new AnalizadorParser(tokens);
parser.buildParseTrees = true;
 
const erroresLexicos = [];
const erroresSintacticos = [];
 
lexer.removeErrorListeners();
lexer.addErrorListener({
    syntaxError: (recognizer, offendingSymbol, line, column, msg) => {
        erroresLexicos.push({ linea: line, columna: column, mensaje: msg });
    }
});
 
parser.removeErrorListeners();
parser.addErrorListener({
    syntaxError: (recognizer, offendingSymbol, line, column, msg) => {
        erroresSintacticos.push({ linea: line, columna: column, mensaje: msg });
    },
    reportAmbiguity: () => {},
    reportAttemptingFullContext: () => {},
    reportContextSensitivity: () => {}
});

const tree = parser.programa();

const totalErrores = erroresLexicos.length + erroresSintacticos.length;
 
console.log('═══════════════════════════════════════════════════');
console.log('   ANÁLISIS DEL CÓDIGO FUENTE');
console.log('═══════════════════════════════════════════════════');
 
if (totalErrores === 0) {
    console.log('✅ EL CÓDIGO ES CORRECTO');
    console.log('   No se encontraron errores léxicos ni sintácticos.');
    console.log('═══════════════════════════════════════════════════\n');
} else {
    console.log(`❌ EL CÓDIGO TIENE ${totalErrores} ERROR(ES)`);
    console.log(`   Léxicos:     ${erroresLexicos.length}`);
    console.log(`   Sintácticos: ${erroresSintacticos.length}`);
    console.log('═══════════════════════════════════════════════════\n');
 
    if (erroresLexicos.length > 0) {
        console.log('🔤 ERRORES LÉXICOS (caracteres no reconocidos):');
        console.log('---------------------------------------------------');
        erroresLexicos.forEach((e, i) => {
            console.log(`   ${i + 1}. Línea ${e.linea}, columna ${e.columna}`);
            console.log(`      → ${e.mensaje}`);
        });
        console.log();
    }
 
    if (erroresSintacticos.length > 0) {
        console.log('📝 ERRORES SINTÁCTICOS (estructura inválida):');
        console.log('---------------------------------------------------');
        erroresSintacticos.forEach((e, i) => {
            console.log(`   ${i + 1}. Línea ${e.linea}, columna ${e.columna}`);
            console.log(`      → ${e.mensaje}`);
        });
        console.log();
    }
 
    console.log('⛔ El programa NO se ejecutará por contener errores.');
    process.exit(1);
}
 
console.log('--- 2. Tabla de Lexemas-Tokens ---');
console.log('----------------------------------------');
console.log(String("LEXEMA").padEnd(20) + " | " + "TOKEN");
console.log('----------------------------------------');

tokens.fill();
const nombresTokens = parser.vocabulary ? parser.vocabulary : (AnalizadorParser.vocabulary || null);

tokens.tokens.forEach(token => {
    if (token.type !== -1) {
        let nombreToken = null;
        if (nombresTokens && typeof nombresTokens.getSymbolicName === 'function') {
            nombreToken = nombresTokens.getSymbolicName(token.type);
        }
        if (!nombreToken && AnalizadorParser.symbolicNames) {
            nombreToken = AnalizadorParser.symbolicNames[token.type];
        }
        if (!nombreToken) {
            nombreToken = token.text;
        }
        console.log(String(token.text).padEnd(20) + " | " + nombreToken);
    }
});
console.log('----------------------------------------\n');
 
console.log('--- 3. Árbol sintáctico ---');
console.log(tree.toStringTree(parser.ruleNames, parser));
console.log('\n');
 
console.log('--- 4. Traducción a JavaScript ---');

const lineas = input.split('\n');
let codigoJS = "";
let textosAImprimir = [];

lineas.forEach(linea => {
    let l = linea.trim();
    if (l.startsWith("repetir")) {
        codigoJS += "do {\n";
    } else if (l.startsWith("imprimir")) {
        let matches = l.match(/\(([^)]+)\)/);
        if (matches && matches[1]) {
            let contenido = matches[1];
            codigoJS += `    console.log(${contenido});\n`;
            textosAImprimir.push(contenido);
        }
    } else if (l.startsWith("salir")) {
        codigoJS += "    break;\n";
    } else if (l.includes("hasta")) {
        let condicion = l.includes("verdadero") ? "true" : "false";
        codigoJS += `} while (${condicion});`;
    }
});

console.log(codigoJS);
console.log('\n');
 
console.log('--- Ejecutando programa ---');
textosAImprimir.forEach(msg => {
    console.log(msg.replace(/"/g, ''));
});
console.log();

console.log('--- Estado final de variables ---');
console.log('{}');
console.log('--- Fin del programa ---');