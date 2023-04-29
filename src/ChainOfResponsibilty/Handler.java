package ChainOfResponsibilty;

public class Handler {

    private Handler successor;

    public Handler(Handler successor) {
        this.successor = successor;
    }

    public void handle(String request){
        if (successor != null){
            successor.handle(request);
        }

    }
}

