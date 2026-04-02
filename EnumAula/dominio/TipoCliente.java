package EnumAula.dominio;

public enum TipoCliente{
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    private int valor;
    private String relatorio;

    TipoCliente(int valor, String relatorio){
        this.valor = valor;
        this.relatorio = relatorio;
    }
    public int getValor() {
        return valor;
    }
    public String getRelatorio() {
        return relatorio;
    }
   

    
}