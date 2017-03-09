package by.epam.jmp.less_pattern.numTwo;

/**
 * Created by Ruslan_Arifullin on 3/9/2017.
 */
public class Authentification extends AbstractHandler {
    public Authentification() {

    }

    @Override
    public void handleRequest(Employee user) {
        if (checkStatus(user)) {

        }
    }

    public boolean checkStatus(Employee user) {
        boolean flag = true;
        System.out.println(user);
        System.out.println("check user status");
        return flag;
    }
}
