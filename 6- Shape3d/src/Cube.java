/*
6. Write a Java program to create an abstract class Shape3D with abstract methods calculateVolume()
and calculateSurfaceArea(). Create subclasses Sphere and Cube that extend the Shape3D class and implement
the respective methods to calculate the volume and surface area of each shape.
*/


public class Cube extends Shape3D {

    public double calculateVolume(double side){

        return Math.pow(side, 3);
    }
    public double calculateSurfaceArea(double radius){
        return Math.pow(side, 2) * 6;
    }


}
