package behavioral.observer.after;

public class ShippingCompany implements Subscriber{

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private  String name;

    public ShippingCompany(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " is receiving notification about " + message);
    }
}
