/*
7. Write a Java program to create an abstract class Vehicle with abstract methods startEngine()
and stopEngine(). Create subclasses Car and Motorcycle that extend the Vehicle class and implement
the respective methods to start and stop the engines for each vehicle type
*/

public abstract class Vehicle {

    protected Engine engine = new Engine();

    public abstract void startEngine(Vehicle vehicle);
    public abstract void stopEngine(Vehicle vehicle);
}
