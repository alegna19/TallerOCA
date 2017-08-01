package basics;

import java.util.ArrayList;

/**
 *
 * @author anggomez1
 */
public class QueryStringBuilder {
      //int a, b,c =100;
      int z = 'a';
      char v = 6;
      int a,b,c;
     
      

    final static int caseOne = 11;

    void methodOne() {
        int dataAEvaluar = 9;
        switch (dataAEvaluar) {
            case 0:
            case 1:
            case 9 * 2 * 6:
                System.out.println("MethodOne: " + 1);
            case 9:
                System.out.println("MethodOne: " + 1);

        }
//       ooo: System.out.println("");
//       
//       
//       outside : for(int i =0; i<10; i++){
//           inside:for(int j = 0; j<10; j++){
//               if(5>0)
//                   break outside;
//               else
//                   continue outside;
//             
//           }
//       }

    }

    public static void main(String... $n) {
        QueryStringBuilder builder = new QueryStringBuilder();
      
        System.out.println("valores: " + builder.a + builder.b + builder.c);
        builder.methodOne();
        int Public;
//Insert
        StringBuilder sb1 = new StringBuilder("92");
        StringBuilder sb2 = new StringBuilder("123456");
//         sb1.append(true);
//         sb1.append(10);
//         sb1.append('a');
//         sb1.append(20.9);
//         sb1.append("Hi");
        //sb1.insert(2, 'r');
        char[] name = {'j', 'a', 'v', 'a'};
        sb2.insert(3, name, 0, 4);//pasa 3 argumentos, un int, un arreglo de char{}, int, int.Por eso en la primera posición agrega el valor que viene por parámetro en el StringBuilder.
        //0, 4 es el arreglo name de 4 posiciones 'java'
        System.out.println("insert: " + sb2);

        StringBuilder sb = new StringBuilder("animals");
        sb.insert(4, "-");
        System.out.println("Animals: " + sb);

        /**
         * DELATE: A diferencia del String, no toma en cuenta el inicio pero si
         * el final, es decir no elimina el caracter en la última posición.
         */
        StringBuilder sb7 = new StringBuilder("animals");
        sb7.delete(2, 4);
        System.out.println("Delete: " + sb7);

        /**
         * DeleateCharAt: Elimina el caracter indicado:
         */
        StringBuilder sb3 = new StringBuilder("0123456");
        sb3.deleteCharAt(2);
        System.out.println(sb3); //Devuelte 013456

        /**
         * REVERSE: Invierte el orden de un caracter o int
         */
        StringBuilder sb4 = new StringBuilder("01234567");
        sb4.reverse();
        System.out.println(sb4);

        /**
         * REPLACE(): Reemplaza una secuencia de carácteres, dejando el último
         * valor que se le indique, por ejemplo si va 2, 4 empieza en 2 y hasta
         * la posición 4 incluye la secuencia de caracteres pero incluye al
         * final el valor en la posicion 4.
         */
        StringBuilder sb5 = new StringBuilder("12345678");
        //sb5.replace(2, 4, "A");
        sb5.setLength(5);
        sb5.setLength(10);
        System.out.println("Replace StringBuilder: " + sb5);// Devuelve 01ABCD456

        /**
         * SUBSEQUENCE: Retorna una secuencia de objetos de tipo char.Es decir
         * devuelve la posición del rango dado.
         */
        StringBuilder sb6 = new StringBuilder("0123456");
        System.out.println(sb6.subSequence(2, 4));// devuelve 23. No toma en cuenta la última posición 4.

        StringBuilder sb10 = new StringBuilder("123456");
        System.out.println("SUBSEQUENCE: " + sb10.subSequence(2, 4));
        sb10.deleteCharAt(3);
        sb10.reverse();
        System.out.println("wwww" + sb10);

        //Modifica su valor existente de StringBuilder a 12S5 y agrega a sí mismo al llamar ejg.append().
        StringBuilder ejg = new StringBuilder(10 + 2 + "SUN" + 4 + 5);
        ejg.append(ejg.delete(3, 6));
        System.out.println("delete: " + ejg);

        StringBuilder ejg1 = new StringBuilder("Angela");
        ejg1.append("Gomez");
        System.out.println("APPEND: " + ejg1);

        byte b = -128;
        char c = 'a';
        float f = 3.0f;
        long €l = 1234_567890;
        //int i1, i2, i3, i4;
        //int i1 = i2 = i3 = i4 = 11;
        //String s1 = s2 = "Maria"; 
        //System.out.println(i1 + " "  + i2);
        if (true) {

        }
        do {

        } while (false);
        {

        }

    }

}
