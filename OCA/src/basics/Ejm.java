package basics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anggomez1
 */
public class Ejm {

    static final public void main(String[] args) {
        int a = Integer.MIN_VALUE;
        int r = -a;
        System.out.println(a + "" + r);
    }

}

class Employee {

    String name = "Emp";
    String address = "EmpAddress";
}

class Programmer extends Employee {

    String name = "Prog";

    String address = "cra 21";

    void printValues() {
        System.out.println(this.name + ":");
        System.out.println(this.address + ":");
        System.out.println(super.name + ":");
        System.out.println(super.address);
    }
}

class TwistInTale3 {

    public static void main(String args[]) {
        new Programmer().printValues();
    }
}

class DivisionByZero {

    Float i = 10.4f;
    int e = 0;

    public static void main(String args[]) {
        DivisionByZero byZero = new DivisionByZero();
        System.out.println("Resultado división por cero: " + byZero.i / byZero.e);
        System.out.println(Integer.parseInt("12345"));
    }
}

class EJavaBase {

    void myMethod() throws ExceptionInInitializerError {
        System.out.println("Base");
    }
}

class EJavaDerived extends EJavaBase {

    void myMethod() throws RuntimeException {
        System.out.println("Derived");
    }

    public double method5() throws StackOverflowError {
        return 0.7;
    }
}

class EJava3 {

    public static void main(String args[]) {
        EJavaBase obj = new EJavaDerived();
        obj.myMethod();

    }

}

class Bucle1 {

    public static void main(String args[]) {
        int c = 0;
        boolean flag = true;
        for (int i = 0; i < 3; i++) {
            while (flag) {
                c++;
                if (i > c || c > 5) {
                    flag = false;
                }
            }
        }
        System.out.println("valor de c: " + c);
    }
}

class Array1 {

    public static void main(String args[]) {
        int[] a = {1, 2, 3, 4};
        int[] b = {2, 3, 1, 0};
        int n = a[(a = b)[3]];
        System.out.println("valor de a: " + n);

    }

}

class Array2 {

    public static void main(String args[]) {
        List att = new ArrayList();
        att.add(111);
        int n = att.size();
        //att.get(n);
        System.out.println("test");
    }

}
