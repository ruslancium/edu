package by.epam.jmp.less031517.calculator;

/**
 * Created by Ruslan_Arifullin on 3/29/2017.
 */
public class Main {
    public static void main(String[] args) {
        for (int i=1; i<=10; i++){
            Calculator calculator=new Calculator(i);
            Thread thread=new Thread(calculator);
            thread.start();
        }
    }
}
