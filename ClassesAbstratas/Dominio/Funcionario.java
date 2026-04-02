package ClassesAbstratas.Dominio;

public abstract class Funcionario {
    //a classe serve basicamente para ser classe mãe e ser herdada em outras classes
    protected String nome; 
    protected Double salario; 

    public Funcionario(String nome, Double salario){
        this.nome = nome; 
        this.salario = salario;
        CalcularBonus();
    }
    public abstract void CalcularBonus();
}
