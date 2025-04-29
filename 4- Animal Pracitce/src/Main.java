/*
4. Write a Java program to create an abstract class Animal with abstract methods eat() and sleep().
Create subclasses Lion, Tiger, and Deer that extend the Animal class and implement the eat() and sleep()
methods differently based on their specific behavior.
*/


public class Main {
    public static void main(String[] args) {
        Animal deer = new Deer();
        Animal lion = new Lion();
        Animal tiger  = new Tiger();

        deer.eat();
        deer.sleep();
        System.out.println();
        lion.eat();
        lion.sleep();
        System.out.println();
        tiger.eat();
        tiger.sleep();

    }
}