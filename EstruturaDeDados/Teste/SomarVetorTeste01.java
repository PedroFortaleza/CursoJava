package EstruturaDeDados.Teste;

import EstruturaDeDados.Dominio.SomarVetor;

public class SomarVetorTeste01 {
    public static void main(String[] args) {
        Integer[] vetor = new Integer[4];
        SomarVetor somarVetor = new SomarVetor(vetor, 0);
        somarVetor.LerNumeros();
        somarVetor.Somar();
    }
}
