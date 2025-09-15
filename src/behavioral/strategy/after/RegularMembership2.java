package behavioral.strategy.after;

public class RegularMembership2 implements DiscountStrategy2 {
    @Override
    public double calculateDiscount(double price) {
        return price ;
    }
}
