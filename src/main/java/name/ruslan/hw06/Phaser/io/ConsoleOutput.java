package name.ruslan.hw06.Phaser.io;

import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * Created by Ruslan_Arifullin on 2/21/2017.
 * ????? ??? ?????? ???????? ?? ???????
 */
public class ConsoleOutput {

    public final static Logger LOGGER = LogManager.getLogger(ConsoleOutput.class.getSimpleName());

    public static void display(boolean flag, String text) {
        if (flag)
            System.out.println(text);
        else
            LOGGER.log(Level.ERROR, text);
    }
}
