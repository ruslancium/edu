package name.ruslan.hw02.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Ruslan_Arifullin on 2/22/2017.
 */
public class FileOutput {
    public static void write(String filePath, String text) {
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
}
