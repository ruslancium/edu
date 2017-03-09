package by.epam.jmp.less_pattern.numTwo;

/**
 * Created by Ruslan_Arifullin on 3/9/2017.
 */
public class TaskManager extends AbstractHandler {
    @Override
    public void handleRequest(Employee emp) {
        assignTask();
    }

    public void assignTask() {
        System.out.println("assign task");
    }
}
