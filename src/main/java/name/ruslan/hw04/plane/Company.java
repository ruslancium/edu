package name.ruslan.hw04.plane;

/**
 * Created by Ruslan_Arifullin on 2/24/2017.
 */
public enum Company {
    DEFAULT(0),
    BOEING(1),
    AIRBUS(2),
    TU(3),
    AN(4);

    private int typeCode;

    private Company(int typeCode) {
        this.typeCode = typeCode;
    }

    public int getTypeCode() {
        return typeCode;
    }
}
