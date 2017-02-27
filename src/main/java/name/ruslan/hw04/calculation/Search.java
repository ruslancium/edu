package name.ruslan.hw04.calculation;

import name.ruslan.hw04.plane.Board;
import name.ruslan.hw04.plane.Fleet;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Ruslan_Arifullin on 2/27/2017.
 */
public class Search {
    private double minConsumption;
    private double maxConsumption;

    public Search(double minConsumption, double maxConsumption) {
        this.minConsumption = minConsumption;
        this.maxConsumption = maxConsumption;
    }

    public double getMinConsumption() {
        return minConsumption;
    }

    public void setMinConsumption(double minConsumption) {
        this.minConsumption = minConsumption;
    }

    public double getMaxConsumption() {
        return maxConsumption;
    }

    public void setMaxConsumption(double maxConsumption) {
        this.maxConsumption = maxConsumption;
    }

    public List<Board> find(Fleet fleet) {
        return fleet.getBoards().stream().filter(board -> board.getConsumption() >= minConsumption && board.getConsumption() <= maxConsumption).collect(Collectors.toCollection(ArrayList::new));
    }
}
