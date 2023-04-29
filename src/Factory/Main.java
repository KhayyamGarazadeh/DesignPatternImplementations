package Factory;

public class Main {
    public static void main(String[] args) {
        Transport transport1=new Truck();
        transport1.deliver();
        Transport transport2=new Ship();
        transport2.deliver();
    }
}
