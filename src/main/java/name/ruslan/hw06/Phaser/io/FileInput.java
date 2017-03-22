package name.ruslan.hw06.Phaser.io;

import name.ruslan.hw04.exception.CustomException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ruslan_Arifullin on 2/27/2017.
 */
public class FileInput {

    public List<String> getStringsFromFile(String filePath) throws CustomException {
        File file = new File(filePath);
        List<String> strings = new ArrayList<>();
        String line = null;
        BufferedReader reader = null;

        if (!file.exists()) {
            throw new CustomException("File does not exist. Please check: " + filePath);
        }

        try {
            reader = new BufferedReader(new FileReader(file));
            line = reader.readLine();

            while (line != null) {
                strings.add(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        return strings;
    }



}
