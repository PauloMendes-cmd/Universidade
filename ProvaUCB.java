package universidade.prova;

public class ProvaUCB extends ProvaUniversidade {

    public ProvaUCB(double notaAV1, double notaAV2) {
        super(notaAV1, notaAV2, 0.0);
        this.pesoAV1 = 1;
        this.pesoAV2 = 1;
        this.pesoAV3 = 1;
        this.mediaMinima = 7.0;
    }

    @Override
    public double calcularMedia() {
        this.media = (notaAV1 * pesoAV1 + notaAV2 * pesoAV2) / (pesoAV1 + pesoAV2);
        return this.media;
    }

    public double calcularMediaComAV3(double notaAV3) {
        this.notaAV3 = notaAV3;
        this.realizouProvaFinal = true;

        if (notaAV1 <= notaAV2) {
            notaAV1 = notaAV3;
        } else {
            notaAV2 = notaAV3;
        }

        this.media = (notaAV1 * pesoAV1 + notaAV2 * pesoAV2) / (pesoAV1 + pesoAV2);
        return this.media;
    }

    @Override
    public universidade.prova.ProvaFinalUniversidade getProvaFinalUniversidade() {
        return new ProvaAV3UCB(this);
    }
}
