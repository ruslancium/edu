package by.epam.jmp.less031517;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class CalcCallable implements Callable<Number> {
    @Override
    public Number call() throws Exception {
        TimeUnit.MILLISECONDS.sleep(10);
        Number res = new Random().nextGaussian(); // имитация вычислений
        return res;
    }
}
