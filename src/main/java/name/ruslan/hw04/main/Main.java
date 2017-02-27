package name.ruslan.hw04.main;

import name.ruslan.hw04.calculation.Sort;
import name.ruslan.hw04.calculation.Sum;
import name.ruslan.hw04.exception.CustomException;
import name.ruslan.hw04.io.ConsoleOutput;
import name.ruslan.hw04.io.FileInput;
import name.ruslan.hw04.plane.Board;
import name.ruslan.hw04.plane.Fleet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ruslan_Arifullin on 2/24/2017.
 */
public class Main {

    public static void main(String[] args) {
        String filePath = "";
        Fleet fleet = new Fleet();

        FileInput fileInput = new FileInput();
        try {
            ConsoleOutput.display(true, "Load data from a file>>");
            fleet.setBoards(fileInput.readData(filePath));

            ConsoleOutput.display(true, "Calculation stage>>");
            Sum sum = new Sum();

            String stringTotal = String.format("Total capacity: %d", sum.totalCapacity(fleet.getBoards()));
            ConsoleOutput.display(true, stringTotal);

            stringTotal = String.format("Total carriage: %d", sum.totalCarriage(fleet.getBoards()));
            ConsoleOutput.display(true, stringTotal);


            ConsoleOutput.display(true, "Sorting stage>>");
            List<Board> boards = new ArrayList<>();
            Sort sort = new Sort();
            sort.compareHumanCapacity(boards);
            sort.printList(boards);

            sort.compareRange(boards);
            sort.printList(boards);

            ConsoleOutput.display(true, "Sorting stage>>");




        } catch (CustomException e) {
            e.printStackTrace();
        }


    }
}
