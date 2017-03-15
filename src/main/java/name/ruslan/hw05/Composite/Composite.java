package name.ruslan.hw05.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ruslan_Arifullin on 3/15/2017.
 */
public class Composite implements Element {
    private List<Element> elements = new ArrayList<>();

    @Override
    public void add(Element e) {
        elements.add(e);
    }

    @Override
    public void remove(Element e) {
        elements.remove(e);
    }

    @Override
    public List<Element> getElements() {
        return elements;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Element e : elements) {
            sb.append(e.toString()).append(" ");
        }
        return sb.toString();
    }
}
