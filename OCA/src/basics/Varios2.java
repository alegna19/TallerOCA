
package basics;

/**
 *
 * @author anggomez1
 */
public class Varios2 {
    public static void main(String[] args){
        String[] dataList = {"X", "Y", "Z"};
        for(String dataElement : dataList){
            int innerCounter = 0;
            while(innerCounter < dataList.length){
                System.out.println(dataElement + ", " + innerCounter);
                innerCounter++;
            }
        }
        
    }
}

class Baap{
    public int h=5;
    public int getH(){
        System.out.println("Baap" + h);
        return h;
    }
}

 class Beta extends Baap{
     public int h=44;
     public int getH(){
         System.out.println("Beta" + h);
         return h;
     }
     public static void main(String[] args){
        Baap b = new Baap();
         System.out.println(b.h + " " + b.getH() );
//         Beta bb = (Beta) b;
//         System.out.println(bb.h + " " + bb.getH());
    }
     
}
