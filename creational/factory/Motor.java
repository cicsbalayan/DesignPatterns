package creational.factory;

public class Motor implements Vehicle {
    //Business Logic

    @Override
    public void build() {
        System.out.println("Building the Motorcycle");
    }
}
