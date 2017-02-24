package name.ruslan.hw01.validation;

import name.ruslan.hw01.exception.CustomException;

/**
 * Created by Ruslan_Arifullin on 2/23/2017.
 */
public class RadiusValidation {

    public static boolean isConsoleRadius(double radius) throws CustomException {
        boolean result;

        if (NumberValidation.isPositive(radius))
            result = true;
        else
            throw new CustomException("The radius cannot be negative. Please run with a correct value.");

        return result;
    }

    public static boolean isFileRadius(double radius) throws CustomException {
        boolean result;

        if (NumberValidation.isNumber(String.valueOf(radius))) {
            if (radius == 0){
                throw new CustomException("The radius cannot be Zero. Please run with a correct value.");
            }
            else if (NumberValidation.isPositive(radius)) {
                result = true;
            } else {
                throw new CustomException("The radius cannot be negotive. Please run with a correct value.");
            }
        } else {
            throw new CustomException("The radius should be numeric. Please run with a correct value.");
        }

        return result;
    }
}
