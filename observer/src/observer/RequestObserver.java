package observer;

public class RequestObserver implements Observer {
    private final String name;

    public RequestObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received message: " + message);
    }
}
