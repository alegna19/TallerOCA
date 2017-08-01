
package inheritance;

/**
 *
 * @author anggomez1
 */
public class Fish {
    protected static int size = 5;
    private int age;
     String name = "angie";


    public Fish(){
        System.out.println("Fish");
    }
    
    public Fish(int age){
        this.age = age;
        
    }
    
    public int getAge(){
        System.out.println("Fish age Super");
        return age;
    }
     @Override
    public String toString() {
        return name + "";
    }
}
