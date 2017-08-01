
package Exceptions;

/**
 *
 * @author anggomez1
 */
public class Dog {
    public String   name;
    public void paseName(){
        System.out.println("1");
        
        try{
            System.out.println("2");
            int x = Integer.parseInt(name);
            System.out.println("3");
        }catch(NumberFormatException e){
            System.out.println("4");
        }
    }
    
    public static void main(String[] arg){
        Dog leroy = new Dog();
        leroy.name= "angie"; // Si fuera "123" o si entraria al try de lo contrario el formato esta mal y lanza la excepcion
        leroy.paseName();
        System.out.println("5");
    }
    
}
