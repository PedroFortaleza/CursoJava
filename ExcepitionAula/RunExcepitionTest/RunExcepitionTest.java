package ExcepitionAula.RunExcepitionTest;

public class RunExcepitionTest {
    public static void main(String[] args)  throws IllegalArgumentException {
        DividirDoisNumeros(2, 0);
        
    }
    public static int DividirDoisNumeros(int a , int b) throws IllegalArgumentException{
        if(b == 0){
            throw new IllegalArgumentException("argumento ilegal");
        }
        return a/b;
    }
}
