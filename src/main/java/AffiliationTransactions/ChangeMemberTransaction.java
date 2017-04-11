package AffiliationTransactions;

import Affiliations.UnionAffiliation;
import PayrollDatabase.GlobalDatabase;
import PayrollDomain.Affiliation;
import PayrollDomain.Employee;
import PayrollFactory.PayrollFactory;

/**
 * Created by k2works on 2017/04/07.
 */
public class ChangeMemberTransaction extends ChangeAffiliationTransaction {
    private int itsMemberId;
    private double itsDues;
    private PayrollFactory itsPayrollFactory;

    public ChangeMemberTransaction(int empId, int memberId, double dues, PayrollFactory payrollFactory) {
        super(empId);
        itsMemberId = memberId;
        itsDues = dues;
        itsPayrollFactory = payrollFactory;
    }

    public Affiliation GetAffiliation() {
        return new UnionAffiliation(itsMemberId, itsDues);
    }

    public void RecordMembership(Employee e) {
        GlobalDatabase.payrollDB.AddUnionMember(itsMemberId, e);
    }
}