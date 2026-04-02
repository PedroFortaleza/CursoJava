package ExcepitionAula.ExcepitionTest;

import java.io.File;
import java.io.IOException;

public class ExcepitonTeste {
    public static void main(String[] args) {
        criarArquivo();
    }

    public static void criarArquivo(){
    File file = new File("SobEscrita\\Teste.txt");
    try{
        Boolean isCriado = file.createNewFile();
        System.out.println("Arquivo criado "+isCriado);
    }catch(IOException e){
        e.printStackTrace();
    }

    }
}
