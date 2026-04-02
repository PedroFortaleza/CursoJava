package InterfacesAula.Dominio;

public interface DataLoader {
    public abstract void Load();
    default void checkPermision(){
        System.out.println("Fazendo checagem de permissoes");
    }
} 
