package name.ruslan.hw04.io;

/**
 * Created by Ruslan_Arifullin on 2/21/2017.
 * Класс для вывода символов на консоль
 */
public class ConsoleOutput {

    public static void display(boolean flag, String text) {
        if (flag)
            System.out.println(text);
        else
            System.out.println("error: " + text);
    }
}
