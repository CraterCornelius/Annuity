public class CredirPaymentService {

    public double calculate (int amount , double rateOfInterest , int months){

        double payment = amount * ( rateOfInterest / (1 + rateOfInterest) - months - 1);

       return payment;
    }
}
