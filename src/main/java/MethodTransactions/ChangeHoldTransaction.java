package MethodTransactions;

import Methods.HoldMethod;
import PayrollDomain.PaymentMethod;

/**
 * Created by k2works on 2017/04/07.
 */
public class ChangeHoldTransaction extends ChangeMethodTransaction {
    public ChangeHoldTransaction(int empId) {
        super(empId);
    }

    PaymentMethod GetMethod() {
        return new HoldMethod();
    }
}
