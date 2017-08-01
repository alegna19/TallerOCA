
package Exceptions;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author anggomez1
 */
public class ExepArimetic {
    
     public static void main(String... $n) {
         
         double d1 = 10.0;
         int i = 10;
         d1=i;
         
         long l = 105l;
         float f = i;
         
         int ans = 0;
         try {
              ans = 7/0;
         }catch(ArithmeticException e){
              ans =0;
         }
         System.out.println(ans);
         
         LocalDateTime l1 = LocalDateTime.now();
         LocalDate l2 = LocalDate.of(2016, 12, 22);
        LocalDateTime l3 = LocalDateTime.parse("2016-12-22T06:43" , DateTimeFormatter.ISO_DATE_TIME);
         System.out.println(l1);
         System.out.println(l2.format(DateTimeFormatter.ISO_DATE_TIME));
         //System.out.println(l3);
     }
     
    
}
