package name.ruslan.hw01.main;

import name.ruslan.hw01.calc.Multiplication;
import name.ruslan.hw01.io.ConsoleInput;
import name.ruslan.hw01.io.ConsoleOutput;
import name.ruslan.hw01.validation.MultValidation;

/**
 * Created by Ruslan_Arifullin on 2/21/2017.
 * Главный класс исполнения программы
 */
public class Main {

    public static void main(String[] args) {
        int x  = 0;
        long resultCalc = 0;


        try {
            x = ConsoleInput.getInteger();
            if (MultValidation.isNumber(x, 4)) {
                resultCalc = Multiplication.calculate(x);
                ConsoleOutput.display(true, "Digits multiplication of the number " + x + " equals " + resultCalc);
            }
        }
        catch (CustomException e) {
            ConsoleOutput.display(false, e.toString());
        }
    }
}
