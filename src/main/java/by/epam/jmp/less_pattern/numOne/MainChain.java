package by.epam.jmp.less_pattern.numOne;

/**
 * Created by Ruslan_Arifullin on 3/9/2017.
 */
public class MainChain {
    public static void main(String[] args) {
        Task root = new Task("�������� �����!");
        SubTask subTask = new SubTask(root, "�������� ����");
        Question question = new Question(subTask, "������� ������������");

        System.out.println("Message for question < " + question.handleRequest() + ">");
    }
}
