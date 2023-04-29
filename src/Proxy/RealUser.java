package Proxy;

public class RealUser implements User{
    @Override
    public void printInfo() {
        System.out.println("RealUser print information for you");
    }
}
