/**
 * Created by k2works on 2017/04/06.
 */
public class SalariedClassification extends PaymentClassification {
    private double itsSalary;

    public SalariedClassification(double salary) {
        itsSalary = salary;
    }

    public double GetSalary() {
        return itsSalary;
    }

}
