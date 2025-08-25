package observer.after;

public interface Subject {
    void Subscribers(EventType eventType,Subscriber subscriber);
    void Unsubscribers(EventType eventType,Subscriber subscriber);
    void notifySubscribers(EventType eventType, String message);
}
