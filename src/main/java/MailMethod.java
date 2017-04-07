/**
 * Created by k2works on 2017/04/07.
 */
public class MailMethod implements PaymentMethod {
    private String itsAddress;

    public MailMethod(String address) {
        itsAddress = address;
    }

    public String GetAddress() {
        return itsAddress;
    }

    public void Pay(Paycheck pc) {

    }
}
