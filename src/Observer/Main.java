package Observer;

public class Main {
    public static void main(String[] args) {
        Subject subject=new Subject();
        ConcreteObserver observer=new ConcreteObserver();


        subject.attach(observer);
        subject.notifyObserves();


        subject.detach(observer);
        subject.notifyObserves();



    }
}
