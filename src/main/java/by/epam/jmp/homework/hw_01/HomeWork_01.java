package by.epam.jmp.homework.hw_01;

import java.io.*;

/**
 * Created by Ruslan_Arifullin on 2/20/2017.
 * Описание: в параметре запуска указывается путь и название входного файла с числами и путь и название
 *           выходного файла. Числа могут быть разделены пробелами, знаками табуляции, знаками переноса строки
 *           Задача: посчитать произведение элементов в каждом числе. *
 */
public class HomeWork_01 {

    public static void main(String[] args) {

        try {
            System.out.print("Please type down filepath and filename for input> ");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = reader.readLine();

            System.out.print("Please type down filepath and filename for output> ");
            BufferedReader readerOut = new BufferedReader(new InputStreamReader(System.in));

            reader = new BufferedReader(new FileReader(fileName));
            String fileOutName = readerOut.readLine();
            FileWriter writer = new FileWriter(fileOutName);
            readerOut.close();

            String text = null;
            String[] elems = null;
            while ((text = reader.readLine()) != null) {
                elems = text.split("[ \\t]+");
                for (String elem : elems){
                    writer.write(calcMult(elem) + " ");
                }
                writer.write('\n');
            }

            writer.close();
            reader.close();
        } catch (IOException e) {
        }
    }


    //считаем произведение
    public static Integer calcMult(String element) {
        int mult = 1;

        char[] chrElements = element.toCharArray();

        int figure = 0;
        for (char chr : chrElements) {
            figure = Character.getNumericValue(chr);

            if ((figure < 0) || (figure > 9)) {
                System.out.println("A wrong sign " + chr  + " has been found in the figure " + element);
                return null;
            }

            mult *= Character.getNumericValue(chr);
        }

        return mult;
    }
}
