package ExercicioFacul.Dominio;

public class Autor {
    private String nome;
    private Livro livroAutor; 


    public Autor(String nome, Livro livroAutor){
        this.nome = nome;
        this.livroAutor = livroAutor;

    }



    public void Imprime(){
        System.out.println(this.nome);
        System.out.println();
    }
    

    public Livro getLivroAutor() {
        return livroAutor;
    }
    public void setLivroAutor(Livro livroAutor) {
        this.livroAutor = livroAutor;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

}
