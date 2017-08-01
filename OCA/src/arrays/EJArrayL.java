package arrays;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.time.*;
import javafx.util.converter.LocalDateTimeStringConverter;
 import  java.lang.System.*;

/**
 *
 * @author anggomez1
 */
public class EJArrayL {
    
 
    public static void main(String... _n) {
       int k = 0;
       int m = 0;
       for(int i=0; i<=3; i++){
           k++;
           if(i==2){
               i=4;
           }
           m++;
       }
        System.out.println(k + ", " + m);
    }
}
