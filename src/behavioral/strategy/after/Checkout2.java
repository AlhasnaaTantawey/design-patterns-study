package behavioral.strategy.after;

//1-Context
public class Checkout2  {

    private  PaymentStrategy paymentStrategy;

    public Checkout2(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public  void processPayment(double amount ){
        paymentStrategy.processPayment(amount);
    }
}
