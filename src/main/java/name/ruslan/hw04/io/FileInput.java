package name.ruslan.hw04.io;

import name.ruslan.hw04.exception.CustomException;
import name.ruslan.hw04.plane.Board;
import name.ruslan.hw04.plane.Manufacturer;

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

    public List<Board> readData(String filePath) throws CustomException {
        File file = new File(filePath);
        List<Board> boards = new ArrayList<Board>();
        String line = null;
        BufferedReader reader = null;

        if (!file.exists()) {
            throw new CustomException("File does not exist. Please check: " + filePath);
        }

        try {
            reader = new BufferedReader(new FileReader(file));
            line = reader.readLine();

            while (line != null) {
                String[] params = line.split("[ \\t]+");

                Manufacturer manufacturer = new Manufacturer().setTypeCode(Integer.parseInt(params[0]));
                String name = params[1];
                int consumption = Integer.parseInt(params[2]);
                int capacity = Integer.parseInt(params[3]);
                int carriage = Integer.parseInt(params[4]);
                int speed = Integer.parseInt(params[5]);
                double range = Double.parseDouble(params[6]);

                Board board = new Board();
                board.setManufacturer(manufacturer);
                board.setName(name);
                board.setConsumption(consumption);
                board.setCapacity(capacity);
                board.setCarriage(carriage);
                board.setSpeed(speed);
                board.setRange(range);

                boards.add(board);

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

        return boards;
    }
}
