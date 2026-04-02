package Polimofismo.Dominio;

public class Computador extends Produto {

    public static final double IMPOSTO_POR_CENTO = 0.21;

    public Computador(String nome, Double valor){
        super(nome, valor);
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
    
}
