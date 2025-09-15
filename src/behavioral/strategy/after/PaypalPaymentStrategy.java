package behavioral.strategy.after;

import behavioral.strategy.before.PaymentMethod;

public class PaypalPaymentStrategy implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of paypal");
        System.out.println("calculating fees of the amount "+ amount+"  of paypal....");
    }
}
