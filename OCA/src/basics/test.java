package basics;

import CalendarData.TestLocalDate;
import java.util.ArrayList;

/**
 *
 * @author anggomez1
 */
public class test {

    public static void main(String... args) {
        
        System.out.println("1" + 2 +5);

        ArrayList<String> ejg = new ArrayList<>();
        ejg.add("One");
        ejg.add("Two");
        //Contains compara los objetos que contiene el arrayList.
        System.out.println(ejg.contains(new String("One")));//Por que el método String utiliza el método equals para comparar los valores.
        System.out.println(ejg.indexOf("Two"));//también compara con el método equals del String.
        //ejg.clear();
        System.out.println(ejg);//SLa lista sale vacia por que ya se han eliminado los objetos de la lista [].
        System.out.println(ejg.get(1));//No sale el contenido TWO por que ya se han eliminado los objetos de la lista.

        StringBuilder sb1 = new StringBuilder("123456");
        sb1.subSequence(2, 4);
        sb1.deleteCharAt(3);
        sb1.reverse();
        System.out.println(sb1);
    }
    
    

}
