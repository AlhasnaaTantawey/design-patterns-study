package behavioral.strategy.after;

import behavioral.strategy.before.PaymentMethod;

public class Checkout2  {

    private  PaymentStrategy paymentStrategy;

    public Checkout2(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public  void processPayment(double amount ){
        paymentStrategy.processPayment(amount);
    }
}
