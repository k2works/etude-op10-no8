package ClassificationTransactions;

import Classifications.SalariedClassification;
import PayrollDomain.PaymentClassification;
import PayrollDomain.PaymentSchedule;
import Schedules.MonthlySchedule;
import PayrollFactory.PayrollFactory;

/**
 * Created by k2works on 2017/04/07.
 */
public class ChangeSalariedTransaction extends ChangeClassificationTransaction {
    private double itsSalary;
    private PayrollFactory itsPayrollFactory;

    public ChangeSalariedTransaction(int empId, double salary, PayrollFactory payrollFactory) {
        super(empId);
        itsSalary = salary;
        itsPayrollFactory = payrollFactory;
    }

    PaymentSchedule GetSchedule() {
        return new MonthlySchedule();
    }

    PaymentClassification GetClassification() {
        return new SalariedClassification(itsSalary);
    }
}
