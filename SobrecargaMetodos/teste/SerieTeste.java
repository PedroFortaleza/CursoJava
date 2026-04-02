package SobrecargaMetodos.teste;

import SobrecargaMetodos.Dominio.Serie;

public class SerieTeste {
    public static void main(String[] args) {
        Serie serie1 = new Serie();
        serie1.nome = "Vikings";
        serie1.episodios = "120";
        serie1.imprime();
    }
}
