package name.ruslan.hw04.calculation;

import name.ruslan.hw04.io.ConsoleOutput;
import name.ruslan.hw04.plane.Board;

import java.util.List;

/**
 * Created by Ruslan_Arifullin on 2/27/2017.
 */
public class Sort {

    public void compareHumanCapacity(List<Board> boards) {
        boards.sort((board1, board2) -> {
            int cmp = Integer.compare(board1.getCapacity(), board2.getCapacity());

            return cmp;
        });
    }

    public void compareRange(List<Board> boards) {
        boards.sort((board1, board2) -> {
            int cmp = Double.compare(board1.getRange(), board2.getRange());

            return cmp;
        });
    }
}
