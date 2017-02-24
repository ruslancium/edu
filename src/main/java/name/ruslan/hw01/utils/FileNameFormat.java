package name.ruslan.hw01.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by Ruslan_Arifullin on 2/23/2017.
 */
public class FileNameFormat {

    public static String getFileName(String name, String extension) {
        SimpleDateFormat format = new SimpleDateFormat();
        Calendar cal = Calendar.getInstance();

        String strDate = format.format(cal.getTime());

        return String.format("%s_%s.%s", name, strDate, extension);
    }
}
