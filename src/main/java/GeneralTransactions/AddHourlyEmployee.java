package GeneralTransactions;

import Classifications.HourlyClassification;
import PayrollDomain.PaymentClassification;
import PayrollDomain.PaymentSchedule;
import Schedules.WeeklySchedule;

/**
 * Created by k2works on 2017/04/06.
 */
public class AddHourlyEmployee extends AddEmployeeTransaction {
    private double itsHourlyRate;

    public AddHourlyEmployee(int empId, String name, String address, double hourlyRate) {
        super(empId, name, address);
        itsHourlyRate = hourlyRate;
    }

    PaymentClassification GetClassification() {
        return new HourlyClassification(itsHourlyRate);
    }

    PaymentSchedule GetSchedule() {
        return new WeeklySchedule();
    }
}
