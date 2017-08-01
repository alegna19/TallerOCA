
package Polimorfismo;

/**
 *
 * @author anggomez1
 */
public class Coches extends Vehiculos{
    private int puertas;
    public static void main(String[] args){
        Coches coche = new Coches();
            if(coche instanceof Vehiculos){ // coche ES UN Vehiculo, por que coche es una subclase de Vehiculos.
                System.out.println("coche es un coche y también un vehículo");
            }
    }
}
