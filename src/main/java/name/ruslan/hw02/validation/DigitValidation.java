package name.ruslan.hw02.validation;

/**
 * Created by Ruslan_Arifullin on 2/22/2017.
 */
public class DigitValidation {
    public static boolean isValid(byte x, int dg) {
        return (dg == 1);
    }

    public static boolean isValid(short x, int dg) {
        return isValid((long) x, dg);
    }

    public static boolean isValid(int x, int dg) {
        return isValid((long) x, dg);
    }

    public static boolean isValid(long x, int dg) {
        // System.out.println("x = " + x + ", length =" + String.valueOf(x).length() + ", dg =" + dg);
        return (String.valueOf(x).length() == dg);
    }

    public static boolean isValid(float x, int dg) {
        String xStr = Float.toString(Math.abs(x));
        int intPlaces = xStr.indexOf('.');
        int decimalPlaces = xStr.length() - intPlaces - 1;

        return (intPlaces + decimalPlaces) == dg;
    }

    public static boolean isValid(double x, int dg) {
        String xStr = Double.toString(Math.abs(x));
        int intPlaces = xStr.indexOf('.');
        int decimalPlaces = xStr.length() - intPlaces - 1;

        return (intPlaces + decimalPlaces) == dg;
    }

}
