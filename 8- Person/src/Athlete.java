/*
8. Write a Java program to create an abstract class Person with abstract methods eat() and exercise().
Create subclasses Athlete and LazyPerson that extend the Person class and implement the respective methods
to describe how each person eats and exercises.
*/



public class Athlete extends Person {

    @Override
    public void eat(){
        System.out.printf(Athlete.class.getSimpleName() + " is eating:%nBroccli%nOrange%nOther vegetables and fruits%n%n");
    }


    @Override
    public void excersice(){
        System.out.printf(Athlete.class.getSimpleName() + " is excersing at the gym%n%n");
    }
}
