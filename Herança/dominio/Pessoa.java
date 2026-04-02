package Herança.dominio;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    public Pessoa (String nome, String cpf, Endereco endereco){
        this.nome = nome; 
        this.cpf = cpf; 
        this.endereco = endereco;
    }

    public void Imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.GetCep());
    }

    public void SetNome(String nome){
        this.nome = nome;
    }
    public String GetNome(){
        return nome;
    }
    public void SetCpf(String cpf){
        this.cpf = cpf;
    }
    public String GetCpf(){
        return cpf;
    }
    public void SetEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    public Endereco GetEndereco(){
        return endereco;
    }
}
