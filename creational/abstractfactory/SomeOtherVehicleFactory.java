package creational.abstractfactory;

public class SomeOtherVehicleFactory implements AbstractFactory{
    @Override
    public Car createCar() {
        return new Onissan();
    }

    @Override
    public Bike createBike() {
        return new MountainBike();
    }
}
