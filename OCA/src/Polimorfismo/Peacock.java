
package Polimorfismo;

/**
 *
 * @author anggomez1
 */
public class Peacock extends Bird{
    String name = "del rosario";
    public String getName(){
        return "Peacock";
    }
    
    public static void main(String[] args){
        //Bird b = new Bird();
         Peacock b1 = new Peacock();
         
         Bird bird = new Peacock();
         
         Peacock peacock = (Peacock) bird;
         
         System.out.println("Valor de la variable: " + b1.name);
       
       // System.out.println("nombre del pájaro: " + b.getName());// reemplaza el método del Padre al generar la instancia a Bird()
        
    }
}
