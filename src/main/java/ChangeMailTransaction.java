/**
 * Created by k2works on 2017/04/07.
 */
public class ChangeMailTransaction extends ChangeMethodTransaction {
    private String itsAddress;

    public ChangeMailTransaction(int empId, String address) {
        super(empId);
        itsAddress = address;
    }

    PaymentMethod GetMthod() {
        return new MailMethod(itsAddress);
    }
}
