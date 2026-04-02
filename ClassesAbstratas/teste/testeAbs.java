package ClassesAbstratas.teste;

import ClassesAbstratas.Dominio.Desenvolvedor;
import ClassesAbstratas.Dominio.Gerente;

public class testeAbs {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Lauan", 2000.0);
        System.out.println(gerente);

        Desenvolvedor desenvolvedor = new Desenvolvedor("Pedro Lucas", 10000.0);
        System.out.println(desenvolvedor);
    }
}
