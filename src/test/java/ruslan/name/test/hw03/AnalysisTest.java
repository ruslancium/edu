package ruslan.name.test.hw03;

import name.ruslan.hw03.calc.Analysis;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


/**
 * Created by Ruslan_Arifullin on 3/3/2017.
 */
public class AnalysisTest {

    private List<Integer> indata;
    private List<Integer> outdata;

    @Before
    public void initData() {
        indata = new ArrayList<Integer>(){
            void addElem() {
                add(0);
                add(4);
                add(6);
                add(7);
                add(0);
            }
        };

        outdata = new ArrayList<Integer>() {
            void addElem() {
                add(0);
                add(4);
            }
        };
    }

    @Test
    public void getPositionsOfZerostTest() {
        assertEquals(outdata, Analysis.getPositionsOfZeros(indata));
    }
}
