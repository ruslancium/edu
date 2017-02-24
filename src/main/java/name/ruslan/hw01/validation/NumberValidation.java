package name.ruslan.hw01.validation;

/**
 * Created by Ruslan_Arifullin on 2/23/2017.
 */
public class NumberValidation {

    public static boolean isInteger(String source) {
        boolean result = false;

        try {
            Integer.parseInt(source);
            result = true;
        }
        catch (NumberFormatException e) {
            result = false;
        }

        return result;
    }

    public static boolean isNumber(String source) {
        return source.matches("[+-]?\\\\d+(.\\\\d+)?");
    }

    public static boolean isPositive(byte x) {
        return (( x >> 7 ) & 1) == 0;
    }

    public static boolean isPositive(short x) {
        return (( x >> 15 ) & 1) == 0;
    }

    public static boolean isPositive(int x) {
        return (( x >> 31 ) & 1) == 0;
    }

    public static boolean isPositive(long x) {
        return (( x >> 63 ) & 1) == 0;
    }

    public static boolean isPositive(float x) {
        return isPositive((int) x);
    }

    public static boolean isPositive(double x) {
        return isPositive((long) x);
    }
}
