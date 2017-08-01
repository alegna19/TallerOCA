package Exceptions;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anggomez1
 */
public class Exceptions {

   
    public static void main(String[] args){
        Exceptions e = new Exceptions();
        System.out.println("result: " + e.methodExceptions());
    }
     public String methodExceptions() {
        String result = "";
        String v = null;
        try {
            try {
                result += "before ";
                v.length();
                result += "after";
            } catch (NullPointerException e) {

                result += "catch ";
                throw new RuntimeException();
            } finally {
                result += "finally ";
                throw new Exception();
            }
        } catch (Exception e) {
            result += "done ";
        }
        return result;
    }
     
     public String getTest() throws ArithmeticException{
         return "Null";
     }
     
     public void getTest1(){
    
            getTest();
     }
     
         public void getTest2()  {
    
        try {
            getTest1();
        } catch (Exception ex) {
            Logger.getLogger(Exceptions.class.getName()).log(Level.SEVERE, null, ex);
        }
  
     }
}
