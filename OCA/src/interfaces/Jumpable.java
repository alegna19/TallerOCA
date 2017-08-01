package interfaces;

/**
 *
 * @author anggomez1
 */
public interface Jumpable {

    static int maxDistance() {
        return 100;
    }
}

interface Interviewer1 {
}

class Animal1 implements Jumpable, Interviewer1 {

    public int maxDistance1() {
        return 200;
    }

}

class Forest {

    public static void main(String args[]) {
        Animal1 lion = new Animal1();

        System.out.println(lion.maxDistance1());
        System.out.println(Jumpable.maxDistance());

    }
}

 class MultipleReturn {

    int getInt() {
        try {
            String[] students = {"Harry", "Paul"};
            System.out.println(students[5]);
        } catch (Exception e) {
            return 10;
        } finally {
            return 20;
        }
    }

    public static void main(String args[]) {
        MultipleReturn var = new MultipleReturn();
        System.out.println(var.getInt());
    }
}
