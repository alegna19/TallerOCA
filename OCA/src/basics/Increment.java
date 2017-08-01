
package basics;

/**
 *
 * @author anggomez1
 */
public class Increment {
    
    int a = 50;
    int b = 10;
    int c = a - b++;// HAce la resta del valor actual 50 - 10, no incrementa la variable.
    
    public static void main(String[] args){
        Increment increment = new Increment();
        System.out.println("Valor de C: " + increment.c);
        System.out.println("Valor de B: " + increment.b);
    }
}
