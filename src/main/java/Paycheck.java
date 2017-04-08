import java.util.Calendar;

/**
 * Created by k2works on 2017/04/07.
 */
public class Paycheck {
    private Calendar itsPayPeriodStartDate;
    private Calendar itsPayPeriodEndDate;
    private double itsGrossPay;
    private double itsDeducations;
    private double itsNetPay;

    public Paycheck(Calendar payPeriodStartDate, Calendar payPeriodEndDate) {
        itsPayPeriodStartDate = payPeriodStartDate;
        itsPayPeriodEndDate = payPeriodEndDate;
    }
    
    public void SetGrossPay(double grossPay) {
        itsGrossPay = grossPay;
    }

    public void SetDeductions(double deductions) {
        itsDeducations = deductions;
    }

    public void SetNetPay(double netPay) {
        itsNetPay = netPay;
    }

    public Calendar GetPayPeriodStartDate() {
        return itsPayPeriodStartDate;
    }

    public Calendar GetPayPeriodEndDate() {
        return itsPayPeriodEndDate;
    }

    public double GetGrossPay() {
        return itsGrossPay;
    }

    public String GetField(String string) {
        if (string.equals("Disposition")) {
            return "Hold";
        }
        return null;
    }

    public double GetDeducations() {
        return itsDeducations;
    }

    public double GetNetPay() {
        return itsNetPay;
    }
}
