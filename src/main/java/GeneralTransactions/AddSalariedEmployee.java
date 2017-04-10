package GeneralTransactions;

import Classifications.SalariedClassification;
import PayrollDomain.PaymentClassification;
import PayrollDomain.PaymentSchedule;
import Schedules.MonthlySchedule;

/**
 * Created by k2works on 2017/04/06.
 */
public class AddSalariedEmployee extends AddEmployeeTransaction {
    private double itsSalary;

    public AddSalariedEmployee(int empId, String name, String address, double salary) {
        super(empId, name, address);
        itsSalary = salary;
    }

    public PaymentClassification GetClassification() {
        return new SalariedClassification(itsSalary);
    }

    public PaymentSchedule GetSchedule() {
        return new MonthlySchedule();
    }
}
