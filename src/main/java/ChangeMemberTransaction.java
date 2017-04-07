/**
 * Created by k2works on 2017/04/07.
 */
public class ChangeMemberTransaction extends ChangeAffiliationTransaction {
    private int itsMemberId;
    private double itsDues;

    public ChangeMemberTransaction(int empId, int memberId, double dues) {
        super(empId);
        itsMemberId = memberId;
        itsDues = dues;
    }

    Affiliation GetAffiliation() {
        return new UnionAffiliation(itsMemberId,itsDues);
    }

    void RecordMembership(Employee e) {
        PayrollDatabase.AddUnionMember(itsMemberId, e);
    }
}
