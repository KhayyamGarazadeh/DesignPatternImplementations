package ChainOfResponsibilty;

class ConcreteHandler1 extends Handler {

    public ConcreteHandler1(Handler successor) {
        super(successor);
    }

    public void handle(String request) {
        if (request.equals("handle_me_1")) {
            System.out.println("This request handled by ChainOfResponsibilty.ConcreteHandler1 ");
        } else {
            super.handle(request);
        }
    }
}
