package Herança.dominio;

public class Funcionario extends Pessoa{
    private Double salario; 

    public Funcionario (String nome, String cpf, Endereco endereco, Double salario){
        super(nome, cpf, endereco);
        this.salario = salario;
       
    }

    public void Imprime(){
        super.Imprime();
        System.out.println(this.salario);
    }

    public void SetSalario(Double salario){
        this.salario = salario;
    }
    public Double GetSalario(){
        return salario;
    }
}
