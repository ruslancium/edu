package name.ruslan.hw04.plane;

/**
 * Created by Ruslan_Arifullin on 2/24/2017.
 */
public enum Manufacturer {
    DEFAULT(0),
    BOEING(1),
    AIRBUS(2),
    TU(3),
    AN(4);

    private int typeCode;

    public int getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(int typeCode) {
        this.typeCode = typeCode;
    }

    @Override
    public String toString() {
        return String.format("%s : manufacturers are presented like %d", name(), typeCode);
    }
}
