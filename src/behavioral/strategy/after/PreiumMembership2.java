package behavioral.strategy.after;

public class PreiumMembership2 implements DiscountStrategy2 {
    @Override
    public double calculateDiscount(double price) {
        return price * 0.8;
    }
}
