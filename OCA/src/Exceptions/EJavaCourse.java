package Exceptions;

/**
 *
 * @author anggomez1
 */
public class EJavaCourse {

    String courseName = "Java";

}

class University {

    public static void main(String args[]) {
        EJavaCourse courses[] = {new EJavaCourse(), new EJavaCourse()};
        courses[0].courseName = "OCA";
        for (EJavaCourse c1 : courses) {
            c1 = new EJavaCourse();
        }
        for (EJavaCourse c : courses) {
            System.out.println(c.courseName);
        }
    }
}
