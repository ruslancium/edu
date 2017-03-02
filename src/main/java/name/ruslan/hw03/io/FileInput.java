package name.ruslan.hw03.io;

import name.ruslan.hw03.exception.CustomException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ruslan_Arifullin on 2/27/2017.
 */
public final class FileInput {

    public static List<String> getStringsFromFile(String filePath) throws CustomException {
        //resource loading is taken from http://howtodoinjava.com/core-java/io/read-file-from-resources-folder/
        ClassLoader classLoader = new FileInput().getClass().getClassLoader();

        //File file = new File(filePath);
        File file = new File(classLoader.getResource(filePath).getFile());
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
