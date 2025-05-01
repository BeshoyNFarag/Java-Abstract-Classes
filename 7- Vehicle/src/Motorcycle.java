/*
7. Write a Java program to create an abstract class Vehicle with abstract methods startEngine()
and stopEngine(). Create subclasses Car and Motorcycle that extend the Vehicle class and implement
the respective methods to start and stop the engines for each vehicle type
*/

public class Motorcycle extends Vehicle {
    public void startEngine(Vehicle vehicle) {
        vehicle.engine.startEngine(this);

    }
    public void stopEngine(Vehicle vehicle) {
        vehicle.engine.stopEngine(this);


    }
}
