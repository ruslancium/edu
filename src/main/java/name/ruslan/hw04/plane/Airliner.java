package name.ruslan.hw04.plane;

/**
 * Created by Ruslan_Arifullin on 2/28/2017.
 */
public class Airliner extends Board {

    private int businessSeats;
    private int economSeats;

    public int getBusinessSeats() {
        return businessSeats;
    }

    public void setBusinessSeats(int businessSeats) {
        this.businessSeats = businessSeats;
    }

    public int getEconomSeats() {
        return economSeats;
    }

    public void setEconomSeats(int economSeats) {
        this.economSeats = economSeats;
    }

    @Override
    public String toString() {
        String result = super.toString();

        result += "\n Unique features{" +
                "quantity of seats in econom class =" + economSeats + "\n" +
                "quantity of seats in business class =" + businessSeats + "\n" +
                "}";

        return result;
    }

}
