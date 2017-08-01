package basics;

import java.util.ArrayList;

/**
 * Devuelve un caracter específico de un String.
 *
 * @author anggomez1
 */
public class QueryString {

    int d4 = 1980_4;
//int a2, b2, c2; a3 = b3 = c3 = 100;
//int a, b, c=100;
//int a1=100, b1, c1;

    String name = "Paul";
    String name2 = "12345";
    String letters = "ABCDE";
    String exam = "angela";
    String varWithSpaces = " AB C D ";
    String test = "blooper";

    public static void main(String[] args) {

        //charAt Devuelve un caracter específico de un String. Solo devuelve la letra de la posición.
        QueryString query = new QueryString();
        System.out.println("CharAtName2: " + "12345".charAt(1));
        //System.out.println("CharAt: " + query.name.charAt(1));//Si le envio un char 'l' Retorna un char 108 es la posición en Ascii pero saca un StringIndexOutBoundsException

        /**
         * indexOf la posición del index que le se indique por parámetro del
         * indexOf, si no hay coincidencia con el valor que se le pase, retorna
         * -1.
         */
        QueryString qc = new QueryString();
        //System.out.println(qc.letters.indexOf(1)); //"ABCD";
        System.out.println("indexOf: " + qc.letters.indexOf("A"));
        System.out.println(qc.letters.concat("8"));

        /**
         * subString Devuelve el carácter en la posición indicada Incluye el
         * caracter inicial pero no el final, sin incluir la posición final
         *
         */
        QueryString q = new QueryString();//angela
        System.out.println("SubString Text:* " + q.test.substring(3));//Devuelve ela toma encuenta la posición 3
        System.out.println("SubString:** " + q.exam.substring(2, 4));//Devuelve ge no toma en cuenta la posición final.Es decir elimina la posición 4.

        /**
         * Trim() Remueve los espacios en blanco
         */
        System.out.print(":");
        System.out.print(q.varWithSpaces.trim());
        System.out.println(" ");

        /**
         * Replace() Devuelve un nuevo String reemplazando las ocurrencias del
         * char con otro char.
         */
        System.out.println("Replace: " + q.letters.replace('A', 'Z'));//No se puede hacer un mix "" y ''

        /**
         * Length() Devuelve el tamaño de un String.
         */
        System.out.println("Length" + q.letters.length()); //ABCD, devuelve 4.

        /**
         * STARTSWITH() AND ENDSWITH() Devuelve true si coincide el valor si no
         * false.
         */
        System.out.println(q.letters.startsWith("AB"));
        System.out.println(q.letters.startsWith("STARTSWITH: " + "ZP"));

        /**
         * METHOD CHAINING
         */
        String result = "Sunday  ".replace(' ', 'Z').trim().concat("M n");
        System.out.println("Result Chaining: " + result);

        //String es immutable
        String day = "SunDday";
        day.replace('D', 'Z').substring(3);
        System.out.println(" DAY " + day);
        day = day.replace('D', 'Z').substring(3);
        System.out.println(day);

        //Si startsWith('A') generaría error en la ejecución.
        String letters = "ABCAB";
        char l = 'a';
        System.out.println(letters.substring(0, 2).startsWith("A"));
        
        String valores = "angie".concat("world");
        //valores.concat("world");
        System.out.println("valores: " + valores.length());

    }

}
