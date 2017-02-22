package name.ruslan.hw02.validation;

import name.ruslan.hw02.main.CustomException;

/**
 * Created by Ruslan_Arifullin on 2/22/2017.
 */
public class MultValidation {
    public static boolean isNumber(int x, int digits) throws CustomException {
        boolean result = true;
        x = Math.abs(x);

        if (x == 0)
            throw new CustomException("Zero is not suitable. Please run with a correct value.");
        else if (!DigitValidation.isValid(x, digits))
            throw new CustomException("The number of digits should be " + digits + ". Please run with a correct value ");

        return result;
    }
}
