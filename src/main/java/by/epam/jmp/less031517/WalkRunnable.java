package by.epam.jmp.less031517;

/**
 * Created by Ruslan_Arifullin on 3/15/2017.
 */
public class WalkRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Walking");
            try {
                Thread.sleep(7);
            }
            catch (InterruptedException e) {
                System.err.println(e);
            }
        }
    }
}
