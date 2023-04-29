package Proxy;

public class Proxy implements User{


    private RealUser realUser;
    @Override
    public void printInfo() {
        if (realUser==null){
            realUser=new RealUser();
        }
        System.out.println("Proxy print information before delegating to RealUser. ");
        realUser.printInfo();
        System.out.println("Proxy print infomation after delegating to RealUser. ");



    }
}
