/*
2. Write a Java program to create an abstract class Shape with abstract methods calculateArea()
and calculatePerimeter(). Create subclasses Circle and Triangle that extend the Shape class and
implement the respective methods to calculate the area and perimeter of each shape
*/


public class Circle extends Shape {

    private double raduis;
    public Circle(double raduis) {
        this.raduis = raduis;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(raduis, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * raduis;
    }
}
