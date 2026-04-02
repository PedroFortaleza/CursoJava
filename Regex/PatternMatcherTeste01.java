package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste01 {
    public static void main(String[] args) {
        // \d busca digitos e 
        // \D busca tudo oq n é digito
        // \s busca caracteres em branco 
        // \S busca caracteres exlucindo os brancos
        // \w tudo que for de A a Z, digitos
        // \W tudo o que não for de A a Z e digitos

        String regex = "ABA";
        String texto = "ABABABAB";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        while(matcher.find()){
            System.out.println(matcher.start());
        }
    }
}
