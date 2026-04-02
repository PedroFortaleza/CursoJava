package Herança.teste;

import Herança.dominio.Endereco;
import Herança.dominio.Funcionario;
import Herança.dominio.Pessoa;

public class Heranca {
    public static void main(String[] args) {
        
        Endereco endereco1 = new Endereco();
        Endereco endereco2 = new Endereco();
        Pessoa pessoa = new Pessoa("pedro", "000000", endereco1);
        Funcionario funcionario = new Funcionario("pedro lucas" , "99999999", endereco2, 2000.0);
        
        endereco1.SetCep("77018571");
        endereco2.SetCep("9090909099");
        pessoa.Imprime();
        System.out.println("--------------------");
        funcionario.Imprime();




        

    }
}
