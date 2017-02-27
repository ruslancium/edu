package name.ruslan.hw04.main;

import name.ruslan.hw04.exception.CustomException;
import name.ruslan.hw04.io.ConsoleOutput;
import name.ruslan.hw04.io.FileInput;
import name.ruslan.hw04.plane.Board;
import name.ruslan.hw04.plane.Fleet;

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
            List<Board> boards = fileInput.getData(stringsFromFile);

            fleet.setBoards(fileInput.getData(boards));

            ConsoleOutput.display(true, "Calculation stage>>");
            Sum sum = new Sum();

            String stringTotal = String.format("Total capacity: %d", sum.totalCapacity(fleet.getBoards()));
            ConsoleOutput.display(true, stringTotal);

            stringTotal = String.format("Total carriage: %d", sum.totalCarriage(fleet.getBoards()));
            ConsoleOutput.display(true, stringTotal);

            ConsoleOutput.display(true, "Sorting stage>>");

            Sort sort = new Sort();
            sort.compareHumanCapacity(fleet.getBoards());
            fleet.printList();

            sort.compareRange(fleet.getBoards());
            fleet.setBoards(fleet.getBoards());
            fleet.printList();

            ConsoleOutput.display(true, "Search stage>>");
            //double minConsumption = ConsoleInput.getDouble();
            //double maxConsumption = ConsoleInput.getDouble();
            //Search search = new Search(minConsumption, maxConsumption);
            //fleet.setBoards(search.find(fleet));
        } catch (CustomException e) {
            e.printStackTrace();
        }


    }
}

