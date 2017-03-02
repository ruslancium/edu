package name.ruslan.hw03.calc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ruslan_Arifullin on 3/2/2017.
 */
public final class Analysis {

    public static List<Integer> getPositionsOfZeros(List<Integer> elems) {

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < elems.size(); i++) {
            if (elems.get(i) == 0) {
                result.add(i);
            }
        }

        return result;
    }
}
