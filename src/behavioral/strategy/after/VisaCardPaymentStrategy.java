package behavioral.strategy.after;

//3. Concrete Strategies
public class VisaCardPaymentStrategy implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of visa cards");
        System.out.println("calculating fees of the amount "+ amount+" of visa cards....");
    }
}
