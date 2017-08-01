package CalendarData;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import javafx.util.Duration;

/**
 *
 * @author anggomez1
 */
public class TestLocalDate {

    public static void main(String[] args) {
        //Creando un LocalDate
        LocalDate date1 = LocalDate.of(2015, 12, 27);
        System.out.println(date1);
        LocalDate date2 = LocalDate.of(2015, Month.SEPTEMBER, 19);
        System.out.println(date2);

        //Obtener la fecha del sistema
        LocalDate date3 = LocalDate.now();
        System.out.println("Fecha actual del sistema: " + date3);

        //Convertir a un formato String, siempre debe ser 9999-99-99, año, mes, dia de lo contrario saldra un java.time.format.DateTimeParseException
        LocalDate date4 = LocalDate.parse("2016-01-11");
        System.out.println("Convertir a String: " + date4);
        //Dia de la semana, del mes, del año.
        System.out.println("Dia de la semana: " + date4.getDayOfWeek());
        System.out.println("Dia del mes: " + date4.getDayOfMonth());
        System.out.println("Dia del año: " + date4.getDayOfYear());

        //Comparación de fechas antes y después.
        LocalDate angela = LocalDate.parse("2016-09-19", DateTimeFormatter.ISO_DATE);
        System.out.println("aaaaaaa: " + angela);
        LocalDate martina = LocalDate.parse("2016-02-10");
        System.out.println("Es antes: " + angela.isBefore(martina));
        System.out.println("Es después: " + angela.isAfter(martina));

        //Menos dias, semanas, meses, años.
        LocalDate bday = LocalDate.of(2052, 03, 10);
        System.out.println(bday.minusDays(10));
        System.out.println(bday.minusMonths(2));
        System.out.println(bday.minusWeeks(30));
        System.out.println(bday.minusYears(1));

        //Mas días, semanas, meses, años.
        LocalDate launchCompany = LocalDate.parse("2015-01-01").minusDays(1).minusMonths(1).plusYears(1);
        System.out.println("qqq" + launchCompany);
        System.out.println("Plus Days: " + launchCompany.plusDays(1));
        System.out.println("Plus Months: " + launchCompany.plusMonths(1));
        System.out.println("Plus Weeks: " + launchCompany.plusWeeks(7));
        System.out.println("Plus Years: " + launchCompany.plusYears(1));

        //With Reemplaza el valor en la fecha que se le pase por parámetro.
        LocalDate firstSex = LocalDate.of(2036, 02, 28);
        System.out.println(firstSex.withDayOfMonth(1));//devolvera 2036-02-01
        System.out.println("With: " + firstSex.withDayOfYear(4));//devolvera 2036-02-04
        System.out.println(firstSex.withMonth(7));//devolvera 2036-07-28
        System.out.println(firstSex.withYear(1));// devolvera 0001-02-28

        //atTime se convina con el LocalDate y muesta la hora LocalDataTime.
        LocalDate interviewDate = LocalDate.of(2016, 02, 28);
        System.out.println("Fecha y hora: " + interviewDate.atTime(16, 30));
        System.out.println("Fecha y hora: " + interviewDate.atTime(16, 30, 20));
        System.out.println("Fecha y hora: " + interviewDate.atTime(16, 30, 20, 300));
        System.out.println("Fecha y hora: " + interviewDate.atTime(LocalTime.of(16, 30)));

    }

    public TestLocalDate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

class fecha {

    public static void main(String args[]) {
        LocalDate dt = LocalDate.parse("2015-01-01").minusMonths(1).minusDays(1).plusYears(1);
        System.out.println("fechaaaa:  " + dt);
        
        Duration d = Duration.millis(0);
        
        
        //System.out.println("Formato: " +  LocalDate.of(2015, Month.APRIL, 13).format(DateTimeFormatter.ISO_DATE_TIME));

    }

}
