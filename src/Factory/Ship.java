package Factory;

public class Ship implements Transport{
    @Override
    public void deliver() {
        System.out.println("Delivering loads by ship . ");
    }
}
