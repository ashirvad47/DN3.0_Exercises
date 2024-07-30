
public class PayPalGateway {
    public void payWithPayPal(String paymentMethod, double amount) {
        System.out.println("Processing payment of $" + amount + " using PayPal with " + paymentMethod);
    }
}