package name.ruslan.hw02.io;

import name.ruslan.hw02.main.CustomException;

import java.util.Scanner;

/**
 * Created by Ruslan_Arifullin on 2/21/2017.
 * Класс для считывания символов из консоли
 */
public class ConsoleInput {

    public static int getInteger() throws CustomException {
        Scanner sc = new Scanner(System.in);
        System.out.println("PLease input an integer > ");

        int x = 0;

        if (sc.hasNextInt()) {
            x = sc.nextInt();
        } else {
            sc.next();
            throw new CustomException("The value should be integer. Please try again");
        }

        return x;
    }
}
