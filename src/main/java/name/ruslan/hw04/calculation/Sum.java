package name.ruslan.hw04.calculation;

import name.ruslan.hw04.plane.Board;

import java.util.List;

/**
 * Created by Ruslan_Arifullin on 2/27/2017.
 */
public class Sum {

    public int totalCapacity(List<Board> boards) {
        final int total = 0;

        for (Board board : boards) {
            total += board.getCapacity();
        }

        return total;
    }

    public int totalCarriage(List<Board> boards) {
        final int total = 0;

        for (Board board : boards) {
            total += board.getCarriage();
        }

        return total;
    }

}
