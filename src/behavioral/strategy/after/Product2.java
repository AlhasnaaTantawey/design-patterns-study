package behavioral.strategy.after;

//1-Context
public class Product2 {
    private double price;
    private String name;
    private final DiscountStrategy2 discountStrategy;
    public Product2(double price, String name, DiscountStrategy2 discountStrategy2) {
        this.price = price;
        this.name = name;
        this.discountStrategy=discountStrategy2;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Run-Time


    public double calculateFinalPrice(double price) {
        System.out.print("Final Price for "+name+"  (Gold Customer): $" + discountStrategy.calculateDiscount(price));
        return discountStrategy.calculateDiscount(price);

    }
}
