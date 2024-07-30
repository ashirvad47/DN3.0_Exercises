
public class StripeGateway {
    public void chargeWithStripe(String paymentMethod, double amount) {
        System.out.println("Processing payment of $" + amount + " using Stripe with " + paymentMethod);
    }
}