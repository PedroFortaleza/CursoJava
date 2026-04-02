package Polimofismo.teste;

import Polimofismo.Repositorio.Repositorio;
import Polimofismo.Servico.RepositorioBancoDeDados;

public class RepositorioTeste {
    public static void main(String[] args) {
        
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
    }
}
