/*
8. Write a Java program to create an abstract class Person with abstract methods eat() and exercise().
Create subclasses Athlete and LazyPerson that extend the Person class and implement the respective methods
to describe how each person eats and exercises.
*/

public class Main {
    public static void main(String[] args) {
        Person athelete = new Athlete();
        Person lazy = new LazyPerson();

        athelete.eat();
        athelete.excersice();
        System.out.println();
        lazy.eat();
        lazy.excersice();
    }
}