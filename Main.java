package universidade.prova;

public class ProvaFinalFafifo extends ProvaFinalUniversidade {

    public ProvaFinalFafifo(ProvaUniversidade provaUniversidade) {
        super(provaUniversidade);
        this.pesoProvaFinal = 3;
    }

    @Override
    public boolean habilitadoRealizarProva() {
        return !provaUniversidade.aprovado();
    }

    public double aplicarAV3(double notaAV3) {
        if (!habilitadoRealizarProva()) {
            System.out.println("Aluno ja aprovado - nao pode realizar a AV3.");
            return provaUniversidade.getMedia();
        }
        this.notaProvaFinal = notaAV3;
        this.realizouProva = true;
        ProvaFafifo fafifo = (ProvaFafifo) provaUniversidade;
        return fafifo.calcularMediaComAV3(notaAV3);
    }
}
