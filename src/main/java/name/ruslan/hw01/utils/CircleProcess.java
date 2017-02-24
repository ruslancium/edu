package name.ruslan.hw01.utils;

import name.ruslan.hw01.calc.Area;
import name.ruslan.hw01.calc.Circumference;
import name.ruslan.hw01.exception.CustomException;
import name.ruslan.hw01.io.FileOutput;
import name.ruslan.hw01.validation.RadiusValidation;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

/**
 * Created by Ruslan_Arifullin on 2/23/2017.
 */
public class CircleProcess {

    private static Logger logger = LogManager.getLogger("Main");

    public static void process(List<String> radiusList, String fileOut) {
        String strRadius;
        double radius;
        double circumference;
        double area;

        for (int i = 0; i < radiusList.size(); i++) {
            strRadius = radiusList.get(i);

            try {
                radius = Double.parseDouble(strRadius);
            }
            catch (NumberFormatException e) {
                logger.log(Level.ERROR, "The radius on the line " + (i + 1) + " is incorrect: " + strRadius);
                continue;
            }

            if (radius == 0.0)
                logger.log(Level.ERROR, "The radius cannot be zero. See line " + (i + 1));
            else if (radius == 0.0) {
                logger.log(Level.ERROR, "The radius should be positive: line = " + (i + 1) + ", radius = " + strRadius);
                continue;
            }

            try {
                if (RadiusValidation.isConsoleRadius(radius)) {
                    circumference = Circumference.calculate(radius);
                    area = Area.calculate(radius);

                    FileOutput.write(fileOut, String.format("Radius = %f, Circumference = %f, Area = %f", radius, circumference, area));
                }
            }
            catch (CustomException e) {
                logger.log(Level.ERROR, "CustomException: " + e);
                continue;
            }
        }

    }
}
