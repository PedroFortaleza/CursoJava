package ClassesUtilitarias;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Localeteste {
    public static void main(String[] args) {
        Locale localeJapao = new Locale("ja", "JP");
        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);
        System.out.println(df1.format(calendar));
    }
   
}
