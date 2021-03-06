package name.ruslan.hw06.Phaser.io;

import name.ruslan.hw01.exception.CustomException;

import java.util.Scanner;

/**
 * Created by Ruslan_Arifullin on 2/21/2017.
 */
public final class ConsoleInput {

    public static int getInteger() throws CustomException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input an integer > ");

        int x = 0;

        if (sc.hasNextInt()) {
            x = sc.nextInt();
        } else {
            sc.next();
            throw new CustomException("The value should be integer. Please try again");
        }

        return x;
    }

    public static double getDouble() throws CustomException {
        Scanner sc = new Scanner(System.in);
        System.out.print("PLease input a double > ");

        double val = 0.0;

        if (sc.hasNextDouble()) {
            val = sc.nextDouble();
        } else {
            sc.next();
            throw new CustomException("The value should be double. Please try again");
        }

        return val;
    }

    public static String getString() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input a string... > ");
        return sc.next();
    }
}