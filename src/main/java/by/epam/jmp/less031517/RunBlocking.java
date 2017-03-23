package by.epam.jmp.less031517;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RunBlocking {
public static void main(String[] args) {
    //final CustomQueue<String> queue = new CustomQueue<>(2);
    List<String> queue = new ArrayList<>();
    Lock lock = new ReentrantLock();
    //final ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<String>(2);
    new Thread() {
        public void run() {
            lock.lock();
            for (int i = 1; i < 4; i++) {
            //try {

                if (queue.size() < 3) {
                    //queue.offer("Java" + i); // добавление 3-х
                    queue.add("Java" + i); // добавление 3-х
                    System.out.println("Element " + i + " added");
                }
            //} catch (InterruptedException e) {
            //}

            }
            lock.unlock();
    }
}.start();
    new Thread() {
        public void run() {
            try {
                Thread.sleep(1_000);
                // извлечение одного
                System.out.println("Element " + queue.remove(0) + " took");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }.start();
}
}