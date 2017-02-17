package in.somewhere;

/**
 * Created by Ruslan_Arifullin on 2/15/2017.
 */
public class Fibonacci {
    public static int compute(int n) {
        int result = 0;

        if (n <= 1) {
            result = n;
        } else {
            result = compute(n - 1) + compute(n - 2);
        }

        return result;
    }
}
