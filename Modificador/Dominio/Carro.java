package Modificador.Dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    public static double velocidadeLimite;

    public Carro(String nome, double velocidadeMaxima, double velocidadeLimite){
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeLimite = velocidadeLimite;
    }

    public void imprime() {
        System.out.println("Marca: " + nome);   
        System.out.println("Velocidade Máxima: " + velocidadeMaxima);   
        System.out.println("Velocidade Limite " + Carro.velocidadeLimite);   
     }

    public void SetNome (String nome) {
        this.nome = nome;
    }
    public String GetNome () {
        return nome;
    }
     public void SetVelocidadeMaxima (double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
    public double GetVelocidadeMaxima () {
        return velocidadeMaxima;
    }
 
}
