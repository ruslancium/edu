package name.ruslan.hw06.Phaser.entities;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.Phaser;

public class Ship implements Runnable {
    private final int DEFAULT_SHIP_STORAGE_CAPACITY = 10;
    private Phaser phaser;
    private String number;
    private int capacity;
    private Storage storage;
    private Queue<Container> bodyStorage;

    public Ship(Phaser phaser, String name, int capacity, Storage storage
    ) {
        this.phaser = phaser;
        this.number = name;
        this.capacity = capacity;
        this.bodyStorage = new ArrayDeque<Container>(capacity);
        this.storage = storage;
        this.phaser.register();
    }

    public Ship(Phaser phaser, String name, Storage storage
    ) {
        this.phaser = phaser;
        this.number = name;
        this.capacity = DEFAULT_SHIP_STORAGE_CAPACITY;
        this.bodyStorage = new ArrayDeque<Container>(capacity);
        this.storage = storage;
        this.phaser.register();
    }


    public void run() {
        arriveAtPort();
        phaser.arriveAndAwaitAdvance();
        unloadTruck();
        phaser.arriveAndAwaitAdvance();
        loadTruck();
        phaser.arriveAndAwaitAdvance();
        departPort();
        phaser.arriveAndDeregister();
    }

    private void loadTruck() {
        for (int i = 0; i < capacity; i++) {
            Container g = storage.getGood();
            if (g == null) { // если в хранилище больше нет товара, 
                // загрузка грузовика прерывается
                return;
            }
            bodyStorage.add(g);
            System.out.println("Корабль " + number + " загрузил товар №"
                    + g.getRegistrationNumber());
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void unloadTruck() {
        int size = bodyStorage.size();
        for (int i = 0; i < size; i++) {
            Container g = bodyStorage.poll();
            storage.setGood(g);
            System.out.println("Корабль " + number + " разгрузил товар №"
                    + g.getRegistrationNumber());
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void arriveAtPort() {
        try {
            Thread.sleep(new Random(100).nextInt(500));
            System.out.println("Грузовик " + number + " зашел в порт.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void departPort() {
        try {
            Thread.sleep(new Random(100).nextInt(500));
            System.out.println("Корабль " + number + " покинул порт.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
