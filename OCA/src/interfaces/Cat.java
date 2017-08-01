
package interfaces;

/**
 *
 * @author anggomez1
 */
public class Cat implements Walk, Run {
    public int getSpeed(){
        return 1;
    }
    public static void main(String[] arg){
        System.out.println(new Cat().getSpeed());
    }
}
