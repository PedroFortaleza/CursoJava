package Polimofismo.teste;

import Polimofismo.Dominio.Tomate;
import Polimofismo.Servico.CalculadoraImposto;

public class ProdutoTeste03 {
    public static void main(String[] args) {
        
        Tomate tomate = new Tomate("Frances", 2.0);
        tomate.setDataValidadeTomate("21/02/2045");
        CalculadoraImposto.calcularImposto(tomate);
    }
}
