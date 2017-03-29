package by.epam.jmp.less031517.calculator2;

import java.io.FileWriter;
import java.io.PrintWriter;

/**
 * Created by Ruslan_Arifullin on 3/29/2017.
 */
public class Main {

    public static void main(String[] args) {
        Thread threads[]=new Thread[10];
        Thread.State status[]=new Thread.State[10];
        for (int i=0; i<10; i++){
            threads[i]=new Thread(new Calculator(i));
            if ((i%2)==0){
                threads[i].setPriority(Thread.MAX_PRIORITY);
            } else {
                threads[i].setPriority(Thread.MIN_PRIORITY);
            }
            threads[i].setName("Thread "+i);

            try (FileWriter file = new FileWriter(".\\data\\log.txt");
                 PrintWriter pw = new PrintWriter(file);){
                for (int i=0; i<10; i++){
                    pw.println("Main : Status of Thread "+i+" : " + threads[i].getState());
                    status[i]=threads[i].getState();
                }

                for (int i=0; i<10; i++){
                    threads[i].start();
                }

                boolean finish=false;

                while (!finish) {
                    for (int i=0; i<10; i++){
                        if (threads[i].getState()!=status[i]) {
                            writeThreadInfo(pw, threads[i],status[i]);
                            status[i]=threads[i].getState();
                        }
                    }

                    finish=true;
                    for (int i=0; i<10; i++){
                        finish=finish &&(threads[i].getState() == State.TERMINATED);
                    }

                }

            }
        }x
    }
}
