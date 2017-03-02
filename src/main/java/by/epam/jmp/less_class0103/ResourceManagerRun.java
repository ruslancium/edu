package by.epam.jmp.less_class0103;

import java.util.Locale;

/**
 * Created by Ruslan_Arifullin on 3/2/2017.
 */
public class ResourceManagerRun {
    public static void main(String[] args) {
        ResourceManager manager = ResourceManager.INSTANCE;

        System.out.println(manager.getString("str1"));
        manager.changeResource(new Locale("be","BY"));
        System.out.println(manager.getString("str1"));
    }
}
