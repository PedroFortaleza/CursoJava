package Exercicios.Dominio;

public class Professor {
    private String nome; 
    private Materia materia;

    public Professor(String nome, Materia materia){
        this.nome = nome; 
        this.materia = materia;
    }
    public void Imprime(){
        System.out.println("Professor: " + nome);
        System.out.println("Materia: " + materia.getNome());
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
