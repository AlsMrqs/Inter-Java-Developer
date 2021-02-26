package basico.datas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDateFormatted {

    static final
    SimpleDateFormat pattern = new SimpleDateFormat("dd/MM/yyyy HH:mm:SS:MMM");

    public static String
    getDate () {
        return pattern.format(new Date());
    }
}
