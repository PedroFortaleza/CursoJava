package Exercicios.Dominio;

public class Aluno {
    private String nome; 
    private String idade;
    private String turma; 

    public Aluno(String nome, String idade, String turma){
        this.nome = nome; 
        this.idade = idade;
        this.turma = turma;
    }
    public void Imprime(){
        System.out.println("Aluno: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Turma: "+ this.turma);
    }
    public String getIdade() {
        return idade;
    }
    public void setIdade(String idade) {
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTurma() {
        return turma;
    }
    public void setTurma(String turma) {
        this.turma = turma;
    }
}
