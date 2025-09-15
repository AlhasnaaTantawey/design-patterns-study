package behavioral.strategy.after;

import behavioral.strategy.before.PaymentMethod;

public interface PaymentStrategy {
    void processPayment(double amount );
}
