package InterfacesAula.Dominio;

public class DatabaseLoader implements DataLoader, DataRemove  {

    @Override
    public void Load() {
      System.out.println("carregando banco de dados...");

    }

    @Override
    public void remover(){
      System.out.println("Removendo dados do banco de dados");
    }
    
} 
    

