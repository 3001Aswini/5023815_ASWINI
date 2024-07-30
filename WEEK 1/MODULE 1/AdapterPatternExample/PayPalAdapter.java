
public class PayPalAdapter implements PaymentProcessor {
    private PayPalPaymentGateway payPalGateway;

    public PayPalAdapter(PayPalPaymentGateway payPalGateway) {
        this.payPalGateway = payPalGateway;
    }

    @Override
    public void processPayment(double amount) {
        payPalGateway.payViaPayPal(amount);
    }
}
