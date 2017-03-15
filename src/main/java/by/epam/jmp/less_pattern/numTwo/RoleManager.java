package by.epam.jmp.less_pattern.numTwo;

/**
 * Created by Ruslan_Arifullin on 3/9/2017.
 */
public class RoleManager extends AbstractHandler {

    @Override
    public void handleRequest(Employee emp) {
        checkPermission();
    }

    public void checkPermission() {
        System.out.println("Checking role");
    }
}
