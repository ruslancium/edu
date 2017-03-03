package ruslan.name.test.hw03;

import name.ruslan.hw03.calc.Analysis;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Ruslan_Arifullin on 3/3/2017.
 */
public class AnalysisTest {

    private  List<Integer> indata() {
        List<Integer> input = new ArrayList<>();
        input.add(0);
        input.add(4);
        input.add(6);
        input.add(7);
        input.add(0);

        return input;
    }

    private  List<Integer> outdata() {
        List<Integer> output = new ArrayList<>();
        output.add(0);
        output.add(4);

        return output;
    }


    @Test
    public void test() {
        assertEquals(outdata(), Analysis.getPositionsOfZeros(indata()));
    }
}
