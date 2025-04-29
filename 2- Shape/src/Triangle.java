/*
2. Write a Java program to create an abstract class Shape with abstract methods calculateArea()
and calculatePerimeter(). Create subclasses Circle and Triangle that extend the Shape class and
implement the respective methods to calculate the area and perimeter of each shape
*/




public class Triangle extends Shape{
    private double base;
    private double height;
    private double side1;
    private double side2;


    public Triangle(double base, double height, double side1, double side2) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double calculateArea() {
        return base * 0.5 * height;
    }


    @Override
    public double calculatePerimeter() {
        return side1 + side2 + base;
    }


}
