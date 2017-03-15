package name.ruslan.hw05;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ruslan_Arifullin on 3/10/2017.
 */
public class ParagraphHandler implements Handler {
    private String inputText;
    private List<String> outputText = new ArrayList<>();

    @Override
    public void handleMessage() {

    }

    @Override
    public String[] handleText(String inputText) {
        String separator=System.getProperty("line.separator");
        String[] strings = inputText.split(separator);
        return strings;
    }
}
