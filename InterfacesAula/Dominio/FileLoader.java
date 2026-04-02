package InterfacesAula.Dominio;

public class FileLoader implements DataLoader, DataRemove {

    @Override
    public void Load() {
        System.out.println("Carregando arquivos...");
    }
    @Override
    public void remover(){
      System.out.println("Removendo dados do banco de dados");
    }
}
