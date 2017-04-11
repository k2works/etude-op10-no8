package ClassificationTransactions;

import Classifications.HourlyClassification;
import PayrollDomain.PaymentClassification;
import PayrollDomain.PaymentSchedule;
import Schedules.WeeklySchedule;
import PayrollFactory.PayrollFactory;

/**
 * Created by k2works on 2017/04/07.
 */
public class ChangeHourlyTransaction extends ChangeClassificationTransaction {
    private double itsRate;
    private PayrollFactory itsPayrollFactory;

    public ChangeHourlyTransaction(int empId, double rate, PayrollFactory payrollFactory) {
        super(empId);
        itsRate = rate;
        itsPayrollFactory = payrollFactory;
    }

    PaymentSchedule GetSchedule() {
        return new WeeklySchedule();
    }

    PaymentClassification GetClassification() {
        return new HourlyClassification(itsRate);
    }
}
