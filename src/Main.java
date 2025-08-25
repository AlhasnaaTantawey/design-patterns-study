import observer.after.*;

public class Main {
    public static void main(String[] args) {
        OnlionMarketPlace onlionMarketPlace=new OnlionMarketPlace();

        Subscriber alhasnaa=new Customer("alhasnaa");
        Subscriber elsayed=new Customer("elsayed");
        Subscriber ali=new Customer("ali");
        Subscriber mohamed=new Customer("mohamed");
        Subscriber jobFinder=new JobFinder("alia");
        Subscriber shippingCompany =new ShippingCompany("Raya");


        onlionMarketPlace.Subscribers(EventType.NEW_PRODUCT,alhasnaa);
        onlionMarketPlace.Subscribers(EventType.NEW_OFFER,ali);
        onlionMarketPlace.Subscribers(EventType.NEW_PRODUCT,elsayed);
        onlionMarketPlace.Subscribers(EventType.NEW_OFFER,mohamed);
        onlionMarketPlace.Subscribers(EventType.JOB_OPENING, jobFinder);

        onlionMarketPlace.Subscribers(EventType.NEW_PRODUCT, shippingCompany);


        onlionMarketPlace.addNewJonbOpening(new JobFinder("sales manager"));
        onlionMarketPlace.addNewProduct(new Product("tv",1000.0));
        onlionMarketPlace.addNewOffer(new Offer("new offer with 20% discount for every item"));
    }
}