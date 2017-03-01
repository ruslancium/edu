package name.ruslan.hw04.io;

import name.ruslan.hw04.main.Main;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by Ruslan_Arifullin on 2/21/2017.
 * ����� ��� ������ �������� �� �������
 */
public class ConsoleOutput {

    public final static Logger LOGGER = LogManager.getLogger("Console Output");

    public static void display(boolean flag, String text) {
        if (flag)
            System.out.println(text);
        else
            LOGGER.log(Level.ERROR, text);
    }
}
