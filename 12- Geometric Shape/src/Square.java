/*
12. Write a Java program to create an abstract class GeometricShape with abstract methods area()
and perimeter(). Create subclasses Triangle and Square that extend the GeometricShape class and
implement the respective methods to calculate the area and perimeter of each shape.
*/


public class Square extends GeometricShape {

    private double side;

    public Square( double side ) {
        this.side = side;
    }


    public double area(){

        return Math.pow(side, 2);
    }
    public double perimeter(){
        return side * 4;
    }
}
