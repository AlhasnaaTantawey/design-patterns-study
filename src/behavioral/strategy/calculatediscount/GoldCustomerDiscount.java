package behavioral.strategy.calculatediscount;

public class GoldCustomerDiscount implements DiscountStrategy{
    @Override
    public double calculateDiscount(double price) {
        return price *.6;
    }
}
