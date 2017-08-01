package arrays;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Un arrayList conserva el orden de inserción de los elementos
 *
 * @author anggomez1
 */
public class TestArrayList {

    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("four");
        list.add(2, "three");
        //For mejorado.
//         for(String element : list){
//             System.out.println(element);
//         }

        /**
         * Optiene los elementos de la lista si hay mas elementos el sigue con
         * el siguiente.
         */
//         ListIterator<String> iterator = list.listIterator();
//         while(iterator.hasNext()){
//             System.out.println(iterator.next());
//         }
        /**
         * Reemplaza la posición del valor con la propiedad set
         */
//        list.set(1, "One and Half");
//        for (String element1 : list) {
//            System.out.println(element1);
//        }
        /**
         * Modifica los elementos de la lista, agregandoles el tamaño de cada
         * elemento.
         */
//        ArrayList<StringBuilder> myArraylist = new ArrayList<>();
//        myArraylist.add(new StringBuilder("One: "));
//        myArraylist.add(new StringBuilder("Two: "));
//        myArraylist.add(new StringBuilder("Three: "));
//        for (StringBuilder e : myArraylist) {
//            e.append(e.length());
//            System.out.println(e); //devuelve One3, Two3, Three5
//        }
        /**
         * Remueve un elemento de la lista. remove(int index) Remueve un
         * elelemnto específico de la lista. remove(Object o) Remueve la primera
         * ocurrencia de un elemento específico.
         */
//        ArrayList<StringBuilder> myArrList = new ArrayList<>();
//        StringBuilder sb1 = new StringBuilder("One");
//        StringBuilder sb2 = new StringBuilder("Two");
//        StringBuilder sb3 = new StringBuilder("Three");
//        StringBuilder sb4 = new StringBuilder("Four");
//        myArrList.add(sb1);
//        myArrList.add(sb2);
//        myArrList.add(sb3);
//        myArrList.add(sb4);
//        myArrList.remove(1);
//        for (StringBuilder element1 : myArrList) {
//            System.out.println(element1);
//        }
//
//        myArrList.remove(sb3);
//        for (StringBuilder element2 : myArrList) {
//            System.out.println("zzz" + element2);
//        }
//
//        myArrList.remove(new StringBuilder("Four")); //No elimina el FOUR por que no se comparan 2 referencias del mismo Objeto, si el arreglo fuera de tipo Objeto lo eliminaria.
//        for (StringBuilder element3 : myArrList) {
//            System.out.println("aaaa" + element3);
//        }
    }

}

/**
 * Remover un elemento con una clase de tipo Objeto.
 *
 * @author anggomez1
 */
class MyPerson {

    String name;

    MyPerson(String name) {
        this.name = name;
    }
//Para poder comparar se debe sobreescribir el método equals.
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MyPerson) {
            
            MyPerson p = (MyPerson) obj;
            boolean isEqual = p.name.equals(this.name);
            return isEqual;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        ArrayList<MyPerson> myArrList = new ArrayList<MyPerson>();
        MyPerson p1 = new MyPerson("Shreya");
        MyPerson p2 = new MyPerson("Paul");
        MyPerson p3 = new MyPerson("Harry");
        myArrList.add(p1);
        myArrList.add(p2);
        myArrList.add(p3);
        myArrList.remove(new MyPerson("Paul"));
        //myArrList.clear(); Esto elimina todos los elementos de la lista.
        for (MyPerson element : myArrList) {
            System.out.println(element.name);
        }
    }
}
