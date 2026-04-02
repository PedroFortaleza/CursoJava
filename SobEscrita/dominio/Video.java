package SobEscrita.dominio;

public class Video {
    private String nome;

    public Video(String nome){
        this.nome = nome; 
    }

    @Override
    public String toString() {
        
        return "Vídeo " + this.nome;
    }
    
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
}
