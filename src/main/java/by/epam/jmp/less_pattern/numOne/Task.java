package by.epam.jmp.less_pattern.numOne;

/**
 * Created by Ruslan_Arifullin on 3/9/2017.
 */
public class Task implements BaseInterface {

    private String message = "";

    public Task(String message) {
        this.message = message;
    }

    @Override
    public String handleRequest() {
        System.out.println("Message in task: " + message);
        return message;
    }
}
