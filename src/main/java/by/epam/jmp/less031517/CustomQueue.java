package by.epam.jmp.less031517;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Ruslan_Arifullin on 3/23/2017.
 */
public class CustomQueue<E> {
    private List queue = new LinkedList();
    private int size;
    Lock lock = new ReentrantLock();

    public CustomQueue(int size) {
        this.size = size;
    }


    public synchronized boolean offer(E element) {
        lock.lock();
        while (this.queue.size() == this.size) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }

        if (this.queue.size() == 0) {
            notifyAll();
        }

        boolean status = this.queue.add(element);
        lock.unlock();
        return status;
    }

    public synchronized E poll() {
        lock.lock();
        while (this.queue.size() == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
            }

            if (this.queue.size() == this.size) {
                notifyAll();
            }

        }

        lock.unlock();
        return (E) this.queue.remove(0);
    }


}
