/**
 * Created by k2works on 2017/04/06.
 */
public class ServiceChargeTransaction implements Transaction {
    private int itsMemberId;
    private long itsDate;
    private double itsAmount;

    public ServiceChargeTransaction(int memberId, long date, double amount) {
        itsMemberId = memberId;
        itsDate = date;
        itsAmount = amount;
    }

    public void Execute() {
        Employee e = PayrollDatabase.GetUnionMbember(itsMemberId);
        Affiliation af = e.GetAffiliation();
        if (af instanceof UnionAffiliation) {
            UnionAffiliation uaf = (UnionAffiliation) af;
            uaf.AddServiceCharge(itsDate, itsAmount);
        }
    }
}