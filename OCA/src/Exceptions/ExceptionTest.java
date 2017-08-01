package Exceptions;

/**
 * Se debe tener en cuenta el orden de precedencia, del mas específico al más
 * general, el padre se deja de últimas.
 *
 * @author anggomez1
 */
class MyException extends Throwable {
}

class MyException1 extends MyException {
}

class MyException2 extends MyException {
}

class MyException3 extends MyException2 {
}

public class ExceptionTest {

    void myMethod() throws MyException {
        throw new MyException3();
    }

    public static void main(String[] args) throws MyException {
        ExceptionTest et = new ExceptionTest();
        try {
            et.myMethod();
        } catch (MyException3 me3) {
            System.out.println("MyException");
        } catch (MyException2 me2) {
            System.out.println("MyException3");
        } finally {
            System.out.println("Done");
        }
    }

}
