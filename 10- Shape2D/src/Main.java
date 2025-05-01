/*
10. Write a Java program to create an abstract class Shape2D with abstract methods draw() and resize().
Create subclasses Rectangle and Circle that extend the Shape2D class and implement the respective methods
to draw and resize each shape.
*/

public class Main {
    public static void main(String[] args) {
        Shape2D circle = new Circle();
        Shape2D rectangle = new Rectangle();

        circle.draw();
        circle.resize();
        System.out.println();
        rectangle.draw();
        rectangle.resize();


    }
}