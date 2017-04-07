/**
 * Created by k2works on 2017/04/07.
 */
public abstract class ChangeAffiliationTransaction extends ChangeEmployeeTransaction {
    public ChangeAffiliationTransaction(int empId) {
        super(empId);
    }

    void Change(Employee e) {
        RecordMembership(e);
        e.SetAffiliation(GetAffiliation());
    }

    abstract void RecordMembership(Employee e);

    abstract Affiliation GetAffiliation();
}
