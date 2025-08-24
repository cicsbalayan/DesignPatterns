package creational.factory;

//The base factory for creating the concrete objects
public abstract class BaseFactory {

    public Vehicle create() {
            Vehicle vehicle = createVehicle();
            vehicle.build();
            return vehicle;
    }

    //Inherited method for creating vehicle types
    protected abstract Vehicle createVehicle();
}


