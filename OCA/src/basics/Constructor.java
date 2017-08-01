package basics;

/**
 *
 * @author anggomez1
 */
public class Constructor {

    int age = 10 ;
    String name;

    Constructor() {
        this("angie", 15); //Solo se puede usar para constructores y solo para llamar a otro constructor.
        System.out.println("Constructor1");
    }

    private Constructor(String name, int age) {
        name = name;
        age = age;

        System.out.println("Constructor2");
    }

    //Se ejecuta primero que el constructor el Bloque de Inicialización.
    {
        System.out.println("Bloque de Inicialización");
    }

    void Constructor() { //Puede tener el mismo nombre de la clase peor es un método
        System.out.println("Test");
    }
}

class Office {

    public static void main(String[] args) {
        Constructor constructor = new Constructor();//Si no se crea la instancia de Constructor no se imprime "Constructor"
        constructor.Constructor();
        System.out.println(constructor.age);
    }

}

class Office1 {

    public static void main(String args[]) {
        Constructor emp = new Constructor();
    }
}
