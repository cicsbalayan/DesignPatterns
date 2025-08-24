package creational.abstractfactory;

public class MountainBike implements Bike{
    @Override
    public void assemble() {
        System.out.println("Assembled a bike called mountain bike");
    }
}
