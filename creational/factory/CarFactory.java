package creational.factory;

//Similar to MotorcycleFactory but for Car specifically
public class CarFactory extends BaseFactory {

    @Override
    protected Vehicle createVehicle() {
        return new Car();
    }
}
