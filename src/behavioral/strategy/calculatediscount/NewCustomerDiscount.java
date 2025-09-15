package behavioral.strategy.calculatediscount;

public class NewCustomerDiscount implements DiscountStrategy{
    @Override
    public double calculateDiscount(double price) {
        return price * 0.95;  //5%
    }
}
