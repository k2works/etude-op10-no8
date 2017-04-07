import java.util.Calendar;

/**
 * Created by k2works on 2017/04/06.
 */
public class WeeklySchedule implements PaymentSchedule {
    public boolean IsPayDate(Calendar payDate) {
        return false;
    }

    public Calendar GetPayPeriodStartDate(Calendar payDate) {
        return null;
    }
}
