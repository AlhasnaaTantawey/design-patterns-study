package observer.after;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//concrete subject
public class OnlionMarketPlace  implements Subject{

  private Map<EventType,List<Subscriber>> subscribers;
    private List<Product> products;
     private List<Offer> offers;
    private List<JobFinder> jobFinders;



    public OnlionMarketPlace() {
        this.subscribers = new HashMap<>();
        intilizeSunscriberEvents();
        this.products =new ArrayList<>();
        this.offers = new ArrayList<>();
        this.jobFinders=new ArrayList<>();

    }

    private void intilizeSunscriberEvents() {
        subscribers.put(EventType.NEW_OFFER,new ArrayList<>());
        subscribers.put(EventType.JOB_OPENING,new ArrayList<>());
        subscribers.put(EventType.NEW_PRODUCT,new ArrayList<>());
    }

    public void addNewOffer(Offer offer){
        offers.add(offer);
        notifySubscribers(EventType.NEW_OFFER,"new offer is added: " + offer.getMessage());
    }

    @Override
    public void notifySubscribers(EventType eventType, String message) {
        subscribers.get(eventType).forEach(
                subscriber -> subscriber.update(message)
        );
    }

    public void addNewProduct(Product product){
        products.add(product);
        notifySubscribers(EventType.NEW_PRODUCT,"new product is added: " + product.getName());
    }

    public void addNewJonbOpening(JobFinder jobFinder){
        jobFinders.add(jobFinder);
        notifySubscribers(EventType.JOB_OPENING,"new product is added: " + jobFinder.getName());
    }

    @Override
    public void Subscribers(EventType eventType,Subscriber subscriber){
        subscribers.get(eventType).add(subscriber);
    }

    @Override
    public void Unsubscribers(EventType eventType,Subscriber subscriber){
        subscribers.get(eventType).remove(subscriber);
    }


    public Map<EventType, List<Subscriber>> getSubscribers() {
        return subscribers;
    }

}
