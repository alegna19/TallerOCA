package inheritance;

/**
 *
 * @author anggomez1
 */
public class Shark extends Fish {
    protected int name = 10;

    private int numberOfFins = 8;

    public Shark(int age) {
        //super(age);
        this.size = 4;
        System.out.println("Shark");
        super.getAge();
        this.getAge();
        
    }
    
  public int getAge(){
        System.out.println("Shark age Super");
        return 10;
    }
    
    public static void main(String [] arg){
        new Shark(0).displaySharkDetails();
    }

    public  void displaySharkDetails() {
        //System.out.println("Shark with age: " + getAge());
       // System.out.println(" and " + size + " meters long");
        //System.out.println("Fish Padre" + Fish.size);
        System.out.println("Variable " + new Shark(name).toString());
        //System.out.println(" with " + numberOfFins + " fins");
    }

}
