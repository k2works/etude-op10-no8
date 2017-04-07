/**
 * Created by k2works on 2017/04/07.
 */
public class ChangeHourlyTransaction extends ChangeClassificationTransaction {
    private double itsRate;

    public ChangeHourlyTransaction(int empId, double rate) {
        super(empId);
        itsRate = rate;
    }

    PaymentSchedule GetSchedule() {
        return new WeeklySchedule();
    }

    PaymentClassification GetClassification() {
        return new HourlyClassification(itsRate);
    }
}
