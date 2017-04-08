import java.util.Calendar;

/**
 * Created by k2works on 2017/04/06.
 */
public class SalesReceiptTransaction implements Transaction {
    private Calendar itsSaleDate;
    private double itsAmount;
    private int itsEmpId;

    public SalesReceiptTransaction(Calendar saleDate, double amount, int empId) {
        itsSaleDate = saleDate;
        itsAmount = amount;
        itsEmpId = empId;
    }

    public void Execute() {
        Employee e = PayrollDatabase.GetEmployee(itsEmpId);
        if (e != null) {
            PaymentClassification pc = e.GetClassification();
            if (pc instanceof CommissionedClassification) {
                CommissionedClassification cc = (CommissionedClassification) pc;
                cc.AddReceipt(new SalesReceipt(itsSaleDate, itsAmount));
            } else {
                System.err.println("Tried to add sales receipt to non-commissioned employee");
            }
        } else {
            System.err.println("No such employee.");
        }
    }
}
