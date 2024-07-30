
public class PaymentProcessorTest {
    public static void main(String[] args) {
        
        PayPalGateway payPalGateway = new PayPalGateway();
        PaymentProcessor payPalAdapter = new PayPalAdapter(payPalGateway);

        
        payPalAdapter.processPayment("Credit Card", 341.0);

        
        StripeGateway stripeGateway = new StripeGateway();
        PaymentProcessor stripeAdapter = new StripeAdapter(stripeGateway);

        
        stripeAdapter.processPayment("Debit Card", 668.0);
    }
}