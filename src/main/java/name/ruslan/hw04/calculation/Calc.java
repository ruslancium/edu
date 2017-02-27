package name.ruslan.hw04.calculation;

import name.ruslan.hw04.plane.Board;
import name.ruslan.hw04.plane.Fleet;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Ruslan_Arifullin on 2/27/2017.
 */
public class Calc {

    //����� ����� �� ����������� �������
    public List<Board> findBoardConsuption(List<Board> boards, int minConsumption, int maxConsumption) {
        return boards.stream().filter(board -> board.getConsumption() >= minConsumption && board.getConsumption() <= maxConsumption).collect(Collectors.toCollection(ArrayList::new));
    }

    //���������� ������ �� �����������
    public void compareHumanCapacity(List<Board> boards) {
        boards.sort((board1, board2) -> {
            int cmp = Integer.compare(board1.getCapacity(), board2.getCapacity());

            return cmp;
        });
    }

    //���������� ������ �� ��������� ������
    public void compareRange(List<Board> boards) {
        boards.sort((board1, board2) -> {
            int cmp = Double.compare(board1.getRange(), board2.getRange());

            return cmp;
        });
    }


    //������� ����� �����������
    public int totalCapacity(List<Board> boards) {
        int total = 0;

        for (Board board : boards) {
            total += board.getCapacity();
        }

        return total;
    }

    //������� ����� ����������������
    public int totalCarriage(List<Board> boards) {
        int total = 0;

        for (Board board : boards) {
            total += board.getCarriage();
        }

        return total;
    }

}
