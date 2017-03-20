package name.ruslan.hw03.io;

import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ruslan_Arifullin on 2/28/2017.
 */
public final class InputProcessing {

    public final static Logger LOGGER = LogManager.getLogger(InputProcessing.class.getSimpleName());

    public static List<Integer> getIntegers(List<String> strings) {
        List<Integer> numbers = new ArrayList<>();
        int number = 0;

        for (String string : strings) {

            try {
                number = Integer.parseInt(string); //0 - airliner; 1 - cargo
            } catch (NumberFormatException e) {
                LOGGER.log(Level.ERROR, "Wrong number is detected:  " + string + " stack trace: " + e.getMessage());
                return null;
            }

            numbers.add(number);
        }

        return numbers;
    }
}
