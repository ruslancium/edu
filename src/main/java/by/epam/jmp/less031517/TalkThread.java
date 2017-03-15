package by.epam.jmp.less031517;

/**
 * Created by Ruslan_Arifullin on 3/15/2017.
 */
public class TalkThread extends Thread {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Talking");
            try {
                Thread.sleep(7); // остановка на 7 миллисекунд
            } catch (InterruptedException e) {
                System.err.print(e);
            }
        }
    }
}
