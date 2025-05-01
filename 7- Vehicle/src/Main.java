/*
7. Write a Java program to create an abstract class Vehicle with abstract methods startEngine()
and stopEngine(). Create subclasses Car and Motorcycle that extend the Vehicle class and implement
the respective methods to start and stop the engines for each vehicle type
*/

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        car.startEngine(car);
        car.startEngine(car);

        System.out.println();
        motorcycle.startEngine(motorcycle);
        motorcycle.stopEngine(motorcycle);
    }
}