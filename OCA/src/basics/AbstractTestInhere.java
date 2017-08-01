
package basics;

/**
 *
 * @author anggomez1
 */
public class AbstractTestInhere  extends AbstracTest{
    


    public void displayName() {
        System.out.println("Implementacion del método abstracto en una clase concreta.");
    }

    void f() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void f(int n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
