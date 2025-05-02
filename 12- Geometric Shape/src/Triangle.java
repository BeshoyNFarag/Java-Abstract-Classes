/*
12. Write a Java program to create an abstract class GeometricShape with abstract methods area()
and perimeter(). Create subclasses Triangle and Square that extend the GeometricShape class and
implement the respective methods to calculate the area and perimeter of each shape.
*/



public class Triangle extends GeometricShape {

    private double height;
    private double base;
    private double side1;
    private double side2;

    public Triangle( double height, double base, double side1, double side2 ) {
        this.height = height;
        this.base = base;
        this.side1 = side1;
        this.side2 = side2;
    }


    public double area(){

        return 0.5 * base * height;
    }
    public double perimeter(){
        return base + side1 + side2;
    }
}
