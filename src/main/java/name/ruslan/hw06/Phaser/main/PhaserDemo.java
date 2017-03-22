package name.ruslan.hw06.Phaser.main;

import name.ruslan.hw06.Phaser.entities.Container;
import name.ruslan.hw06.Phaser.entities.Ship;
import name.ruslan.hw06.Phaser.entities.Storage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Phaser;

public class PhaserDemo {
    public static void main(String[] args) {
// создание коллекцию товаров      
        Container[] goods = new Container[20];
        for (int i = 0; i < goods.length; i++) {
            goods[i] = new Container(i + 1);
        }
        List<Container> listGood = Arrays.asList(goods);
        // создание склада, из которого забирают товары
        Storage storage = Storage.createStorage(listGood.size(), listGood);

        // создание фазера для синхронизации движения колонны грузовиков
        Phaser phaser = new Phaser();
        phaser.register();
        int currentPhase;
        // создание колонны грузовиков
        Thread tr1 = new Thread(new Ship(phaser, "tr1", 5, storage));
        Thread tr2 = new Thread(new Ship(phaser, "tr2", 6, storage));
        Thread tr3 = new Thread(new Ship(phaser, "tr3", 7, storage));
        Thread tr4 = new Thread(new Ship(phaser, "tr4", storage));
        printGoodsToConsole("Товары на складе ", storage);
        // запуск колонны грузовиков на прибытие, разгрузку, загрузку и отплытие
        tr1.start();
        tr2.start();
        tr3.start();
        tr4.start();

        // синхронизация прибытия
        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Прибытие корбалей в порт. Фаза " + currentPhase
                + " завершена.");

        // синхронизация разгрузки
        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Разгрузка кораблей завершена. Фаза " + currentPhase
                + " завершена.");

        // синхронизация загрузки
        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Загрузка кораблей завершена. Фаза " + currentPhase
                + " завершена.");

        //корабли ушли из порта
        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Корабли ушли. Фаза " + currentPhase
                + " завершена.");

        phaser.arriveAndDeregister();
        if (phaser.isTerminated()) {
            System.out.println("Фазы синхронизированы и завершены.");
        }
        printGoodsToConsole("Товары на складе ", storage);

    }

    public static void printGoodsToConsole(String title, Storage storage) {
        System.out.println(title);
        Iterator<Container> goodIterator = storage.iterator();
        while (goodIterator.hasNext()) {
            System.out.print(goodIterator.next().getRegistrationNumber() + " ");
        }
        System.out.println();
    }
}
