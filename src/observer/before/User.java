package observer.before;

public class User {
    private  String name;
    private  boolean isSubscribedToProducts;
    private  boolean isSubscribedToOffers;

    public User(String name, boolean isSubscribedToProducts, boolean isSubscribedToOffers) {
        this.name = name;
        this.isSubscribedToProducts = isSubscribedToProducts;
        this.isSubscribedToOffers = isSubscribedToOffers;
    }

    public String getName() {
        return name;
    }

    public boolean isSubscribedToProducts() {
        return isSubscribedToProducts;
    }

    public boolean isSubscribedToOffers() {
        return isSubscribedToOffers;
    }

    public void notifyProduct(Product product) {
        System.out.println("notifying a user  "+ name+" about a new product : " + product.getName());
    }
    public void notifyOffer(Offer offer) {
        System.out.println("notifying a user  "+ name+ "  about a new offer : " + offer.getMessage());
    }
}
