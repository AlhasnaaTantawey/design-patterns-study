package behavioral.strategy.calculatediscount;

public class ShoppingCart {

    private DiscountStrategy discountStrategy;

    // Run-Time

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {

        this.discountStrategy = discountStrategy;

    }

    public double calculateFinalPrice(double price) {

        return discountStrategy.calculateDiscount(price);

    }


}
