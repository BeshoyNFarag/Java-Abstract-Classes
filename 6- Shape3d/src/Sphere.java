/*
6. Write a Java program to create an abstract class Shape3D with abstract methods calculateVolume()
and calculateSurfaceArea(). Create subclasses Sphere and Cube that extend the Shape3D class and implement
the respective methods to calculate the volume and surface area of each shape.
*/


public class Sphere extends Shape3D {

    public double calculateVolume(double radius){
        double result = (4/3) * Math.pow(radius, 3) * Math.PI;
        return result;
    }
    public double calculateSurfaceArea(double radius){
        double result = 4 * Math.PI * radius * radius;
        return result;
    }
}
