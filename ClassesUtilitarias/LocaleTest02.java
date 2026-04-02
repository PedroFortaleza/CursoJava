package ClassesUtilitarias;

import java.text.NumberFormat;
import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        Locale localeG = Locale.GERMANY;
        Locale localeJapan = Locale.JAPAN;
        NumberFormat[ ] numberFormats = new NumberFormat[3];
        double valor = 100_000.8743;
        numberFormats[0] = NumberFormat.getInstance();
        numberFormats[1] = NumberFormat.getInstance(localeG);
        numberFormats[2] = NumberFormat.getInstance(localeJapan);
        
        for(NumberFormat number : numberFormats){
            System.out.println(number.format(valor));
        }
        
    }
}
