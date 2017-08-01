package Overloading;

/**
 *
 * @author anggomez1
 */
public class Calculate {

    double calcAverage(int marks1, double marks2) {
        return (marks1 + marks2) / 2.0;
    }

    double calcAverage(int marks1, int marks2) {
        return (marks1 + marks2) / 2.0;
    }

    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        calculate.calcAverage(2, 3);
    }

    /**
     * Si el tipo de retorno es diferente no se considera sobrecarga de métodos.
     */

    double calcAverage1(int marks1, double marks2) {
        return (marks1 + marks2) / 2.0;
    }

    int calcAverage1(int marks1, int marks2) {
        return (marks1 + marks2);
    }

    /**
     * No pueden ser sobrecarga de métodos cuando tienen dos tipos de
     * modificador de acceso diferentes.
     */
    public double calcAverage2(int marks1, double marks2) {
        return (marks1 + marks2) / 2.0;
    }

    private int calcAverage2(int marks1, int marks2) {
        return (marks1 + marks2);
    }
}
