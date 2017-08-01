package arrays;

import java.util.ArrayList;

/**
 *
 * @author anggomez1
 */
/**
 * GET: Retorna el elemento específico de la posición de la lista.
 *
 * @author anggomez1
 */
public class OtherArrayList {

    public static void main(String[] args) {
        ArrayList<String> myArrList = new ArrayList<String>();
        myArrList.add("One");
        myArrList.add("Two");
        String valFromList = myArrList.get(1);
        System.out.println("GET: " + valFromList);

        /**
         * Contains, indexOf, lastIndexOf,
         */
        ArrayList<StringBuilder> myArrList1 = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("Jan");
        StringBuilder sb2 = new StringBuilder("Feb");
        myArrList1.add(sb1);
        myArrList1.add(sb2);
        myArrList1.add(sb2);

        System.out.println(myArrList1.contains("Jan"));//verifica la posición, result false
        System.out.println(myArrList1.contains(sb1));//verifica el valor, result true
        System.out.println(myArrList1.indexOf(new StringBuilder("Feb")));//verifica la posición, result -1
        System.out.println(myArrList1.indexOf(sb2));//verifica el valor, result 1
        System.out.println(myArrList1.lastIndexOf(new StringBuilder("Feb")));//verifica la posicion, result -1
        System.out.println(myArrList1.lastIndexOf(sb2));//verifica el valor, result 2 ocurrencias.
        System.out.println(myArrList);

    }
}
