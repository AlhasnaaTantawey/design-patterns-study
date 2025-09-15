package behavioral.strategy.calculatediscount;

public class VIPCustomerDiscount implements DiscountStrategy{
    @Override
    public double calculateDiscount(double price) {
        return price * 0.80; //20%
    }
}
