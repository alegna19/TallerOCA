package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static java.lang.Integer.*;

/**
 *
 * @author anggomez1
 */
public class Test {


    public static void main(String args[]) {
        //int a,b,c; a = b = c = 100;
        //int a,b,c=100;
        //int a = 100, b;

        //No valido
        //int a = 100 = b = c;
        //int a = b = c; = 100;
        //int a,b,c; a = b = c = 100;
        int b = 0, c = 0;
        b = c;

        System.out.println("Valor a: " + b);

        int g = 1;
        double d = 3.0;

        System.out.println(g + d);

        int i = 0;
        boolean bool1 = true;
        boolean bool2 = false;
        boolean bool = false;

        bool = (bool2 & metodo1("1"));
        bool = (bool2 && metodo1("2"));
        bool = (bool1 | metodo1("3"));
        bool = (bool1 || metodo1("4"));
    }

    public static boolean metodo1(String ar) {
        System.out.println(ar);
        return true;
    }

}

class Discounter {

    static int someInt = 10;

    public static void changeInt(int a) {
        a = 20;
    }

    public static void main(String args[]) {
        changeInt(someInt);
        System.out.println(someInt);
    }
}

class Array {

    public static void main(String args[]) {
        int i = 0, j = 5;
        lab1:
        for (;; i++) {
            for (;; j--) {
                if (i > j) {
                    break lab1;
                }
                System.out.println("i = " + i + " j = " + j);
            }
        }
    }
}

class PrintBoo {

    public static void main(String args[]) {
        //float f = 1.0;
        long l = 012;
        boolean[] b1 = new boolean[2];
        boolean[] b2 = {true, false};
        boolean b = b1[0] == b2[0];
        boolean c = b1[1] == b2[1];
        System.out.println("" + b + ", " + c);

    }
}

interface Movable {

    int location = 0;

    void move(int by);

    public void moveback(int by);
}

class Donkey implements Movable {

    int location = 200;

    @Override
    public void move(int by) {
        location = location + by;
    }

    @Override
    public void moveback(int by) {
        location = location - by;
    }

}

class TestDonkey {

    public static void main(String args[]) {
        Movable m = new Donkey();
        m.move(10);
        m.moveback(20);
        System.out.println("Location " + m.location);
    }

}

class TestK {

    final static private double PI = 3.14159265358979323846;

    public static void main(String args[]) {

        List le = new ArrayList();
        le.add(111);
        System.out.println("listaaa" + le.get(le.size()));

        int k = 0;
        int m = 0;
        Jill:
        for (int i = 0; i <= 3; i++) {
            k++;
            if (i == 2) {
                ;
            }
            m++;
        }
        System.out.println(k + ", " + m);
    }
}

class LoopTest {

    public static void main(String args[]) {
        Float f = null;

        int counter = 0;
        outer:
        for (int i = 0; i < 3; i++) {
            middle:
            for (int j = 0; j < 3; j++) {
                inner:
                for (int k = 0; k < 3; k++) {
                    if (k - j > 0) {
                        break middle;
                    }
                    counter++;
                }
            }
        }
        System.out.println("Counter: " + counter);
    }
}

class TestFlag {

    public static void main(String args[]) {
        int i = 0;
        int j = 0;

        for (i = 0, j = 0; j < 1; j++, i++) {
            System.out.println("ffffi    " + i);
        }

        int c = 0;
        boolean flag = true;
//        for(int i= 0; i<3; i++){
//            while(flag){
//                c++;
//                if(i>c || c>5) flag=false;
//            }
//        }
        System.out.println(c);
    }
}

class TestMsg {

    public static void main(String args[]) {
        System.out.println(getMsg((char) 10));
    }

    public static String getMsg(char x) {
        String msg = "Input value must be";
        msg = msg.concat("smaller than X");
        String rest = "and larger than 0";
        msg.concat(rest);
        return msg;
    }

}

class A {

    public int metodo1() {
        return 0;
    }
}

class AA extends A {

    public short metodo() {
        boolean b1 = false;
        boolean b2 = false;

        if (b2 != b1) {

        }

        return 1;
    }
}

abstract class ClaseA {

    abstract void calculate();

    public static void main(String[] args) {
        System.out.println("Calculating");
        ClaseA a = null;
        a.calculate();
    }
}

class Z {

}

class ZZ extends Z {

}

class Testzz {

    public static void main(String args[]) {
        Z z = new Z();
        ZZ zz = new ZZ();
        //z =zz;
        System.out.println("z= " + z.getClass());
        System.out.println("zz= " + zz.getClass());
    }
}

class printValue {

    float f = 20.0f / 7.0f;
    byte b = 127;

    public static void main(String args[]) {
        for (int i = 0; i < 10; i++) {
            System.out.println("");
        }
        int i = 20;
//
//         int c = 0;
//         JACK: while(c < 8){
//             JILL: if(c>1)//System.out.println(c);
//             if(c > 3) break JILL; else c++;
//         }
    }
}

class printValue1 {

    public static void main(String args[]) {

        int x = 10;
        do {
            x--;
            System.out.println(x);
        } while (x > 10);
    }
}

class ErrorStactic {

    static int[] x = new int[1];// como es static java.lang.ExceptionInInitializerError saca un si no fuera static sacaria java.lang.ArrayIndexOutOfBoundsException

    static {
        x[0] = 10;
    }

    public static void main(String args[]) {
        ErrorStactic ax = new ErrorStactic();

        System.out.println();
    }
}

class TestSwitch1 {

    //int x = 5;
    int j = 5;

    void test3(int x) {
        switch (x) {
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
           default:
            case 3:
                System.out.println("3");
            case 4:
                System.out.println("4");
                
                 
               break;
        }
        //System.out.println("case: " + x);
    }

    public static void main(String args[]) {
        TestSwitch1 testSwitch1 = new TestSwitch1();
        testSwitch1.test3(5);
        
    }
}
class Test5{
    public static void main(String args[]) {


        int c = 0;
        A:for(int i = 0; i<2; i++ ){
            B:for(int j = 0; j<2; j++){
                C: for(int k= 0; k<3; k++){
                    c++;
                    if(k>j) break;
                }
            }
        }
        System.out.println("valor de c: " + c);
    }
    public static void main(String args[][]) {
        
    }
}

class TestArr{
    int x =5;
    int getX(){return x;}
    public static void main(String args[]) {
        TestArr arr = new TestArr();
        arr.looper();
        System.out.println("test" + arr.x);
        
       // int x = (int)args[0];
       // System.out.println(x);
       
       
    }
    
    public void looper(){
        //int x = 0;
        while((x = getX()) !=0){
            for(int m =10; m>=0; m--){
                x=m;
            }
        }
    }
}



