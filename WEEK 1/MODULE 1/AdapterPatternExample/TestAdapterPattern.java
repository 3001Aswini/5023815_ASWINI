public class TestAdapterPattern {
    public static void main(String[] args) {
        
        PayPalPaymentGateway payPalGateway = new PayPalPaymentGateway();
        StripePaymentGateway stripeGateway = new StripePaymentGateway();

       
        PaymentProcessor payPalProcessor = new PayPalAdapter(payPalGateway);
        PaymentProcessor stripeProcessor = new StripeAdapter(stripeGateway);

        
        payPalProcessor.processPayment(100.0);
        stripeProcessor.processPayment(200.0);
    }
}
