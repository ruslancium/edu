package by.epam.jmp.less_pattern.numOne;

/**
 * Created by Ruslan_Arifullin on 3/9/2017.
 */
public class SubTask implements BaseInterface {
    private String message = "";
    private Task root = null;

    public SubTask(Task root, String message) {
        this.root = root;
        this.message = message;
    }

    @Override
    public String handleRequest() {
        System.out.println("Message in subtask: " + message);
        if (root == null) {
            return message;
        }
        else {
            return root.handleRequest();
        }
    }
}
