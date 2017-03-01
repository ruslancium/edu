package name.ruslan.hw04.plane;

import name.ruslan.hw04.io.ConsoleOutput;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ruslan_Arifullin on 2/27/2017.
 */
public class Fleet {

    private List<? extends Board> boards = new ArrayList<>();

    public List<? extends Board> getBoards() {
        return boards;
    }

    public void setBoards(List<? extends Board> boards) {
        this.boards = boards;
    }

    public void printList() {
        for (Board board: boards) {
            ConsoleOutput.display(true, board.toString());
        }
    }
}
