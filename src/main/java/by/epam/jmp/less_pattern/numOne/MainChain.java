package by.epam.jmp.less_pattern.numOne;

/**
 * Created by Ruslan_Arifullin on 3/9/2017.
 */
public class MainChain {
    public static void main(String[] args) {
        Task root = new Task("Получить зачет!");
        SubTask subTask = new SubTask(root, "написать тест");
        Question question = new Question(subTask, "Сделать лабораторную");

        System.out.println("Message for question < " + question.handleRequest() + ">");
    }
}
