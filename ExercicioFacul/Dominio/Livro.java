package ExercicioFacul.Dominio;

public class Livro {
    private String nome;
    private String paginas; 

    public Livro(String nome, String paginas){
        this.nome = nome; 
        this.paginas = paginas;
    }

    public void Imprime(){
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getPaginas() {
        return paginas;
    }
    public void setPaginas(String paginas) {
        this.paginas = paginas;
    }

}
