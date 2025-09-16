package behavioral.strategy.after;

//3. Concrete Strategies
public class BankTransferPaymentStrategy implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of bank transfer ......");
    }
}
