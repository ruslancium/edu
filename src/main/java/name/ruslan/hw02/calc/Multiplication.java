package name.ruslan.hw02.calc;

/**
 * Created by Ruslan_Arifullin on 2/22/2017.
 */
public class Multiplication {

    public static long calculate(int value) {
        long result;
        int digit;

        if (value == 0)
            result = 0;
        else {
            value = Math.abs(value);
            result = 1;

            while (value >= 1) {
                digit = value % 10;
                value /= 10;
                result *= digit;
            }
        }

        return result;
    }
}
