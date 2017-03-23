package by.epam.jmp.less031517;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class RunExecutor {
    public static void main(String[] args) throws Exception {
        
        ExecutorService es = Executors.newFixedThreadPool(3);
        ArrayList<Future<String>> list = new ArrayList<Future<String>>();
        for (int i = 0; i < 7; i++) {
            list.add(es.submit(new BaseCallable()));
        }
        for (Future<String> future : list) {
            System.out.println(future.get() + " result fixed");
        }
    }
}
