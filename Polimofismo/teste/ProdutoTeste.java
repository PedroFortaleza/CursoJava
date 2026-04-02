package Polimofismo.teste;

import Polimofismo.Dominio.Computador;
import Polimofismo.Dominio.Televisao;
import Polimofismo.Dominio.Tomate;
import Polimofismo.Servico.CalculadoraImposto;

public class ProdutoTeste {
    public static void main(String[] args) {
        Computador computador = new Computador("Nitro 5", 5500.0);
        Tomate tomate = new Tomate("Tomate chines", 12.0);
        Televisao televisao = new Televisao("Sansung", 1800.0);
        
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("---------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("---------------------------");
        CalculadoraImposto.calcularImposto(televisao);
        
    }   
}
