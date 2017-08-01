package CalendarData;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author anggomez1
 */
public class TestLocalTime {

    public static void main(String[] args) {
        

        boolean b = false;
        boolean b1 = false;
        char ch = 10;
        if(b !=b1){
            System.out.println("");
        }
        System.out.println(b!=b1);


        /**
         * Period
         */
        Period period = Period.of(1, 2, 7); //Un año, dos meses y 7 días.
        System.out.println("Año, Mes y Día: " + period);//Result P1Y2M7D

        //Periodo de Años
        Period period2 = Period.ofYears(2);
        System.out.println("Años: " + period2);//P2y

        //Periodo de meses.
        Period period3 = Period.ofMonths(5);
        System.out.println("Meses: " + period3);

        //Periodo de semanas.
        Period period4 = Period.ofWeeks(10);
        System.out.println("Semanas: " + period4);
        //Periodo de días.
        Period period5 = Period.ofDays(15);
        System.out.println("Días: " + period5);

        Period period6 = Period.ofDays(-15);
        System.out.println("Menos Quince días: " + period6);//P-15D

        //Parse representa P, Y, M, D, and W) en Mayus.
        Period p5Yrs1 = Period.parse("P5y");
        Period p5Yrs2 = Period.parse("p5y");
        System.out.println(p5Yrs1 + ":" + p5Yrs2);

        //Between.period = end date – start date.
        LocalDate carnivalStart = LocalDate.of(2015, 8, 21);
        LocalDate carnivalEnd = LocalDate.of(2016, 1, 2);

        Period periodBetween = Period.between(carnivalEnd, carnivalStart);
        System.out.println("Período Between: " + periodBetween);

        //GET
        Period period7 = Period.of(2, 4, 40);
        System.out.println("perioddd" + period7.getYears());//dos años, 4 meses y 40 dias
        System.out.println(period7.getMonths());
        System.out.println(period7.getDays());

        //isNegative aplica cuando alguna de las 3 usa un valor negativo, devuelve true.
        Period days5 = Period.of(0, 0, -5);
        System.out.println("isNegative: " + days5.isNegative());

        //isZero aplica cuando las 3 usan valor cero.devuelve un true
        Period days6 = Period.of(0, 0, 0);
        System.out.println("isZero: " + days6.isZero());
    }

}
