package subject;

import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class ButtonSubject implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    private String message;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(message));
    }

    public void setMessage(String message) {
        this.message = message;
        notifyObservers();
    }
}
