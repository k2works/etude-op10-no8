/**
 * Created by k2works on 2017/04/07.
 */
public class NoAffiliation implements Affiliation {
    public double GetServiceCharge(long date) {
        return 0;
    }

    public double CalculateDeductions(Paycheck pc) {
        return 0;
    }
}
