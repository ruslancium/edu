package name.ruslan.hw03.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Created by Ruslan_Arifullin on 2/22/2017.
 */
public class FileOutput {

    public static void writeList(String filePath, List<Integer> numbers) {
        File file = new File(filePath);
        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter(file, true));
            if (!file.exists()) file.createNewFile();

            for (Integer number : numbers) {
                bw.write(number);
                bw.newLine();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void writeString(String filePath, String text) {
        File file = new File(filePath);
        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter(file, true));
            if (!file.exists()) file.createNewFile();

            bw.write(text);
            bw.newLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
