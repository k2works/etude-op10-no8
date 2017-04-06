import java.util.HashMap;
import java.util.Map;

/**
 * Created by k2works on 2017/04/06.
 */
public class UnionAffiliation implements Affiliation {
    private Map<Long, ServiceCharge> itsServiceCharges = new HashMap<Long, ServiceCharge>();

    public UnionAffiliation(double d) {
    }

    public double GetServiceCharge(long date) {
        if (itsServiceCharges.get(date) == null) {
            return 0;
        }
        return itsServiceCharges.get(date).GetAmount();
    }

    public void AddServiceCharge(long date, double amount) {
        itsServiceCharges.put(date, new ServiceCharge(date, amount));
    }
}
