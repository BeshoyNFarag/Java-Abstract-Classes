/*
4. Write a Java program to create an abstract class Animal with abstract methods eat() and sleep().
Create subclasses Lion, Tiger, and Deer that extend the Animal class and implement the eat() and sleep()
methods differently based on their specific behavior.
*/



public class Tiger extends Animal{

    public void eat(){
        System.out.println("Tiger eats Meat and fights Lion");

    }
    public void sleep(){
        System.out.println("Deer sleeps on Trees and Zoos");
    }
}
