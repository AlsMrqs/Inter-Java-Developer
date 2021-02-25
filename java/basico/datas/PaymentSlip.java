package basico.datas;

import java.util.Calendar;

public class PaymentSlip {

    private Calendar expiration;
    private Calendar lastPayDay;

    public
    PaymentSlip (Calendar expiration) {
        setExpiration(expiration);
        setLastPayDay(expiration);
    }

    public void
    setExpiration (Calendar expiration) {
        this.expiration = (Calendar) expiration.clone();
    }

    private void
    setLastPayDay (Calendar expiration) {
        lastPayDay = (Calendar) expiration.clone();
        lastPayDay.add(Calendar.DATE, 10);

        int weekday = lastPayDay.get(Calendar.DAY_OF_WEEK);

        lastPayDay.add(Calendar.DATE,
                weekday == 7    ? +2 :
                weekday == 1    ? +1 : 0
        );
    }

    public Calendar
    getExpiration () { return expiration; }

    public Calendar
    getLastPayDay () { return lastPayDay; }
}
