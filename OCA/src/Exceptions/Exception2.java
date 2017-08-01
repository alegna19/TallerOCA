package Exceptions;

import java.io.IOException;

/**
 *
 * @author anggomez1
 */
public class Exception2 {

    public void test() throws IOException {
        System.out.println("test");
        throw new ArithmeticException();

    }

    public static void main(String[] arg) throws IOException {
        Exception2 e = new Exception2();
        e.test();

    }

}

class Ex1 {

    public static void main(String[] arg) {
        int a[] = {1, 2, 053, 4};
        int b[][] = {{1, 2, 4}, {2, 2, 1}, {0, 43, 2}};
        System.out.println(a[3] == b[0][2]);
        System.out.println(" " + (a[2] == b[2][1]));

    }
}
