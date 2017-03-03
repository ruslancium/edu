package name.ruslan.hw04.main;

import name.ruslan.hw04.calculation.Calc;
import name.ruslan.hw04.exception.CustomException;
import name.ruslan.hw04.io.ConsoleInput;
import name.ruslan.hw04.io.ConsoleOutput;
import name.ruslan.hw04.io.FileInput;
import name.ruslan.hw04.io.InputProcessing;
import name.ruslan.hw04.plane.Airliner;
import name.ruslan.hw04.plane.Board;
import name.ruslan.hw04.plane.Cargo;
import name.ruslan.hw04.plane.Fleet;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ruslan_Arifullin on 2/24/2017.
 */
public class Main {
    public final static Logger LOGGER = LogManager.getLogger(Logger.class.getSimpleName());

    public static void main(String[] args) throws CustomException, name.ruslan.hw01.exception.CustomException {

        ConsoleOutput.display(true, "Please input filepath and filename");
        String filePath = ConsoleInput.getString();
        Fleet fleet = new Fleet();

        FileInput fileInput = new FileInput();
        try {
            ConsoleOutput.display(true, "Stage of loading data from file...");
            List<String> stringsFromFile = fileInput.getStringsFromFile(filePath);
            List<Board> boards = InputProcessing.getBoards(stringsFromFile);

            fleet.setBoards(boards);

            ConsoleOutput.display(true, "Calculation stage>>");
            Calc calc = new Calc();

            List<Airliner> airliners = new ArrayList<>();
            List<Cargo> cargos = new ArrayList<>();
            for (Board board : boards) {
                if (board instanceof Airliner) {
                    airliners.add((Airliner)board);
                }
                else
                    cargos.add((Cargo)board);
            }

            String stringTotal = String.format("Total capacity: %d", calc.totalCapacity(airliners));
            ConsoleOutput.display(true, stringTotal);

            stringTotal = String.format("Total carriage: %d", calc.totalCarriage(cargos));
            ConsoleOutput.display(true, stringTotal);

            ConsoleOutput.display(true, "\n\nSorting stage>>");

            calc.compareHumanCapacity(airliners);
            fleet.setBoards(airliners);
            fleet.printList();

            fleet.setBoards(boards);
            calc.compareRange(fleet.getBoards());
            fleet.printList();

            ConsoleOutput.display(true, "\n\nSearch stage>>");
            ConsoleOutput.display(true, "Please enter minimum value of fuel consumption");
            int minConsumption = ConsoleInput.getInteger();

            ConsoleOutput.display(true, "Please enter maximum value of fuel consumption");
            int maxConsumption = ConsoleInput.getInteger();
            fleet.setBoards(calc.findBoardConsuption(fleet.getBoards(), minConsumption, maxConsumption));
            fleet.printList();
        } catch (CustomException e) {
            ConsoleOutput.display(false, e.getMessage());
        }
    }
}