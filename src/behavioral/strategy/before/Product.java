package behavioral.strategy.before;

import java.util.Locale;

public class Product {
    private double price;
    private String name;

    public Product(double price, String name) {
        this.price = price;
        this.name = name;
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

    public double calculatePrice(MemberShipType membershipType) {
        if (membershipType == null) {
            return price; // handle null
        }
       //switch expression
        return switch (membershipType) {
            case REGULAR -> price;         // no discount
            case GOLD    -> price * 0.9;   // 10% discount
            case PREMIUM -> price * 0.8;   // 20% discount
            default        -> price;         // fallback
        };
    }

}
