package name.ruslan.hw05;

/**
 * Created by Ruslan_Arifullin on 3/10/2017.
 */
public class SenteinceHandler implements Handler {
    @Override
    public void handleMessage() {

    }

    @Override
    public String[] handleText(String input) {
        String separator = "[\\.]+";
        String[] strings = input.split(separator);
        return strings;
    }
}
