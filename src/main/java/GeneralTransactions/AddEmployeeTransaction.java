package GeneralTransactions;

import Methods.HoldMethod;
import PayrollDatabase.GlobalDatabase;
import PayrollDomain.Employee;
import PayrollDomain.PaymentClassification;
import PayrollDomain.PaymentMethod;
import PayrollDomain.PaymentSchedule;
import TransactionApplication.Transaction;

/**
 * Created by k2works on 2017/04/06.
 */
public abstract class AddEmployeeTransaction implements Transaction {
    private int itsEmpId;
    private String itsName;
    private String itsAddress;

    public AddEmployeeTransaction(int empId, String name, String address) {
        itsEmpId = empId;
        itsName = name;
        itsAddress = address;
    }

    public void Execute() {
        PaymentClassification pc = GetClassification();
        PaymentSchedule ps = GetSchedule();
        PaymentMethod pm = new HoldMethod();
        Employee e = new Employee(itsEmpId, itsName, itsAddress);
        e.SetClassification(pc);
        e.SetSchedule(ps);
        e.SetMethod(pm);
        GlobalDatabase.payrollDB.AddEmployee(itsEmpId, e);
    }

    abstract PaymentSchedule GetSchedule();

    abstract PaymentClassification GetClassification();
}
