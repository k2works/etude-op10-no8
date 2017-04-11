package GeneralTransactions;

import Classifications.CommissionedClassification;
import PayrollDomain.PaymentClassification;
import PayrollDomain.PaymentSchedule;
import PayrollFactory.PayrollFactory;
import Schedules.BiweeklySchedule;

/**
 * Created by k2works on 2017/04/06.
 */
public class AddCommissionedEmployee extends AddEmployeeTransaction {
    private double itsSalary;
    private double itsCommissionRate;

    public AddCommissionedEmployee(int empId, String name, String address, double salary, double commissionRate, PayrollFactory payrollFactory) {
        super(empId, name, address, payrollFactory);
        itsSalary = salary;
        itsCommissionRate = commissionRate;
    }

    PaymentClassification GetClassification() {
        return new CommissionedClassification(itsSalary, itsCommissionRate);
    }

    PaymentSchedule GetSchedule() {
        return new BiweeklySchedule();
    }
}
