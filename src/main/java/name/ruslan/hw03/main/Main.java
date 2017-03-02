package name.ruslan.hw03.main;

import name.ruslan.hw03.calc.Analysis;
import name.ruslan.hw03.exception.CustomException;
import name.ruslan.hw03.io.ConsoleOutput;
import name.ruslan.hw03.io.FileInput;
import name.ruslan.hw03.io.FileOutput;
import name.ruslan.hw03.io.InputProcessing;

import java.util.List;
import java.util.Scanner;

/**
 * Created by Ruslan_Arifullin on 2/24/2017.
 * В целочисленной последовательности есть нулевые элементы. Создать массив из
 номеров этих элементов.
 */
public class Main {

    public static void main(String[] args) throws CustomException {
        Scanner sc = new Scanner(System.in);

        ConsoleOutput.display(true, "Please input a path to input file");
        String fileInPath = sc.next();

        ConsoleOutput.display(true, "Please input a path to output file");
        String fileOutPath = sc.next();

        FileInput fileInput = new FileInput();

        List<String> sequenceString = fileInput.getStringsFromFile(fileInPath);
        List<Integer> sequenceNumbers = InputProcessing.getIntegers(sequenceString);
        List<Integer> zeroElementsPosition = Analysis.getPositionsOfZeros(sequenceNumbers);

        if (sequenceNumbers.size() == 0) {
            ConsoleOutput.display(false, "The input file either is empty or contains wrong data");
        }
        else {
            //записываем нулевые элементы в файл
            FileOutput.writeList(fileOutPath, zeroElementsPosition);
        }
    }
}