/**
 * Created by k2works on 2017/04/06.
 */
public class HourlyClassification implements  PaymentClassification {
    private double itsHourlyRate;

    public HourlyClassification(double hourlyRate) {
        itsHourlyRate = hourlyRate;
    }

    public double GetRate() {
        return itsHourlyRate;
    }
}
