package basics;

/**
 *
 * @author anggomez1
 */
public class EjemValueOf {

    public static void main(String[] args) {
        int i = 10_0;
        int m = 0xE;
        System.out.println(i>100);
        String name = "/*harry"+  "*/ paul";
       System.out.println(name);
        
        int $va_lor = 1_00_0;
        System.out.println(i + 100);//(i + 100), Java interpretó una suma de valores
        System.out.println(String.valueOf("concatena el String: " + "77") + 100);//"(String.valueOf(i) + 100)", interpretó una concatenación de Strings.

        //La respuesta va a ser false por que crea una nueva instancia para la variable.
        Integer i1 = new Integer(200);//Si el valor es superior a 200 no se almacena en cache y la comparación deberia hacerce con equals.
        Integer i2 = new Integer(200);
        System.out.println(i1 == i2);

        //La respuesta es true por que refiere a la misma instancia.
        Integer i3 = Integer.valueOf(127);//No se almacena en cache un valor superior a 128, la respuesta seria false.
        Integer i4 = Integer.valueOf(127);
        System.out.println(i3 == i4);

        int i5 = Integer.valueOf(12);// Devuelve un Wrapper.
        System.out.println("Wrapper: " + i5);

        Integer i6 = Integer.parseInt("40");//Devuelve una primitiva. 
        System.out.println("Primitiva: " + i6);

        System.out.println("María" + " " + i1 + " " + i2);

        //si quiero wrapper es valueOf
        //si quiero una primitiva toca con el parseInt
    }
}
