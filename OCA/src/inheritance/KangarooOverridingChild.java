package inheritance;

/**
 *
 * @author anggomez1
 */
public class KangarooOverridingChild extends MarsupialOverridingFather {

    public boolean isBiped() {
        return true;
    }
    
    public void getKangarooDescription(){
        System.out.println("Kangoroo hops in two legs: " + isBiped());
    }
    
    public static void main(String[] args){
        KangarooOverridingChild k = new KangarooOverridingChild();
        k.getMarsupialDescription();
        k.getKangarooDescription();
    }
}
