package name.ruslan.hw06.Phaser.entities;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.Phaser;

public class Ship implements Runnable {
    private final int DEFAULT_SHIP_CAPACITY = 10;
    private final int DEFAULT_NUMBER_OF_CONTAINERS = 0;

    private String name;
    private int capacity;
    private int numContainers;
    private int[] containers;
    private Storage storage = new Storage();

    public Ship(String name, int capacity, int numContainers) {
        this.name = name;
        this.capacity = capacity;
        this.numContainers = numContainers;
    }

    public Ship(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.numContainers = DEFAULT_NUMBER_OF_CONTAINERS;
    }

    public Ship(String name) {
        this.name = name;
        this.capacity = DEFAULT_SHIP_CAPACITY;
        this.numContainers = DEFAULT_NUMBER_OF_CONTAINERS;
    }

    public void run() {
        //phaser.arriveAndAwaitAdvance();
        unloadShip();

        //phaser.arriveAndAwaitAdvance();
        //loadTruck();
        //phaser.arriveAndAwaitAdvance();
        //departPort();
        //phaser.arriveAndDeregister();
    }

    private void unloadShip() {
        if (numContainers > storage.getFreeSpace()) {
            System.out.println("A place for storage is not enough. Please, come into port later");
            return;
        }

        for (int i = 0; i < numContainers; i++) {
            System.out.println("������� " + name + " ��������� ����� � ");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    private void loadTruck() {
/*
        for (int i = 0; i < capacity; i++) {
            Container g = storage.getGood();
            if (g == null) { // ���� � ��������� ������ ��� ������, 
                // �������� ��������� �����������
                return;
            }
            bodyStorage.add(g);
            System.out.println("������� " + number + " �������� ����� �"
                    + g.getRegistrationNumber());
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
*/
    }


    private void arriveAtPort() {
/*
        try {
            Thread.sleep(new Random(100).nextInt(500));
            System.out.println("�������� " + number + " ����� � ����.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
*/
    }

    private void departPort() {
/*
        try {
            Thread.sleep(new Random(100).nextInt(500));
            System.out.println("������� " + number + " ������� ����.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
*/
    }

}
