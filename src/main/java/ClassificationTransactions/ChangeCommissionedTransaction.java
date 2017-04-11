package ClassificationTransactions;

import Classifications.CommissionedClassification;
import PayrollDomain.PaymentClassification;
import PayrollDomain.PaymentSchedule;
import PayrollFactory.PayrollFactory;
import Schedules.BiweeklySchedule;

/**
 * Created by k2works on 2017/04/07.
 */
public class ChangeCommissionedTransaction extends ChangeClassificationTransaction {
    private double itsSalary;
    private double itsHourlyRate;
    private PayrollFactory itsPayrollFactory;

    public ChangeCommissionedTransaction(int empId, double salary, double hourlyRate, PayrollFactory payrollFactory) {
        super(empId);
        itsSalary = salary;
        itsHourlyRate = hourlyRate;
        itsPayrollFactory = payrollFactory;
    }

    PaymentSchedule GetSchedule() {
        return new BiweeklySchedule();
    }

    PaymentClassification GetClassification() {
        return new CommissionedClassification(itsSalary, itsHourlyRate);
    }
}
