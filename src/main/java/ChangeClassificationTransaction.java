/**
 * Created by k2works on 2017/04/07.
 */
public abstract class ChangeClassificationTransaction extends ChangeEmployeeTransaction {

    public ChangeClassificationTransaction(int empId) {
        super(empId);
    }

    public void Change(Employee e) {
        e.SetSchedule(GetSchedule());
        e.SetClassification(GetClassification());
    }

    abstract PaymentSchedule GetSchedule();

    abstract PaymentClassification GetClassification();
}