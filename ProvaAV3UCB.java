package universidade.prova;

public class ProvaAV3UCB extends ProvaFinalUniversidade {

    public ProvaAV3UCB(ProvaUniversidade provaUniversidade) {
        super(provaUniversidade);
        this.pesoProvaFinal = 1;
    }

    @Override
    public boolean habilitadoRealizarProva() {
        return true;
    }

    public double aplicarAV3(double notaAV3) {
        this.notaProvaFinal = notaAV3;
        this.realizouProva = true;
        universidade.prova.ProvaUCB ucb = (ProvaUCB) provaUniversidade;
        return ucb.calcularMediaComAV3(notaAV3);
    }
}
