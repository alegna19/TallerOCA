/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anggomez1
 */
public class ExampleDo {

    static String num;

    public ExampleDo() {
        final int num2;
    }

    public static void main(String[] args) {
//        ExampleDo ed = new ExampleDo();
//        System.out.println(num);

        int count = 0, sum = 0;
        do {
            if (count % 3 == 0) {
                continue;
            }
            sum += count;

        } while (count++ < 11);
        System.out.println(sum);
    }

}

class TestSwitch {

    public static void main(String[] args) {
        Object t = new Integer(106);
        int k = ((Integer) t).intValue();
        System.out.println("" + k);
       // System.out.println(3 + 100 / 10 * 2 - 13);
    }

}

class listTest {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("var1");
        list.add(2, "var2"); //Si estuviera en en orden corre bien primero agregar 1 y luego 2.
        list.add(1, "var3");
        System.out.println("Lista: " + list);
    }

}

class ForSwitch {

    public static void main(String[] args) {
        //float f = 22.0f/7.0f;
        char i;
        LOOP:
        for ( i = 0; i < 5; i++) {
            switch (i++) {
                case '0':
                    System.out.println("A");
                case 1:
                    System.out.println("B");
                    break;
                case 2:
                    System.out.println("C");
                    break;
                case 3:
                    System.out.println("D");
                    break;
                case 4:
                    System.out.println("E");
                case 5:
                    System.out.println("F");
            }
        }

    }
}

class TestInterfaceImpl implements InterfaceNew, NewInterface{

  
    int l = thevalue;

    public static void main(String[] args) {
        TestInterfaceImpl p = new TestInterfaceImpl();
        p.m1();
        System.out.println(p.l);
        //((InterfaceNew)p).m1();
    }

    @Override
    public void m1() {
        System.out.println("Metodo implementado");
       
    }
}

class Diffrente{
     public static void main(String[] args) {
         StringBuilder builder = new StringBuilder("ddd-ddd-dddd");
         //builder.append("append");
         builder.insert(0, "ABCDEF", 0, 3);
         System.out.println(builder);
         
     }
}
