package basics;

import java.io.IOException;

/**
 *
 * @author anggomez1
 */
public class Print {

    int num = 10;
    int val = 12;
    String ast = "OCA";
    String another = num + val + ast;
    String lang = "Java";
    String var3 = "code";
    String var4 = "code";

    public static void main(String[] arg) {

        Print p6 = new Print();
        p6.lang += "isEvery";
        System.out.println(p6.another);
        System.out.println(p6.lang);
        System.out.println(p6.var3.equals(p6.var4));

        System.out.println(p6.var3 == p6.var4);
        System.out.println(p6.var3 != p6.var4);
    }

}

class Persona {

    private static void swap(Persona p1, Persona p2) {
        Persona tem = p1;
        p1 = p2;
        p2 = tem;
    }

    private static void changeObject(Persona p1) {
        p1.setName("Rodriguez");

    }

    void enroll(long duration) {
        System.out.println("long");
    }

    void enroll(int duration) {
        System.out.println("int");
    }

    void enroll(String s) {
        System.out.println("String");
    }

    void enroll(Object o) {
        System.out.println("Object");
    }

    private String name;

    Persona(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void setName(String val) {
        name = val;
    }

    public static void main(String[] args) {
        String morning1 = new String("Morning");
        System.out.println("Morning" == morning1);

        String str3 = "Angela";
        String str4 = "Angela";
        System.out.println(str3 == str4);

        int num = 10;
        int num2 = 100;
        System.out.println(num == num2);

        Persona persona1 = new Persona("John");
        System.out.println(persona1.getName());
        Persona persona2 = new Persona("Paul");
        System.out.println(persona1.getName() + ":" + persona2.getName());
        swap(persona1, persona2);
        System.out.println(persona1.getName() + ":" + persona2.getName());
        changeObject(persona1);
        System.out.println(persona1.getName());

        //Course course = new Course();
        char c = 10;
        persona1.enroll(c);

    }

}

class Game {

    public void play() { //throws Exception{
        System.out.println("Playiing...");
    }
}

class Soccer extends Game {

    char c;

    public void play() {
        System.out.println("Gameee...");
    }

    public static void main(String[] args) {
        Soccer s = new Soccer();
        System.out.println("tamaño de args: " + args.length);
        System.out.println("char: " + s.c);
        Game g = new Soccer();
        g.play();
    }

}

class ImplementsTest implements T1, T2 {

    @Override
    public void m1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

interface T1 {

    int value = 1;

    void m1();
}

interface T2 {

    int value = 1;

    void m1();
}


