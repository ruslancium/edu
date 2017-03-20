package name.ruslan.hw06;

import java.util.Iterator;
import java.util.Queue;

/**
 * Created by Ruslan_Arifullin on 3/20/2017.
 */
public class Storage implements Iterable<Item> {
    public static final int DEFAULT_STORAGE_CAPACITY = 20;
    private Queue<Item> goods = null;

    @Override
    public Iterator<Item> iterator() {
        return null;
    }

    private Storage(){

    }
}
