package Tools;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTools {
    static String pattern = "yyyy-MM-dd";
    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

    public static String getDaysAfter(int days) {
        return simpleDateFormat.format(new Date(new Date().getTime() + (days * 86400000)));
    }


}