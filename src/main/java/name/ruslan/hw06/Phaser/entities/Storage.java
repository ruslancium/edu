package name.ruslan.hw06.Phaser.entities;

import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Storage implements Iterable<Container> {
    public static final int DEFAULT_STORAGE_CAPACITY = 20;
    private Queue<Container> goods = null;
    public static final int DEFAULT_SHIP_CAPACITY = 3;
    private Queue<Ship> ships = null;

    private Storage() {
        goods = new LinkedBlockingQueue<Container>(DEFAULT_STORAGE_CAPACITY);
        ships = new LinkedBlockingQueue<Ship>(DEFAULT_SHIP_CAPACITY);
    }

    private Storage(int capacity) {
        goods = new LinkedBlockingQueue<Container>(capacity);
        ships = new LinkedBlockingQueue<Ship>(DEFAULT_SHIP_CAPACITY);
    }

    public static Storage createStorage(int capacity) {
        Storage storage = new Storage(capacity);
        return storage;
    }

    public static Storage createStorage(int capacity, List<Container> goods) {
        Storage storage = new Storage(capacity);
        storage.goods.addAll(goods);
        return storage;
    }

    public Container getGood() {
        return goods.poll();
    }

    public boolean setGood(Container good) {
        return goods.add(good);
    }

    @Override
    public Iterator<Container> iterator() {
        return goods.iterator();
    }
}
