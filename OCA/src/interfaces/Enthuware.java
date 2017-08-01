package interfaces;

/**
 *
 * @author anggomez1
 */
public class Enthuware {

}

class A {

    //static int i = 9;
    A() {
        System.out.println("Constructo A");
        print();
    }

    void print() {
        System.out.println("A");
    }
}

class B extends A {

    int i = 4;

    public B() {
        super();
    }

    public static void main(String[] args) {
        B a = new B();
        a.print();
    }

    void print() {
        System.out.println(i);
    }
}
