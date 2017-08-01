
package basics;

/**
 *
 * @author anggomez1
 */
public class EjemploCase {
           static int num2 = 25;

    public static void main(String args[]) {
        int num = 20;
  
        switch (num) {
            default:
                System.out.println("default");
            case 11:
                System.out.println("case1");
                
            case 10+5:
                System.out.println(num2);
                break;

        }

        int i = 0;
        for (; i < 2; i = i + 5) {
            if (i < 5) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println(i);
    }
}
