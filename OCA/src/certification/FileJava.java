/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package certification;
import Exceptions.Bunny;

/**
 *
 * @author anggomez1
 */

// Se puede definir clases e infertaces dentro de una clase
public class FileJava {
    public String courseName; //Si la variable es private no puede ser accedida desde otra clase.
    
  
    
    public void setCourseName( String name){
        courseName = name;
    }
}

interface InterfaceOne {
    
}

 class FileJava2 {

 public static void main(String args[]) {
      FileJava f = new FileJava();
     
        f.courseName = "Java";
        System.out.println(f.courseName);
}
}

abstract class FileAbstrac {
    
}
