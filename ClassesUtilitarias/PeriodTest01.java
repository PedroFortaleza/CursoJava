package ClassesUtilitarias;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate agora = LocalDate.now();
        LocalDate daquiADoisAnos = LocalDate.now().plusYears(2);
        Period p1 = Period.between(agora, daquiADoisAnos);
        System.out.println(p1);
    }
}
