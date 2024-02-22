import observer.FormObserver;
import observer.RequestObserver;
import observer.Observer;
import observer.DialogObserver;
import subject.ButtonSubject;

public class ObserverPattern {
    public static void main(String[] args) {
        ButtonSubject subject = new ButtonSubject();

        Observer observer1 = new FormObserver("FormObserver 1");
        Observer observer2 = new RequestObserver("RequestObserver 2");
        Observer observer3 = new DialogObserver("DialogObserver 3");

        subject.registerObserver(observer1);
        subject.registerObserver(observer2);
        subject.registerObserver(observer3);

        subject.setMessage("Hello World!");
        subject.removeObserver(observer1);
        subject.removeObserver(observer2);
        subject.removeObserver(observer3);
    }
}
