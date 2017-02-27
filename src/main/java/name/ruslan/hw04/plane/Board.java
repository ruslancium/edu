package name.ruslan.hw04.plane;

/**
 * Created by Ruslan_Arifullin on 2/24/2017.
 */
public class Board {

    private Manufacturer manufacturer;  //manufacturer name
    private String name;      //name of board
    private int consumption;
    private int capacity;
    private int carriage;
    private int speed;
    private double range;      //range of flight

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCarriage() {
        return carriage;
    }

    public void setCarriage(int carriage) {
        this.carriage = carriage;
    }

    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        this.range = range;
    }

    @Override
    public String toString() {
        return "Board{" +
                "manufacturer=" + manufacturer.toString() +
                ", name='" + name + '\'' +
                ", consumption=" + consumption +
                ", capacity=" + capacity +
                ", carriage=" + carriage +
                ", speed=" + speed +
                ", range=" + range +
                '}';
    }
}
