package behavioral.strategy.after;

public class PreiumPlusMembership2 implements DiscountStrategy2{
    @Override
    public double calculateDiscount(double price) {
        return price * 0.7; // 30% discount
    }
}
