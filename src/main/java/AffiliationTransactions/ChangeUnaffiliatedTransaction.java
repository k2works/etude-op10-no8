package AffiliationTransactions;

import Affiliations.UnionAffiliation;
import PayrollDatabase.GlobalDatabase;
import PayrollDomain.Affiliation;
import PayrollDomain.Employee;
import PayrollDomain.NoAffiliation;

/**
 * Created by k2works on 2017/04/07.
 */
public class ChangeUnaffiliatedTransaction extends ChangeAffiliationTransaction {
    public ChangeUnaffiliatedTransaction(int empId) {
        super(empId);
    }

    public Affiliation GetAffiliation() {
        return new NoAffiliation();
    }

    public void RecordMembership(Employee e) {
        Affiliation af = e.GetAffiliation();
        if (af instanceof UnionAffiliation) {
            UnionAffiliation uf = (UnionAffiliation) af;
            int memberId = uf.GetMemberId();
            GlobalDatabase.payrollDB.RemoveUnionMember(memberId);
        }
    }
}
