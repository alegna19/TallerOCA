
package basics;

/**
 *
 * @author anggomez1
 */
public class Preincremento {
   int a = 20;
   int b = 10;
   int c = a - ++b;// Asigna el valor a la variable y opera.
   
    public static void main(String[] args){
        Preincremento preincremento = new Preincremento();
        System.out.println("Valor de C: " + preincremento.c);
        System.out.println("Valor de B: " + preincremento.b);
    }
   
}
