package creational.abstractfactory;

public class ModernVehicleFactory implements AbstractFactory{
    @Override
    public Car createCar() {
        return new Missubibi();
    }

    @Override
    public Bike createBike() {
        return new Bmx();
    }
}
