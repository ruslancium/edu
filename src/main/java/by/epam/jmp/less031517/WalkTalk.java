package by.epam.jmp.less031517;

/**
 * Created by Ruslan_Arifullin on 3/15/2017.
 */
public class WalkTalk {
    public static void main(String[] args) {
        TalkThread talk = new TalkThread();
        Thread walk = new Thread(new WalkRunnable());
        // запуск потоков
        talk.start();
        walk.start();
        // WalkRunnable w = new WalkRunnable(); // просто объект, не поток
        // w.run(); или talk.run(); // выполнится метод, но поток не запустится!
    }
}
