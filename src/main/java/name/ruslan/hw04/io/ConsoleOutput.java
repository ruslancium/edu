package name.ruslan.hw04.io;

import name.ruslan.hw04.main.Main;
import org.apache.logging.log4j.Level;

/**
 * Created by Ruslan_Arifullin on 2/21/2017.
 * Класс для вывода символов на консоль
 */
public class ConsoleOutput {

    public static void display(boolean flag, String text) {
        if (flag)
            System.out.println(text);
        else
            Main.LOGGER.log(Level.ERROR, text);
    }
}
