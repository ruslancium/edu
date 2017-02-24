package name.ruslan.hw01.main;

import name.ruslan.hw01.calc.Area;
import name.ruslan.hw01.calc.Circumference;
import name.ruslan.hw01.exception.CustomException;
import name.ruslan.hw01.io.ConsoleInput;
import name.ruslan.hw01.io.ConsoleOutput;

/**
 * Created by Ruslan_Arifullin on 2/24/2017.
 */
public class MainConsole {

    public static void main(String[] args) {
        double radius = 0;
        double circumference = 0;
        double area = 0;

        try {
            radius = ConsoleInput.getDouble();
            if (radius != 0.0) {
                circumference = Circumference.calculate(radius);
                area = Area.calculate(radius);

                ConsoleOutput.display(true,String.format("Radius = %f, Circumference = %f, Area = %f", radius, circumference, area));
            }
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }
}
