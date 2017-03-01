package name.ruslan.hw04.io;

import name.ruslan.hw04.plane.Airliner;
import name.ruslan.hw04.plane.Cargo;
import name.ruslan.hw04.plane.Manufacturer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ruslan_Arifullin on 2/28/2017.
 */
public final class InputProcessing {

    private static boolean isAirliner(int type) {
        return type == 0; //0 - airliner, 1 - cargo
    }

    private static boolean isCargo(int type) {
        return type == 1; //0 - airliner, 1 - cargo
    }

    public static List<Airliner> getAirlinerData(List<String> strings) {

        List<Airliner> airliners = new ArrayList<>();

        for (String string : strings) {
            String[] params = string.split("[ \\t]+");

            if (isCorrectData(params, 8)) { //������ ���������� ������?
                Manufacturer manufacturer = Manufacturer.getByCode(Integer.parseInt(params[0])); //manufacturer
                String name = params[1]; //name of the board, IL-86, A-300, etc

                int typeOfBoard = Integer.parseInt(params[2]); //0 - airliner, 1 - cargo
                if (isAirliner(typeOfBoard)) {
                    int consumption = Integer.parseInt(params[3]);  //����������� �������
                    int speed = Integer.parseInt(params[4]);        //��������
                    double range = Double.parseDouble(params[5]);   //��������� ������
                    int businessSeats = Integer.parseInt(params[6]);//���������� ���� � ������-������
                    int economSeats = Integer.parseInt(params[7]);  //���������� ���� � ������-������

                    Airliner board = new Airliner();
                    board.setManufacturer(manufacturer);
                    board.setName(name);
                    board.setConsumption(consumption);
                    board.setSpeed(speed);
                    board.setRange(range);
                    board.setBusinessSeats(businessSeats);
                    board.setEconomSeats(economSeats);

                    airliners.add(board);
                }
            }
            else {
                //������� � ���, ��� ������ �� ��
            }

        }

        return airliners;
    }

    public static List<Cargo> getCargoData(List<String> strings) {
        List<Cargo> cargos = new ArrayList<>();

        for (String string : strings) {
            String[] params = string.split("[ \\t]+");
            if (isCorrectData(params, 6)) { //������ ���������� ������?

                Manufacturer manufacturer = Manufacturer.getByCode(Integer.parseInt(params[0])); //manufacturer
                String name = params[1]; //name of the board, IL-86, A-300, etc

                int typeOfBoard = Integer.parseInt(params[2]); //0 - airliner, 1 - cargo
                if (isCargo(typeOfBoard)) {
                    int consumption = Integer.parseInt(params[3]);  //����������� �������
                    int speed = Integer.parseInt(params[4]);        //��������
                    double range = Double.parseDouble(params[5]);   //��������� ������
                    int carriage = Integer.parseInt(params[6]);//���������� ���� � ������-������

                    Cargo board = new Cargo();
                    board.setManufacturer(manufacturer);
                    board.setName(name);
                    board.setConsumption(consumption);
                    board.setSpeed(speed);
                    board.setRange(range);
                    board.setCarriage(carriage);

                    cargos.add(board);
                }
            }
            else {
                //������� � ���, ��� ������ �� ��
            }

        }

        return cargos;
    }

    private static boolean isCorrectData(String[] params, int requiredQunatity) {
        return params.length == requiredQunatity;
    }
}
