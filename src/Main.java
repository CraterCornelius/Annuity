public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int amount = 1_000_000;
        double rateOfInterest = 9.99;
        int months = 12;
        double annuity = service.calculate(amount, rateOfInterest, months);
        System.out.println("1_000_000 / 9.99% / 12 месяцев");
        System.out.printf("%.2f", annuity);
        System.out.println();

        System.out.println();
        System.out.println("1_000_000 / 9.99% / 24 месяца");
        System.out.printf("%.2f", service.calculate(1_000_000, 9.99, 24));
        System.out.println();

        System.out.println();
        System.out.println("1_000_000 / 9.99% / 36 месяцев");
        System.out.printf("%.2f", service.calculate(1_000_000, 9.99, 36));
        System.out.println();

    }
}
