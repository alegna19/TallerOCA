

package interfaces;

/**
 *
 * @author anggomez1
 */
public final class BunnyStatic implements HopStatic{
  
    public static void main(String[] args){
       BunnyStatic b = new BunnyStatic();
       HopStatic h = new BunnyStatic();
       h.getData();
        System.out.println("método de la interfaz: " + h);
       b.printDetails();
    }
    
      public void printDetails(){
        System.out.println("valor de la interfaz implementada: " + HopStatic.getJumHeight());
    }

    @Override
    public void methodE() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getData() {
        System.out.println("Test método de la interfaz");
    }
}
