package creational.factory;

//Only purpose is creating an entity
public class MotorcycleFactory extends BaseFactory{
    @Override
    protected Vehicle createVehicle() {
        return new Motor();
    }
}
