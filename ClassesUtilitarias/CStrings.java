package ClassesUtilitarias;

public class CStrings {
    public static void main(String[] args) {
        String nome = "piroka";
        String nome1 = "piroka";
        String nome3 = new String("piroka");
        System.out.println(nome == nome3.intern());
        System.out.println(nome.length()); // fala o tamanho da String
        System.out.println(nome.charAt(2)); // fala a letra da posição que vc colocou
        System.out.println(nome.trim());// tira os espaços em brancos no começo e depois 
        System.out.println(nome.toLowerCase());// deixa tudo minusculo 
        System.out.println(nome.toUpperCase());// deixa tudo maiusculo 
    }
}
