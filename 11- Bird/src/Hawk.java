/*
11. Write a Java program to create an abstract class Bird with abstract methods fly() and makeSound().
Create subclasses Eagle and Hawk that extend the Bird class and implement the respective methods
to describe how each bird flies and makes a sound.
*/


public class Hawk extends Bird {

    public void fly(){
        System.out.println(this.getClass().getSimpleName() +" ...Flying like that Haaawk!");

    }
    public  void makeSound(){
        System.out.println(this.getClass().getSimpleName() +" ... sound Haaawk!");

    }
}
