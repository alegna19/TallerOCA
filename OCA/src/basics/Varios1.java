package basics;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.Integer.*;
import java.util.ArrayList.*;

/**
 *
 * @author anggomez1
 */
public class Varios1 {

    float y = 32.34_567f;
    double r = 3.44;

    Varios1() {
        int a = Integer.MIN_VALUE;
        int r = a;
        //return 0.0f;
    }

    int[] a = {10, 20};
    float f = -123;
    short s = 12;
    private double side = 0;
    int z = 10;
    double d = 30.4;

    public static void main(String[] args) {

        Varios1 v = new Varios1();
        int s = v.z + (int) v.d;
        int[] a = null;
        char c = 'c';
        c++;

        System.out.println("Char: " + c);
        System.out.println("Suma int mas double: " + s);

        String[] str = new String[]{};
        String[][] str1 = new String[][]{{"cat"}, {"dog"}};
        String[] sA = {new String("ad")};
        //String[] sB = new String[1]{"aaa"};

        Integer i = new Integer(1);
        Long m = new Long(1);
        if (i.equals(m)) {
            System.out.println("equeal");
        } else {
            System.out.println("not equal");
        }
    }

}

class A {

}

class AA extends A {

}

class Test {

    public static void main(String[] args) {
        A a = new A();
        AA aa = new AA();
        a = aa;
        System.out.println("a= " + a.getClass());
        System.out.println("aa= " + aa.getClass());
    }
}

class Bucle {

    public static void main(String[] args) {
        int i = 1, j = 10;
        do {
            if (i++ > --j) {
                continue;
            }
        } while (i < 5);
        System.out.println("i=" + i + "j=" + j);
    }

}

class B {

    public static void main(String[] args) {
        int k = 0;
        int m = 0;
        for (int i = 0; i <= 3; i++) {
            k++;
            if (i == 2) {
                i = 4;
            }
            m++;
        }
        System.out.println(k + "," + m);
    }

}

class C {

    public static void main(String[] args) {
        int index = 1;
        String[] str = new String[5];
        String myStr = "Angie";
        myStr = str[index];
        System.out.println(str);
    }
}

class D {

    public static boolean getBool() {
        return true;
    }

    public static String getString() {
        return "true";
    }

    public static void main(String[] args) {
        switch (getString()) {
            case "true":
                System.out.println("true");
                break;
            default:
                System.out.println("none");
                break;
        }
    }
}

class E {

    public static void main(String[] args) {
//    int p1,r2,r3;
//    int p1 = r2 = r3 = 8;
//    
//    String 3angie$;
//    
        int k2, k3, k4;
        k2 = k3 = k4 = 100;
//   new Boolean("TrUe") == new Boolean(true);

        System.out.println(k4 + ", " + k2 + ", " + k3);
    }

}

class Chick {

    //private String name = "Fluffy";
    static String name = "Angie";

    {//Bloque de inicializacion
        name = "Tom";
        System.out.println("setting field");
    }

    public Chick() {
        name = "Tiny";
        System.out.println("setting constructor");
    }

    public static void main(String[] args) {
        Chick chick = new Chick();
        System.out.println(chick.name);
    }

}

class Order {

    static String result = " ";

    public Order() {
        result += "R";
    }

    ;

     {
        result += "c";}
    static
    {result += "u";
    }

    {
        result += "r";
    }
}

class OrderDrive {

    public static void main(String[] args) {
        System.out.println(Order.result + "");
        System.out.println(Order.result + "");
        new Order();
        new Order();
        System.out.println(Order.result + " ");

    }
}

//class Order1 {
//
//    static String result = " ";
//
//    public Order1() {
//        result += "i";
//    }
//
//    {
//        result += "C";
//    }
//
//    static {
//        result += "u";
//    }
//}
//
//class OrderDrive1 {
//
//    public static void main(String[] args) {
//        System.out.println(Order.result + "");
//        new Order();
//        new Order();
//        System.out.println(Order.result + " ");
//        System.out.println(Order.result + "");
//
//    }
//}
class LoopTest {

    public static void main(String[] args) {
        int counter = 0;
        outer:
        for (int i = 0; i < 3; i++) {
            middle:
            for (int j = 0; j < 3; j++) {
                inner:
                for (int k = 0; k < 3; k++) {
                    if (k - j > 0) {
                        continue;
                    }
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}

class Loop2 {

    public static void main(String[] args) {
        int c = 0;
        A:
        for (int i = 0; i < 2; i++) {
            B:
            for (int j = 0; j < 2; j++) {
                C:
                for (int k = 0; k < 3; k++) {
                    c++;
                    if (k > j) {
                        continue B;
                    }
                }
            }

        }
        System.out.println("valor de count: " + c);
    }

}

class Loop3 {

    public static void main(String[] args) {
        int count = 0, sum = 0;

        do {
            if (count % 3 == 0) {
                continue;
            }
            sum += count;

        } while (count++ < 11);
        System.out.println(sum);
    }
}

class Loop4 {

    public static void main(String[] args) {
        int[][] ab = {{1, 2, 3}, {4, 5}};
        for (int i = 0; i < ab.length; i++) {
            for (int j = 0; j < ab[i].length; j++) {
                System.out.println(ab[i][j] + " ");
                if (ab[i][j] == 2) {
                    break;
                }
            }
            continue;
        }
    }
}

class TestClass2 {

    public static void main(String[] args) {
        int i = 0;
        String s = "";
        //s = null;
        if ((s != null) | (i == s.length())) {
        }
        System.out.println("A");

        //s = null; 
        if ((s == null) | (i == s.length())) {
        }
        System.out.println("B");

        //s = null;
        if ((s != null) || (i == s.length())) {
        }
        System.out.println("C");

        s = null;
        if ((s == null) || (i == s.length())) {
        }
        System.out.println("D");
    }

}

class Game1{
    public void play() throws Exception{
        System.out.println("Playing");
    }
}

class Soccer1 extends Game1{
    public void play(){
        System.out.println("Playing Soccer....");
    }
    public static void main(String args[]) throws Exception {
        Game1 g = new Soccer1();
        g.play();
    }
}

class Great{
    public void doStuff() throws FileNotFoundException{
        
    }
}

class Amazing extends Great{
     public void doStuff() throws RuntimeException{
         System.out.println("Hijo");
     }
}

class TestAmazing{
    public static void main(String args[]) throws RuntimeException, FileNotFoundException{
        Great g = new Amazing();
        g.doStuff();
    }
}

class z {

    public final static void main(String[] args) {
        int i = 1;
        Integer[] ia = {1};
        ini(i);
        ini(ia);
        System.out.println("valor de i: " + i);
        System.out.println("valor de ia: " + ia[0]);
    }

    private static void ini(Integer[] ia) {
        ia[0]++;
    }

    private static void ini(int i) {
        i++;
    }
    String specialization;

    String getSpecialization() {
        return specialization;
    }
}
