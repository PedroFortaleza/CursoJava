package EstruturaDeDados.Dominio;

import java.util.Scanner;

public class SomarVetor {
    private Integer[] numeros;
    private Integer somar; 

    public SomarVetor(Integer[] numeros, Integer somar){
        this.numeros = numeros;
        this.somar = somar;
    }
    public void Somar(){
        for(int i = 0; i < numeros.length; i++){
            somar += numeros[i];
        }
        System.out.println("Resultado do vetor somado: " + somar);
    }

    public void LerNumeros(){
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < numeros.length; i++)
        {
            System.out.println("Digite o numero da posição " + i + ":");
            numeros[i] = scanner.nextInt();
        }
        
    }

    public Integer[] getNumeros() {
        return numeros;
    }
    public void setNumeros(Integer[] numeros) {
        this.numeros = numeros;
    }
    public Integer getSomar() {
        return somar;
    }
    public void setSomar(Integer somar) {
        this.somar = somar;
    }

}

