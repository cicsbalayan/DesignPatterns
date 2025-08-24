# Abstract Factory Pattern in Java

### Overview
The **Abstract Factory Pattern** is a **creational design pattern** that lets you create **families of related objects** without specifying their concrete classes.

It provides an interface for creating objects in a consistent way, so the client code can remain independent of how objects are created and what their exact classes are.

---

## The Problem (Without Abstract Factory)

Imagine we want to create vehicles. We have **Cars** and **Bikes**, each with different types (e.g., SportsCar, SUV, RoadBike, MountainBike).

```java
public interface Car {
    void drive();
}

public class SportsCar implements Car {
    @Override
    public void drive() {
        System.out.println("Driving a Sports Car!");
    }
}

public class SUVCar implements Car {
    @Override
    public void drive() {
        System.out.println("Driving an SUV!");
    }
}
```

```java
public interface Bike {
    void ride();
}

public class RoadBike implements Bike {
    @Override
    public void ride() {
        System.out.println("Riding a Road Bike!");
    }
}

public class MountainBike implements Bike {
    @Override
    public void ride() {
        System.out.println("Riding a Mountain Bike!");
    }
}

```

Problems:

- Client code depends directly on concrete classes.
- Switching between vehicle families (e.g., modern vs off-road) requires editing multiple places.
- Difficult to scale when more product families are added.
---

### Using abstract factory 

Instead of directly instantiating vehicles, we define a factory interface and provide different factory implementations for different families of products.

```java
public interface VehicleFactory {
    Car createCar();
    Bike createBike();
}
```

### Concrete factories

The factories that will focus solely on their respective entities

```java
public class ModernVehicleFactory implements VehicleFactory {
    @Override
    public Car createCar() {
        return new SportsCar();
    }
    @Override
    public Bike createBike() {
        return new RoadBike();
    }
}

public class OffroadVehicleFactory implements VehicleFactory {
    @Override
    public Car createCar() {
        return new SUVCar();
    }
    @Override
    public Bike createBike() {
        return new MountainBike();
    }
}
```

### Producer
The one who will be doing all the work for producing our factories

```java
public class FactoryProducer {
    public static VehicleFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("modern")) {
            return new ModernVehicleFactory();
        } else if (choice.equalsIgnoreCase("offroad")) {
            return new OffroadVehicleFactory();
        }
        return null;
    }
}
```

### Use case 

```java
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        // Get Modern Factory
        VehicleFactory modernFactory = FactoryProducer.getFactory("modern");
        Car modernCar = modernFactory.createCar();
        Bike modernBike = modernFactory.createBike();

        modernCar.drive();
        modernBike.ride();

        // Get Offroad Factory
        VehicleFactory offroadFactory = FactoryProducer.getFactory("offroad");
        Car offroadCar = offroadFactory.createCar();
        Bike offroadBike = offroadFactory.createBike();

        offroadCar.drive();
        offroadBike.ride();
    }
}
//Output
//Driving a Sports Car!
//Riding a Road Bike!
//Driving an SUV!
//Riding a Mountain Bike!
```
### Benefits of using Abstract Factory Pattern
- Promotes loose coupling — client code depends only on interfaces, not concrete classes.
- Makes it easy to introduce new product families without touching existing client code.
- Keeps creation logic in one place (factories).

### When to use this pattern?
- When you need to create families of related objects.
- When your system should be independent of how objects are created.
- When you want to enforce consistency among products (e.g., all “modern” vehicles go together).