package behavioral.strategy.before;

public class Checkout {

    public  void processPayment(double amount , PaymentMethod paymentMethod){
        if(paymentMethod.equals(PaymentMethod.VISA_CARDS)){
            System.out.println("Processing payment of visa cards");
            System.out.println("calculating fees of the amount of visa cards....");
        }
        else if(paymentMethod.equals(PaymentMethod.PAYPAL)){
            System.out.println("Processing payment of paypal");
            System.out.println("calculating fees of the amount of paypal....");
        }
        else if(paymentMethod.equals(PaymentMethod.BANK_TRANSFER)){
            System.out.println("Processing payment of bank transfer");
            System.out.println("calculating fees of the amount of bank transfer....");
        }
    }
}
