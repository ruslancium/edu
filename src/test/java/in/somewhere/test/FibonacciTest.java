package in.somewhere.test;

import in.somewhere.Fibonacci;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * Created by Ruslan_Arifullin on 2/15/2017.
 */
@RunWith(Parameterized.class)
public class FibonacciTest {

    @Parameterized.Parameters(name="{index}: fib({0})={1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 0, 0 }, { 1, 1 }, { 2, 1 }, { 3, 2 }, { 4, 3 }, { 5, 5 }, { 6, 8 }
        });
    }

    @Parameterized.Parameter
    public int fInput;

    @Parameterized.Parameter(1)
    public int fExpected;

    @Test
    public void test() {
        assertEquals(fExpected, Fibonacci.compute(fInput));
    }
}
