package ClassesAbstratas.Dominio;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, Double salario) {
        super(nome, salario);
       
    }

    @Override
    public String toString() {
        
        return "Desenvolvedor: "  + nome + " salario: " + salario;
    }
    @Override
    public void CalcularBonus() {
        
        
    }
    
}
