package InterfacesAula.Teste;

import InterfacesAula.Dominio.DatabaseLoader;
import InterfacesAula.Dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
       DatabaseLoader databaseLoader = new DatabaseLoader(); 
       FileLoader fileLoader = new FileLoader(); 

       fileLoader.Load();
       databaseLoader.Load();
       fileLoader.remover();
       databaseLoader.remover();

       fileLoader.checkPermision();
       databaseLoader.checkPermision();
    }
}
