package name.ruslan.hw01.main;

import name.ruslan.hw01.exception.CustomException;
import name.ruslan.hw01.io.FileInput;
import name.ruslan.hw01.utils.CircleProcess;
import name.ruslan.hw01.utils.FileNameFormat;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.List;


/**
 * Created by Ruslan_Arifullin on 2/24/2017.
 */
public class MainFile {

    private static final Logger LOGGER = LogManager.getLogger("Main");

    public static void main(String[] args) {
        String fileIn = "data\\data.txt";
        String fileOut = null;

        List<String> radiusList = null;

        try {
            radiusList = FileInput.loadData(fileIn);
            fileOut = FileNameFormat.getFileName("data\\output_", "txt");
            CircleProcess.process(radiusList, fileOut);

        } catch (RuntimeException  ex) {
            LOGGER.log(Level.ERROR, "RuntimeException: " + ex);
        } catch (CustomException ex) {
            LOGGER.log(Level.ERROR, "CustomException: " + ex);
        }
    }

}
