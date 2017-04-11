package MethodTransactions;

import Methods.HoldMethod;
import PayrollDomain.PaymentMethod;
import PayrollFactory.PayrollFactory;

/**
 * Created by k2works on 2017/04/07.
 */
public class ChangeHoldTransaction extends ChangeMethodTransaction {
    private PayrollFactory itsPayrollFactory;

    public ChangeHoldTransaction(int empId, PayrollFactory payrollFactory) {
        super(empId);
    }

    PaymentMethod GetMethod() {
        return new HoldMethod();
    }
}
