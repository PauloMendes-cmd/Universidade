package universidade.prova;

public class ProvaFafifo extends ProvaUniversidade {

    public ProvaFafifo(double notaAV1, double notaAV2) {
        super(notaAV1, notaAV2, 0.0);
        this.pesoAV1 = 1;
        this.pesoAV2 = 1;
        this.pesoAV3 = 3;
        this.mediaMinima = 6.0;
    }

    @Override
    public double calcularMedia() {
        double somaPesos = pesoAV1 + pesoAV2 + pesoAV3;
        this.media = (notaAV1 * pesoAV1 + notaAV2 * pesoAV2 + notaAV3 * pesoAV3) / somaPesos;
        return this.media;
    }

    public double calcularMediaComAV3(double notaAV3) {
        this.notaAV3 = notaAV3;
        this.realizouProvaFinal = true;
        return calcularMedia();
    }

    @Override
    public ProvaFinalUniversidade getProvaFinalUniversidade() {
        return new ProvaFinalFafifo(this);
    }
}
