package Polimofismo.Dominio;

public class Tomate extends Produto{
    public String dataValidadeTomate;

    public static final double IMPOSTO_POR_CENTO = 0.06;
    public Tomate(String nome, Double valor){
        super(nome, valor);
    }
    public void dataValidade(String dataValidadeTomate){
        this.dataValidadeTomate = dataValidadeTomate;
    }
     @Override
     public double calcularImposto(){
    
        return this.valor * IMPOSTO_POR_CENTO;
     };

     @Override
     public String getNome() {
         // TODO Auto-generated method stub
         return super.getNome();
     }
     @Override
     public Double getValor() {
         // TODO Auto-generated method stub
         return super.getValor();
     }
     public void setDataValidadeTomate(String dataValidadeTomate) {
         this.dataValidadeTomate = dataValidadeTomate;
     }
     public String getDataValidadeTomate() {
         return dataValidadeTomate;
     }
     
}
