package Polimofismo.Servico;

import Polimofismo.Dominio.Computador;
import Polimofismo.Dominio.Produto;
import Polimofismo.Dominio.Tomate;

public class CalculadoraImposto {
   

    public static void calcularImposto(Produto produto){
        double imposto = produto.calcularImposto();
        System.out.println("Relatorio do produto: ");
        System.out.println("Produt: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Valor do imposto: " + imposto);
        if (produto instanceof Tomate){
        Tomate tomate = (Tomate) produto;
        System.out.println(tomate.getDataValidadeTomate());
        }
    }
}
