package behavioral.observer.before;

import java.util.ArrayList;
import java.util.List;

public class OnlionMarketPlace {
  private   List<User> users;
    private List<Product> products;
     private List<Offer> offers;


    public OnlionMarketPlace() {
        this.users = new ArrayList<>();
        this.products =new ArrayList<>();
        this.offers = new ArrayList<>();
    }

    public void addNewProduct(Product product){
        products.add(product);
        notifyUsers(product);
    }

    public void addNewOffer(Offer offer){
        offers.add(offer);
        notifyUsers(offer);
    }

    private void notifyUsers(Offer offer) {
        users.forEach( user ->
                {
                    if (!user.isSubscribedToOffers()) {
                        return;
                    }
                    user.notifyOffer(offer);
                }
        );
    }

    private void notifyUsers(Product product) {
        users.forEach( user ->
                {
                    if (!user.isSubscribedToProducts()) {
                        return;
                    }
                  user.notifyProduct( product);
                }
                );
    }

    public void addOffer(Offer offer){
        offers.add(offer);
        notifyUsers(offer);
    }
    public void addUser(User user){
        users.add(user);
    }
}
