package by.epam.jmp.less_pattern.numTwo;

import java.util.HashMap;

/**
 * Created by Ruslan_Arifullin on 3/9/2017.
 */
public class MapEmployee {
    private HashMap<Integer, Employee> users = new HashMap<Integer, Employee>();

    public MapEmployee() {
        users.put(1, new Employee(10, "admin", "passwordAdmin"));
        users.put(2, new Employee(20, "employee", "passwordEmployee"));
        users.put(3, new Employee(30, "user", "passwordUser"));
    }
    public HashMap<Integer, Employee> getUsers() {
        return users;
    }
    public boolean containsUser(Employee emp) {
        return users.containsValue(emp);
    }
}
