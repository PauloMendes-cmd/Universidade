package universidade.prova;

public abstract class ProvaFinalUniversidade {

    protected double notaProvaFinal;
    protected double pesoProvaFinal;
    protected boolean realizouProva;
    protected ProvaUniversidade provaUniversidade;

    public ProvaFinalUniversidade(ProvaUniversidade provaUniversidade) {
        this.provaUniversidade = provaUniversidade;
        this.realizouProva = false;
    }

    public abstract boolean habilitadoRealizarProva();

    public double getNotaProvaFinal() { return notaProvaFinal; }
    public double getPesoProvaFinal() { return pesoProvaFinal; }
    public boolean isRealizouProva() { return realizouProva; }
    public ProvaUniversidade getProvaUniversidade() { return provaUniversidade; }

    public void setNotaProvaFinal(double notaProvaFinal) {
        this.notaProvaFinal = notaProvaFinal;
    }
    public void setRealizouProva(boolean realizouProva) {
        this.realizouProva = realizouProva;
    }
}
