/*
10. Write a Java program to create an abstract class Shape2D with abstract methods draw() and resize().
Create subclasses Rectangle and Circle that extend the Shape2D class and implement the respective methods
to draw and resize each shape.
*/


import java.awt.*;

public class Rectangle extends Shape2D {


    @Override
    public void draw(){

        System.out.println(this.getClass().getSimpleName() + " is being drawn....");

    }


    @Override
    public void resize(){
        System.out.println(this.getClass().getSimpleName() + " is being resized....");

    }
}
