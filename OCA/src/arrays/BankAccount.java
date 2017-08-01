
package arrays;

/**
 *
 * @author anggomez1
 */
public class BankAccount {
   String accNumber;
   int accType;
   
   @Override
   public boolean equals(Object ob){
     if(ob instanceof BankAccount){
         BankAccount ba = (BankAccount)ob;
         //return(accNumber.equals(ba.accNumber) && accType == ba.accType);
         return(ba.accNumber.equals(ba.accType) && ba.accType == ba.accType);
     }  else
         return false;
   }
}
