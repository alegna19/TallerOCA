
package Exceptions;

/**
 *
 * @author anggomez1
 */
public class PrintingException {
     public static void main(String[] args)  {
        try{
            hop();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println(e);
            //e.printStackTrace();
        }
         
    }
     private static void hop(){
         throw new  RuntimeException("can hop");
     }
    
}
