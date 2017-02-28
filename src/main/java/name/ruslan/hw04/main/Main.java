package name.ruslan.hw04.main;

import name.ruslan.hw04.calculation.Calc;
import name.ruslan.hw04.exception.CustomException;
import name.ruslan.hw04.io.ConsoleOutput;
import name.ruslan.hw04.io.FileInput;
import name.ruslan.hw04.io.InputProcessing;
import name.ruslan.hw04.plane.Airliner;
import name.ruslan.hw04.plane.Board;
import name.ruslan.hw04.plane.Cargo;
import name.ruslan.hw04.plane.Fleet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ruslan_Arifullin on 2/24/2017.
 */
public class Main {

    public static void main(String[] args) throws name.ruslan.hw01.exception.CustomException {
        String filePath = "./data/planes.txt";
        Fleet fleet = new Fleet();

        FileInput fileInput = new FileInput();
        try {
            ConsoleOutput.display(true, "Load data from a file>>");
            List<String> stringsFromFile = fileInput.getStringsFromFile(filePath);
            List<Airliner> airliners = InputProcessing.getAirlinerData(stringsFromFile);
            List<Cargo> cargos =  InputProcessing.getCargoData(stringsFromFile);

            List<Board> boards = new ArrayList<>();
            boards.addAll(airliners);
            boards.addAll(cargos);

            fleet.setBoards(boards);

            ConsoleOutput.display(true, "Calculation stage>>");
            Calc calc = new Calc();

            String stringTotal = String.format("Total capacity: %d", calc.totalCapacity(airliners));
            ConsoleOutput.display(true, stringTotal);

            stringTotal = String.format("Total carriage: %d", calc.totalCarriage(cargos));
            ConsoleOutput.display(true, stringTotal);

            ConsoleOutput.display(true, "Sorting stage>>");

//            Sort sort = new Sort();
            calc.compareHumanCapacity(airliners);
            fleet.printList();
//
            calc.compareRange(fleet.getBoards());
            fleet.setBoards(fleet.getBoards());
            fleet.printList();
//
//            ConsoleOutput.display(true, "Search stage>>");
//            //double minConsumption = ConsoleInput.getDouble();
//            //double maxConsumption = ConsoleInput.getDouble();
//            //Search search = new Search(minConsumption, maxConsumption);
//            //fleet.setBoards(search.find(fleet));
        } catch (CustomException e) {
            e.printStackTrace();
        }


    }
}

