/**
 * Created by k2works on 2017/04/06.
 */
public interface Affiliation {
    double GetServiceCharge(long date);

    double CalculateDeductions(Paycheck pc);
}
