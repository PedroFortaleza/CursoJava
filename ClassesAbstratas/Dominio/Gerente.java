package ClassesAbstratas.Dominio;

public class Gerente extends Funcionario{

    public Gerente(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        
        return "Gerente : " + nome + " " + "Salario: " + salario;
    }
    @Override
    public void CalcularBonus() {
     
        
    }



}
