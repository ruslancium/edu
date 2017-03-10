package name.ruslan.hw05;

import java.util.List;

/**
 * Created by Ruslan_Arifullin on 3/10/2017.
 */
public interface Handler {
    void handleMessage();

    String[] handleText(String input);
}
