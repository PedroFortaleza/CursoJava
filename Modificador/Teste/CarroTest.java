package Modificador.Teste;

import Modificador.Dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        
        Carro c1 = new Carro("BMW" , 280, 250);
        Carro c2 = new Carro("Mustang" , 300, 250);
        Carro.velocidadeLimite = 180;
        c1.imprime();
        c2.imprime();
        
    }
}
