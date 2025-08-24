package creational.factory;

public class Car implements Vehicle {
    //Business Logic

    @Override
    public void build() {
        System.out.println("Building car");
    }
}
