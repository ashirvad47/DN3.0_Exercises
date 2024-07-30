
public class PaymentTest {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext(null);

        // Using credit card payment
        paymentContext.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456", "Dimitri Petrenko"));
        paymentContext.executePayment(100.0);

        // Using PayPal payment
        paymentContext.setPaymentStrategy(new PayPalPayment("DimitriPetrenko@USSR.com"));
        paymentContext.executePayment(200.0);
    }
}