package behavioral.strategy.calculatediscount;

public class RegularCustomerDiscount implements DiscountStrategy{
    @Override
    public double calculateDiscount(double price) {
        return price * 0.90; //10%
    }
}
