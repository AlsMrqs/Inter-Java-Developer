package basico.datas;

import java.time.LocalDateTime;

public class SetAndChangeDate {

    public static void
    main(String[] args) {
        LocalDateTime date = LocalDateTime.of(2010,5,15,10,0,0);
        LocalDateTime newDate = date.plusYears(4).plusMonths(6).plusHours(13);

        System.out.println("Before change: "+ date);
        System.out.println("After change: "+ newDate);
    }
}
