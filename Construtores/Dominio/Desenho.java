package Construtores.Dominio;

public class Desenho {
    public String nome;
    public String ep;
    
    
    public void imprime() {
        System.out.println(nome);
        System.out.println(ep);
    }


    public void SetNome (String nome) {
        this.nome = nome;
    }
    public String GetNome() {
        return nome;
    }
    public void SetEp (String ep){
        this.ep = ep;
    }
    public String GetEp(){
        return ep;
    }

}
