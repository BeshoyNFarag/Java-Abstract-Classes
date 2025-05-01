/*
8. Write a Java program to create an abstract class Person with abstract methods eat() and exercise().
Create subclasses Athlete and LazyPerson that extend the Person class and implement the respective methods
to describe how each person eats and exercises.
*/


public class LazyPerson extends Person {

    @Override
    public void eat(){
        System.out.printf(LazyPerson.class.getSimpleName() + " is eating:%nChocolate%nPizza%nOther Proccessed fats and sugars%n%n");
    }


    @Override
    public void excersice(){
        System.out.printf(LazyPerson.class.getSimpleName() + " is never excersing.%n%n");
    }
}
