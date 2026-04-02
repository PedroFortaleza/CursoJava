package ClassesUtilitarias;

public class StringDesempenho {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(100);
        long fim = System.currentTimeMillis();
        System.out.println("O tempo que a String levou " +  (fim - inicio) + "ms" );

        inicio = System.currentTimeMillis();
        concatStringBuilder(100);
        fim = System.currentTimeMillis();
        System.out.println("O tempo que a StringBuilder levou " +  (fim - inicio) + "ms" );

        inicio = System.currentTimeMillis();
        concatStringBuffer(100);
        fim = System.currentTimeMillis();
        System.out.println("O tempo que a StringBuffer levou " +  (fim - inicio) + "ms" );

    
    }

    private static void concatString(int tamanho){
        String texto = "";
        for(int i = 0; i < tamanho ; i++){
            texto += i;
        }
    }

    private static void concatStringBuilder(int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);
        for(int i = 0; i < tamanho; i++){
            sb.append(i);
        }
    }
        
    private static void concatStringBuffer(int tamanho){
        StringBuffer sf = new StringBuffer(tamanho);
        for(int i = 0; i < tamanho; i++){
            sf.append(i);
        }
    }
}

