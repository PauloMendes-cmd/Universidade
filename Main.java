package universidade.prova.teste;

import universidade.prova.ProvaAV3UCB;
import universidade.prova.ProvaFafifo;
import universidade.prova.ProvaFinalFafifo;
import universidade.prova.ProvaUCB;

public class Main {

  public static void main(String[] args) {

    System.out.println("=== UCB ===");

    ProvaUCB ucb = new ProvaUCB(6.0, 5.0);

    System.out.printf("AV1 = %.1f (peso %.0f)%n", ucb.getNotaAV1(), ucb.getPesoAV1());
    System.out.printf("AV2 = %.1f (peso %.0f)%n", ucb.getNotaAV2(), ucb.getPesoAV2());
    System.out.printf("Media minima: %.1f%n", ucb.getMediaMinima());

    ucb.calcularMedia();
    System.out.printf("Media calculada: %.2f%n", ucb.getMedia());
    System.out.printf("Situacao: %s%n%n", ucb.aprovado() ? "APROVADO" : "REPROVADO");

    ProvaAV3UCB av3UCB = (ProvaAV3UCB) ucb.getProvaFinalUniversidade();
    System.out.printf("Habilitado para AV3: %s%n", av3UCB.habilitadoRealizarProva() ? "Sim" : "Nao");
    av3UCB.aplicarAV3(9.0);
    System.out.printf("Apos AV3 (9.0) - nova media: %.2f%n", ucb.getMedia());
    System.out.printf("Situacao final: %s%n%n", ucb.aprovado() ? "APROVADO" : "REPROVADO");

    System.out.println("=== FAFIFO ===");

    ProvaFafifo fafifo = new ProvaFafifo(4.0, 5.0);

    System.out.printf("AV1 = %.1f (peso %.0f)%n", fafifo.getNotaAV1(), fafifo.getPesoAV1());
    System.out.printf("AV2 = %.1f (peso %.0f)%n", fafifo.getNotaAV2(), fafifo.getPesoAV2());
    System.out.printf("Peso AV3 = %.0f%n", fafifo.getPesoAV3());
    System.out.printf("Media minima: %.1f%n", fafifo.getMediaMinima());

    fafifo.calcularMedia();
    System.out.printf("Media calculada: %.2f%n", fafifo.getMedia());
    System.out.printf("Situacao: %s%n%n", fafifo.aprovado() ? "APROVADO" : "REPROVADO");

    ProvaFinalFafifo av3Fafifo = (ProvaFinalFafifo) fafifo.getProvaFinalUniversidade();
    System.out.printf("Habilitado para AV3: %s%n", av3Fafifo.habilitadoRealizarProva() ? "Sim" : "Nao");
    av3Fafifo.aplicarAV3(8.0);
    System.out.printf("Apos AV3 (8.0) - nova media: %.2f%n", fafifo.getMedia());
    System.out.printf("Situacao final: %s%n", fafifo.aprovado() ? "APROVADO" : "REPROVADO");
  }
}
