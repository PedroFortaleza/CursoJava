package Exercicios.Teste;

import Exercicios.Dominio.Aluno;
import Exercicios.Dominio.Materia;
import Exercicios.Dominio.Professor;

public class AlunoTeste {
    public static void main(String[] args) {
       Aluno aluno = new Aluno("Pedro", "19", "2024/01");
       Materia materia = new Materia("Geografia");
       Professor professor = new Professor("Fabão", materia);

       aluno.Imprime(); 
       professor.Imprime();

       

    }
}
