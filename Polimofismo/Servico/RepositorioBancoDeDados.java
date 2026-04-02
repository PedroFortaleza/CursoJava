package Polimofismo.Servico;

import Polimofismo.Repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio{
    @Override
    public void salvar(){
        System.out.println("Salvando em Banco de dados");
    };
}
