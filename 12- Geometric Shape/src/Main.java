/*
12. Write a Java program to create an abstract class GeometricShape with abstract methods area()
and perimeter(). Create subclasses Triangle and Square that extend the GeometricShape class and
implement the respective methods to calculate the area and perimeter of each shape.
*/

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        GeometricShape triangle = new Triangle(5,3,6,4);
        GeometricShape square = new Square(5);

        System.out.println(square.area());
        System.out.println(square.perimeter());
        System.out.println();
        System.out.println(triangle.area());
        System.out.println(triangle.perimeter());

    }
}