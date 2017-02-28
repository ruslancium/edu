package name.ruslan.hw04.plane;

/**
 * Created by Ruslan_Arifullin on 2/28/2017.
 */
public class Cargo extends Board {
    private int carriage;

    @Override
    public int getCarriage() {
        return carriage;
    }

    @Override
    public void setCarriage(int carriage) {
        this.carriage = carriage;
    }

    @Override
    public String toString() {
        String result = super.toString();

        result += "\n Unique features{" +
                "carriage =" + carriage + "\n" +
                ":";

        return result;
    }

}
