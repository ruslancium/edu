package by.epam.jmp.less_class0103;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Ruslan_Arifullin on 3/2/2017.
 */
public enum ResourceManager {
    INSTANCE;

    private ResourceBundle resourceBundle;
    private final String resourceName = "properties.text";

    ResourceManager() {
        resourceBundle = ResourceBundle.getBundle(resourceName, Locale.getDefault());
    }

    public void changeResource(Locale locale) {
        resourceBundle = ResourceBundle.getBundle(resourceName, locale);
    }

    public String getString(String key) {
        return resourceBundle.getString(key);
    }
}
