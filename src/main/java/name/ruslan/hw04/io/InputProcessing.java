package name.ruslan.hw04.io;

import name.ruslan.hw04.main.Main;
import name.ruslan.hw04.plane.Airliner;
import name.ruslan.hw04.plane.Board;
import name.ruslan.hw04.plane.Cargo;
import name.ruslan.hw04.plane.Manufacturer;
import org.apache.logging.log4j.Level;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Ruslan_Arifullin on 2/28/2017.
 */
public final class InputProcessing {

    public static List<Board> getBoards(List<String> strings) {
        List<Board> boards = new ArrayList<>();

        for (String string : strings) {
            String[] params = string.split("[ \\t]+");
            Board board = null;

            //подключить строку Integer.parseInt(data[2]) в условие
            int typeOfBoard = 0; //0 - airliner; 1 - cargo

            try {
                typeOfBoard = Integer.parseInt(params[2]);
            } catch (NumberFormatException e) {
                Main.LOGGER.log(Level.ERROR, "Wrong string is detected\n " + string);
                Main.LOGGER.log(Level.ERROR, e.getMessage());
                continue;
            }

            if (params.length == 8 && typeOfBoard == 0) { //airliner
                board = getAirliner(params);
            } else if (params.length == 7 && typeOfBoard == 1) { //cargo
                board = getCargo(params);
            } else
                Main.LOGGER.log(Level.INFO, "Wrong string is found:/n" + string);

            if (board != null)
                boards.add(board);
        }

        return boards;
    }

    private static Board getAirliner(String[] data) {
        Airliner board = new Airliner();

        Manufacturer manufacturer = null;
        String name = "";
        int consumption = 0;  //потребление топлива
        int speed = 0;        //скорость
        double range = 0.0;   //дальность полета
        int businessSeats = 0;//количество мест в бизнес-классе
        int economSeats = 0;  //количество мест в эконом-классе

        try {
            manufacturer = Manufacturer.getByCode(Integer.parseInt(data[0])); //manufacturer
            name = data[1]; //name of the board, IL-86, A-300, etc

            consumption = Integer.parseInt(data[3]);  //потребление топлива
            speed = Integer.parseInt(data[4]);        //скорость
            range = Double.parseDouble(data[5]);   //дальность полета
            businessSeats = Integer.parseInt(data[6]);//количество мест в бизнес-классе
            economSeats = Integer.parseInt(data[7]);  //количество мест в эконом-классе
        } catch (NumberFormatException e) {
            Main.LOGGER.log(Level.ERROR, "Wrong string is detected\n " + Arrays.toString(data));
            Main.LOGGER.log(Level.ERROR, e.getMessage());
            return null;
        }

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

        Manufacturer manufacturer = null;
        String name = "";
        int consumption = 0;  //потребление топлива
        int speed = 0;        //скорость
        double range = 0.0;   //дальность полета
        int carriage = 0;

        try {
            manufacturer = Manufacturer.getByCode(Integer.parseInt(data[0])); //manufacturer
            name = data[1]; //name of the board, IL-86, A-300, etc
            consumption = Integer.parseInt(data[3]);  //потребление топлива
            speed = Integer.parseInt(data[4]);        //скорость
            range = Double.parseDouble(data[5]);   //дальность полета
            carriage = Integer.parseInt(data[6]);//количество мест в бизнес-классе
        } catch (NumberFormatException e) {
            Main.LOGGER.log(Level.ERROR, "Wrong string is detected\n " + Arrays.toString(data));
            Main.LOGGER.log(Level.ERROR, e.getMessage());
            return null;
        }

        board.setManufacturer(manufacturer);
        board.setName(name);
        board.setConsumption(consumption);
        board.setSpeed(speed);
        board.setRange(range);
        board.setCarriage(carriage);

        return board;
    }


}
