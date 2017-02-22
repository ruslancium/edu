package name.ruslan.hw02.io;

import name.ruslan.hw02.main.CustomException;

import java.util.Scanner;

/**
 * Created by Ruslan_Arifullin on 2/21/2017.
 * ����� ��� ���������� �������� �� �������
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

    public static double getDouble() throws CustomException {
        Scanner sc = new Scanner(System.in);
        System.out.println("PLease input a double > ");

        double val = 0.0;

        if (sc.hasNextDouble()) {
            val = sc.nextDouble();
        } else {
            sc.next();
            throw new CustomException("The value should be double. Please try again");
        }

        return val;
    }
}
