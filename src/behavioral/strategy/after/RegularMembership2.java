package behavioral.strategy.after;
//3. Concrete Strategies
public class RegularMembership2 implements DiscountStrategy2 {
    @Override
    public double calculateDiscount(double price) {
        return price ;
    }
}
