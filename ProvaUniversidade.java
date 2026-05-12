package universidade.prova;

public abstract class ProvaUniversidade {

    protected double notaAV1;
    protected double notaAV2;
    protected double notaAV3;

    protected double pesoAV1;
    protected double pesoAV2;
    protected double pesoAV3;

    protected double mediaMinima;
    protected boolean realizouProvaFinal;

    protected double media;

    public ProvaUniversidade(double notaAV1, double notaAV2, double notaAV3) {
        this.notaAV1 = notaAV1;
        this.notaAV2 = notaAV2;
        this.notaAV3 = notaAV3;
        this.realizouProvaFinal = false;
    }

    public abstract double calcularMedia();

    public abstract ProvaFinalUniversidade getProvaFinalUniversidade();

    public boolean aprovado() {
        return this.media >= this.mediaMinima;
    }

    public double getMedia() { return media; }
    public double getNotaAV1() { return notaAV1; }
    public double getNotaAV2() { return notaAV2; }
    public double getNotaAV3() { return notaAV3; }
    public double getPesoAV1() { return pesoAV1; }
    public double getPesoAV2() { return pesoAV2; }
    public double getPesoAV3() { return pesoAV3; }
    public double getMediaMinima() { return mediaMinima; }
    public boolean isRealizouProvaFinal() { return realizouProvaFinal; }

    public void setNotaAV1(double notaAV1) { this.notaAV1 = notaAV1; }
    public void setNotaAV2(double notaAV2) { this.notaAV2 = notaAV2; }
    public void setNotaAV3(double notaAV3) { this.notaAV3 = notaAV3; }
    public void setRealizouProvaFinal(boolean realizouProvaFinal) {
        this.realizouProvaFinal = realizouProvaFinal;
    }
}
