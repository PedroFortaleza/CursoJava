package SobrecargaMetodos.Dominio;

public class Serie {
    public String nome; 
    public String episodios;



    public void imprime() {
        System.out.println(nome);
        System.out.println(episodios);
    }
    
    public void SetNome (String nome) {
        this.nome = nome;
    }
    public String GetNome() {
        return this.nome;
    }
    public void SetEp (String episodios) {
        this.episodios = episodios;
    }
    public String GetEp() {
        return this.episodios;
    }

}
