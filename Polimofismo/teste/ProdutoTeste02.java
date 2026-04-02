package Polimofismo.teste;

import Polimofismo.Dominio.Computador;
import Polimofismo.Dominio.Produto;
import Polimofismo.Servico.CalculadoraImposto;

public class ProdutoTeste02 {
    public static void main(String[] args) {
        Produto produto1 = new Computador("Lenovo Spire", 1500.0);
        
        System.out.println("Computador: "+produto1.getNome());
        System.out.println("Valor: " + produto1.getValor());
        System.out.println("Valor total com imposto: "+ ((produto1.calcularImposto()) + produto1.getValor()));
    }
}
