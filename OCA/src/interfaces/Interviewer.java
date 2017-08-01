package interfaces;

import java.time.LocalDateTime;

/**
 *
 * @author anggomez1
 */
public interface Interviewer {

    int MIN_SAL = 9999;

    default void submitInterviewStatus() {
        System.out.println(this);
        System.out.println(this.MIN_SAL);
        System.out.println(this.print());
    }

    String print();

}

class Manager implements Interviewer {

    public String print() {
        return ("I am " + this);
    }
}

class Car implements Interviewer {

    public String print() {
        return ("Car" + this);
    }

}

class Foo {

    public static void main(String rags[]) {
        Interviewer m = new Manager();
        m.submitInterviewStatus();
    }
}

class Programmer {

    String print() {
        return ("Mala");
    }

}
