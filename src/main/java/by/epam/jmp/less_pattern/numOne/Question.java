package by.epam.jmp.less_pattern.numOne;

/**
 * Created by Ruslan_Arifullin on 3/9/2017.
 */
public class Question implements BaseInterface {
    private String message = "";
    private SubTask parent = null;

    public Question(SubTask parent, String message) {
        this.parent = parent;
        this.message = message;
    }

    @Override
    public String handleRequest() {
        System.out.println("Message in question: " + message);
        if (parent == null) {
            return message;
        }
        else {
            return parent.handleRequest();
        }
    }
}
