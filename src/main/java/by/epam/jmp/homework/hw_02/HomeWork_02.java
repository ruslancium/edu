package by.epam.jmp.homework.hw_02;

import java.io.*;

/**
 * Created by Ruslan_Arifullin on 2/20/2017.
 * Описание: в параметре запуска указывается путь и название входного файла с числами и путь и название
 *           выходного файла. Числа могут быть разделены пробелами, знаками табуляции, знаками переноса строки
 *           Задача: посчитать произведение элементов в каждом числе. *
 */
public class HomeWork_02 {
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
                    double radius = Double.parseDouble(elem);
                    double square = calculateSquare(radius);
                    double circumference = calculateLength(radius);
                    String out = String.format("Radius %f, circle area %f, circumference %f \n", radius, square, circumference);

                    writer.write(out);
                }
            }

            writer.close();
            reader.close();
        } catch (NumberFormatException e) {
        } catch (IOException e) {
        }
    }

    //площадь круга
    public static double calculateSquare(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    //длина окружности
    public static double calculateLength(double radius) {
        return Math.PI * radius * 2;
    }
}
