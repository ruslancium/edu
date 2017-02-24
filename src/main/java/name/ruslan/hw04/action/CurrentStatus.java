package name.ruslan.hw04.action;

/**
 * Created by Ruslan_Arifullin on 2/24/2017.
 */
public class CurrentStatus {

    private static boolean flies = false;

    public static boolean isInTheAir() {
        if (flies)
            System.out.println("The board is in the air...");
        flies = true;
        return flies;
    }

    public static boolean isOnTheGround() {
        if (flies)
            flies = false;
        else
            System.out.println("The board is on the ground...");
        return flies;
    }

    public static void setFlies(boolean flies) {
        this.flies = flies;
    }
}
