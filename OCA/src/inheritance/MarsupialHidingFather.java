package inheritance;

/**
 *
 * @author anggomez1
 */
public class MarsupialHidingFather {

    public static boolean isBiped() {
        return false;
    }

    public void getMarsupialDescription() {
        System.out.println("Marsual walks in two legs: " + isBiped());
    }

}
