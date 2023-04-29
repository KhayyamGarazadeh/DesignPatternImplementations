package SingletonWithEnum;

public enum Singleton {

    INSTANCE;

    public void doSomething(){
        System.out.println("Singleton doing something");
    }
}
