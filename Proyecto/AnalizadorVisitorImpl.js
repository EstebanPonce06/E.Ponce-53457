import AnalizadorVisitor from './AnalizadorVisitor.js';

class AnalizadorVisitorImpl extends AnalizadorVisitor {
    constructor() {
        super();
        this.memoria = {}; 
    }

    visitPrograma(ctx) {
        if (ctx.instruccion_list) {
            ctx.instruccion_list().forEach(inst => this.visit(inst));
        }
        return null;
    }

    visitRepeticion(ctx) {
        do {
            if (ctx.sentencia_list) {
                ctx.sentencia_list().forEach(snt => this.visit(snt));
            }
        } while (!this.visit(ctx.condicion()));

        return null;
    }

    visitCondicion(ctx) {
        const texto = ctx.getText();
        return texto === 'verdadero';
    }

    visitSentencia(ctx) {
        if (ctx.salida_list && ctx.salida_list().length > 0) {
            ctx.salida_list().forEach(sal => this.visit(sal));
        } else if (ctx.terminar && ctx.terminar()) {
            this.visit(ctx.terminar());
        }
        return null;
    }

    visitSalida(ctx) {
        let texto = ctx.CADENA().getText();
        texto = texto.substring(1, texto.length - 1);
        console.log(texto);
        return null;
    }

    visitTerminar(ctx) {
        console.log("-> Se ejecutó la sentencia de salida (salir).");
        return null;
    }
}

export default AnalizadorVisitorImpl;