package ChainOfResponsibilty;

public class Main {
    public static void main(String[] args) {

        Handler handler1 = new ConcreteHandler1(null);
        Handler handler2 = new ConcreteHandler2(handler1);

        handler2.handle("handle_me_1 ");
        handler2.handle("handle_me_2 ");
        handler2.handle("handle_me_3 ");


    }
}