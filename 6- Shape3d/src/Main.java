/*
6. Write a Java program to create an abstract class Shape3D with abstract methods calculateVolume()
and calculateSurfaceArea(). Create subclasses Sphere and Cube that extend the Shape3D class and implement
the respective methods to calculate the volume and surface area of each shape.
*/

public class Main {
    public static void main(String[] args) {

        Shape3D cube = new Cube();
        Shape3D sphere = new Sphere();
        System.out.println(cube.calculateVolume(4));
        System.out.println(cube.calculateVolume(5));
        System.out.println();
        System.out.println(sphere.calculateVolume(6));
        System.out.println(sphere.calculateVolume(7));

    }
}