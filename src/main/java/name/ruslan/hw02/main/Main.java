package name.ruslan.hw02.main;

import name.ruslan.hw02.calc.Multiplication;
import name.ruslan.hw02.io.ConsoleInput;
import name.ruslan.hw02.io.ConsoleOutput;
import name.ruslan.hw02.validation.MultValidation;

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
