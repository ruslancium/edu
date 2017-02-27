package name.ruslan.hw04.plane;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Ruslan_Arifullin on 2/24/2017.
 */
public enum Manufacturer {
    DEFAULT,
    BOEING,
    AIRBUS,
    TU,
    AN;

    static Map<Integer, Manufacturer> map =  new HashMap<>();

    static {
        for (Manufacturer manufacturer: Manufacturer.values()) {
            map.put(manufacturer.ordinal(), manufacturer);
        }
    }

    public static Manufacturer getByCode(int code) {
        return map.get(code);
    }

    @Override
    public List<String> toString() {
        List<String> result = new ArrayList<>();

        for (Map.Entry<Integer, Manufacturer> man : map.entrySet())
            result.add(String.format("%s : manufacturers are presented like %d", man.getValue().name(), man.getKey()));

        return result;
    }
}
