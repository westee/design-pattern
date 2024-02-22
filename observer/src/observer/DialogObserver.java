package observer;

public class DialogObserver implements Observer {
    private final String name;

    public DialogObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received message: " + message);
    }
}
