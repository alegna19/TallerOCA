package Exceptions;

/**
 *
 * @author anggomez1
 */
public class DoSomething {

    public void go() {
        System.out.println("A");
        try {
            stop();
        } catch (ArithmeticException e) {
            System.out.println("B");
        } finally {
            System.out.println("C");
        }
        System.out.println("D"); // Esto no se imprime por que no entro al catch correcto, si fuera NullPointer se atrapa la exception correcta y se imprime.
    }

    public void stop() {
        System.out.println("E");
        Object x = null;
        x.toString();
        System.out.println("F");
    }

    public static void main(String[] args) {
        new DoSomething().go();
    }
}
