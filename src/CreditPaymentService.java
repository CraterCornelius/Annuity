public class CreditPaymentService {

    public double calculate(int amount, double rateOfInterest, int months) {

        double monthly = rateOfInterest / 12 / 100;
        double a = 1 + monthly;
        double b = Math.pow(a, months);
        double upper = monthly * b;
        double lower = b - 1;
        double ratio = upper / lower;
        double payment = amount * ratio;

        return payment;
    }
}
