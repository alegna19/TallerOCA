
package Polimorfismo;

/**
 *
 * @author anggomez1
 */
public class Polimorfismo {
  
    
}

 interface Ladrar{
     String v1 = "interface";
      void ladrar();
}

class Animal{
    String v1 = "Padre";
    String v2 = "Padre2";
    public void m1(){
        System.out.println("Animal");
    }
     
}

class Dog extends Animal implements Ladrar{
    String v1 = "Hijo";

    @Override
    public void ladrar() {      
        System.out.println("Ladrar Dog");
    }
    
     public void m1(){
        System.out.println("Dog");
    }
     
     public void m2(){
        System.out.println("Dog1");
    }
    
     public static void main(String[] args){
       Animal a = new Dog();
       Ladrar l = new Dog();
       Dog d = new Dog();
       
         System.out.println("Variable Animal: " + a.v1 );
         a.m1();
         System.out.println("Variable Interface: " + l.v1);
         l.ladrar();
         System.out.println("Variable Dog: " + d.v1);
         d.m1();
   }
    
     public void daysWork(String year, int...days){
         
     }
}
