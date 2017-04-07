/**
 * Created by k2works on 2017/04/07.
 */
public class ChangeSalariedTransaction extends ChangeClassificationTransaction {
    private double itsSalary;

    public ChangeSalariedTransaction(int empId, double salary) {
        super(empId);
        itsSalary = salary;
    }

    PaymentSchedule GetSchedule() {
        return new MonthlySchedule();
    }

    PaymentClassification GetClassification() {
        return new SalariedClassification(itsSalary);
    }
}
