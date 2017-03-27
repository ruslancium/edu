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
// �������� ��������� �������      
        Container[] goods = new Container[20];
        for (int i = 0; i < goods.length; i++) {
            goods[i] = new Container(i + 1);
        }
        List<Container> listGood = Arrays.asList(goods);
        // �������� ������, �� �������� �������� ������
        Storage storage = Storage.createStorage(listGood.size(), listGood);

        // �������� ������ ��� ������������� �������� ������� ����������
        Phaser phaser = new Phaser();
        phaser.register();
        int currentPhase;
        // �������� ������� ����������
        Thread[] threads = new Thread[20];

        for (int i = 0; i < 20; i++) {
            threads[i] = new Thread(new Ship"tr" + i));
        }
        printGoodsToConsole("������ �� ������ ", storage);
        // ������ ������� ���������� �� ��������, ���������, �������� � ��������

        for (int i = 0; i < 20; i++) {
            threads[i].start();
        }

        // ������������� ��������
        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("�������� �������� � ����. ���� " + currentPhase
                + " ���������.");

        // ������������� ���������
        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("��������� �������� ���������. ���� " + currentPhase
                + " ���������.");

        // ������������� ��������
        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("�������� �������� ���������. ���� " + currentPhase
                + " ���������.");

        //������� ���� �� �����
        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("������� ����. ���� " + currentPhase
                + " ���������.");

        phaser.arriveAndDeregister();
        if (phaser.isTerminated()) {
            System.out.println("���� ���������������� � ���������.");
        }
        printGoodsToConsole("������ �� ������ ", storage);

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
