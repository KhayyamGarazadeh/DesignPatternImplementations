package ChainOfResponsibilty;

class ConcreteHandler2 extends Handler {
    public ConcreteHandler2(Handler successor) {
        super(successor);
    }

    public void handle(String request) {
        if (request.equals("handle_me_2")) {
            System.out.println("This request handled by ChainOfResponsibilty.ConcreteHandler2");
        } else {
            super.handle(request);
        }
    }
}
