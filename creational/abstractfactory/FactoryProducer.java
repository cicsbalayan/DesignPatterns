package creational.abstractfactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("modern")) {
            return new ModernVehicleFactory();
        } else if (choice.equalsIgnoreCase("offroad")) {
            return new SomeOtherVehicleFactory();
        }
        return null;
    }
}

//use case - Main class
//VehicleFactory modernFactory = FactoryProducer.getFactory("modern");
//Car modernCar = modernFactory.createCar();
//Bike modernBike = modernFactory.createBike();
//
//        modernCar.drive();
//        modernBike.ride();
//
//
//VehicleFactory offroadFactory = FactoryProducer.getFactory("offroad");
//Car offroadCar = offroadFactory.createCar();
//Bike offroadBike = offroadFactory.createBike();
//
//        offroadCar.drive();
//        offroadBike.ride();