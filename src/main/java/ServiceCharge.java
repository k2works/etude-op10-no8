/**
 * Created by k2works on 2017/04/06.
 */
public class ServiceCharge {
    private long itsDate;
    private double itsAmount;

    public ServiceCharge(long date, double amount) {
        itsDate = date;
        itsAmount = amount;
    }

    public long GetDate() {
        return itsDate;
    }

    public double GetAmount() {
        return itsAmount;
    }
}
