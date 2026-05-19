import AnalizadorVisitor from './AnalizadorVisitor.js';

class AnalizadorTranslatorImpl extends AnalizadorVisitor {
    constructor() {
        super();
        this.indent = 0;
    }

    pad() {
        return '    '.repeat(this.indent);
    }

    visitPrograma(ctx) {
        if (ctx.instruccion_list) {
            return ctx.instruccion_list()
                .map(inst => this.visit(inst))
                .join('\n');
        }
        return "";
    }

    visitInstruccion(ctx) {
        if (ctx.repeticion()) {
            return this.visit(ctx.repeticion());
        }
        return "";
    }

    visitRepeticion(ctx) {
        const sangriaActual = this.pad();
        this.indent++;
        
        let cuerpo = "";
        if (ctx.sentencia_list) {
            cuerpo = ctx.sentencia_list()
                .map(snt => this.visit(snt))
                .join('\n');
        }
        
        this.indent--;
        const cond = this.visit(ctx.condicion());
        
        return `${sangriaActual}do {\n${cuerpo}\n${sangriaActual}} while (!(${cond}));`;
    }

    visitSentencia(ctx) {
        if (ctx.salida_list && ctx.salida_list().length > 0) {
            return ctx.salida_list()
                .map(sal => this.visit(sal))
                .join('\n');
        } else if (ctx.terminar && ctx.terminar()) {
            return this.visit(ctx.terminar());
        }
        return "";
    }

    visitSalida(ctx) {
        const texto = ctx.CADENA().getText();
        return `${this.pad()}console.log(${texto});`;
    }

    visitTerminar(ctx) {
        return `${this.pad()}break;`;
    }

    visitCondicion(ctx) {
        const texto = ctx.getText();
        return texto === 'verdadero' ? 'true' : 'false';
    }
}

export default AnalizadorTranslatorImpl;