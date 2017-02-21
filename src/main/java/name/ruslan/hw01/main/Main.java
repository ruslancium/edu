package name.ruslan.hw01.main;

import name.ruslan.hw01.io.ConsoleInput;
import name.ruslan.hw01.io.ConsoleOutput;

/**
 * Created by Ruslan_Arifullin on 2/21/2017.
 * Главный класс исполнения программы
 */
public class Main {

    public static void main(String[] args) {
        int x  = 0;

        try {
            x = ConsoleInput.getInteger();

        }
        catch (CustomException e) {
            ConsoleOutput.display(e.toString());
        }
    }
}
