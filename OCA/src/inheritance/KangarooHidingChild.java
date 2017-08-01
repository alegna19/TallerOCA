package inheritance;

/**
 *
 * @author anggomez1
 */
public class KangarooHidingChild extends MarsupialHidingFather {

    public static boolean isBiped() {
        return true;
    }
    
    public void getKangarooDescription(){
        System.out.println("Kangoroo hops in two legs: " + isBiped());
    }
    
    public static void main(String[] args){
        KangarooHidingChild k = new KangarooHidingChild();
        
        k.getMarsupialDescription();
        k.getKangarooDescription();
    }
}
