package name.ruslan.hw05.Composite;

import java.util.List;

/**
 * Created by Ruslan_Arifullin on 3/15/2017.
 */
public interface Element {

    void add(Element e);

    void remove(Element e);

    List<Element> getElements();

    String toString();
}
