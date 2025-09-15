package behavioral.strategy.after;

import behavioral.strategy.before.PaymentMethod;

public class BankTransferPaymentStrategy implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of bank transfer ......");
    }
}
