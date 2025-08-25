package observer.after;
//concrete observer
public class Customer implements Subscriber {
    private  String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    @Override
    public void update(String message) {
        System.out.println("notifying a customer  "+ name+ "  about" + message);

    }
}
