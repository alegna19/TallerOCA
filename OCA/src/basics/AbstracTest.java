
package basics;

/**
 *
 * @author anggomez1
 */
public abstract class AbstracTest {
    
     void hunk(){};
    
    abstract void f(int n);
    static void l(){};
    final void g(){};
    final void h(){};
    
    
    protected static int i;
    private int j;
    //static String name="";
    

//    
//    public static void getName(){ //método concreto puede tener implementación.
//        System.out.println("");
//    }
//    public abstract void displayName(); //Los métodos abstractos no pueden tener body
}

final class BigBang2 extends AbstracTest{
    int m;
    
    BigBang2(int n){
        m = n;
    }
    
    public static void main(String []args){
        //AbstracTest mc = new BigBang();
    }

    @Override
    void f(int n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    
}
