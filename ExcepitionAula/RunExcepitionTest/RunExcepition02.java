package ExcepitionAula.RunExcepitionTest;

import java.io.IOException;

public class RunExcepition02 {
    public static void main(String[] args) {
       abreConcecao();
    }
    private static String abreConcecao(){
         try{
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo arquivo");
         return "conecaoAberta";    
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            System.out.println("fechando arquivo");
        }
        return "conecaoPerdida";
    }
}
