package observer;

public class FormObserver implements Observer {
    private final String name;

    public FormObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received message: " + message);
    }
}
