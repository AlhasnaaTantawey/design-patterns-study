package observer.after;

public class JobFinder implements Subscriber{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("notifying a customer  "+ name+ "  about" + message);
    }

    public JobFinder(String name) {
        this.name = name;
    }
}
