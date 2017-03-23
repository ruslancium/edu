package name.ruslan.hw06.Phaser.io;

import name.ruslan.hw04.plane.Airliner;
import name.ruslan.hw04.plane.Board;
import name.ruslan.hw04.plane.Cargo;
import name.ruslan.hw04.plane.Manufacturer;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ruslan_Arifullin on 2/28/2017.
 */
public final class InputProcessing {

    public final static Logger LOGGER = LogManager.getLogger("InputProcessing.class");

    public static List<Board> getBoards(List<String> strings) {
        List<Board> boards = new ArrayList<>();

        for (String string : strings) {
            String[] params = string.split("[\\s]+");
            Board board = null;

            try {
                int typeOfBoard = Integer.parseInt(params[2]); //0 - airliner; 1 - cargo

                if (params.length == 8 && typeOfBoard == 0) { //airliner
                    board = getAirliner(params);
                } else if (params.length == 7 && typeOfBoard == 1) { //cargo
                    board = getCargo(params);
                } else
                    LOGGER.log(Level.ERROR, "Wrong string is found:/n" + string);

                if (board != null)
                    boards.add(board);
            } catch (NumberFormatException e) {
                LOGGER.log(Level.ERROR, "Wrong string is detected\n " + string + ":" + e.getMessage());
                continue;
            }

        }

        return boards;
    }

    private static Board getAirliner(String[] data) {
        Airliner board = new Airliner();

        Manufacturer manufacturer = Manufacturer.getByCode(Integer.parseInt(data[0])); //manufacturer
        String name = data[1]; //name of the board, IL-86, A-300, etc;
        int consumption = Integer.parseInt(data[3]);  //??????????? ???????
        int speed = Integer.parseInt(data[4]);        //????????
        double range = Double.parseDouble(data[5]);   //????????? ??????
        int businessSeats = Integer.parseInt(data[6]);//?????????? ???? ? ??????-??????
        int economSeats = Integer.parseInt(data[7]);  //?????????? ???? ? ??????-??????

        board.setManufacturer(manufacturer);
        board.setName(name);
        board.setConsumption(consumption);
        board.setSpeed(speed);
        board.setRange(range);
        board.setBusinessSeats(businessSeats);
        board.setEconomSeats(economSeats);

        return board;
    }

    private static Board getCargo(String[] data) {
        Cargo board = new Cargo();

        Manufacturer manufacturer = Manufacturer.getByCode(Integer.parseInt(data[0])); //manufacturer
        String name = data[1]; //name of the board, IL-86, A-300, etc
        int consumption = Integer.parseInt(data[3]);
        int speed = Integer.parseInt(data[4]);
        double range = Double.parseDouble(data[5]);
        int carriage = Integer.parseInt(data[6]);

        board.setManufacturer(manufacturer);
        board.setName(name);
        board.setConsumption(consumption);
        board.setSpeed(speed);
        board.setRange(range);
        board.setCarriage(carriage);

        return board;
    }
}
