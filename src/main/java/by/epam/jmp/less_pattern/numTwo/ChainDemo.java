package by.epam.jmp.less_pattern.numTwo;

/**
 * Created by Ruslan_Arifullin on 3/9/2017.
 */
public class ChainDemo {
        static public void main(String[] args) {
            Employee user = new Employee(30, "user", "passwordUser");
// конфигурирование цепи
            RoleManager rm = new RoleManager();
            Authentification auth = new Authentification();
            TaskManager tm = new TaskManager();
            auth.setSuccessor(rm);
            rm.setSuccessor(tm);
            System.out.println("----chain--start----");
            auth.chain(user);
    }
}
