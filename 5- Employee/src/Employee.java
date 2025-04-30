/*
5. Write a Java program to create an abstract class Employee with abstract methods calculateSalary()
and displayInfo(). Create subclasses Manager and Programmer that extend the Employee class and implement
the respective methods to calculate salary and display information for each role.
*/

import java.util.ArrayList;

public abstract class Employee {


    protected double salary;
    protected String name;
    protected int age;
    protected int YOE;
    protected double finalSalary;
    protected ArrayList<String> projects = new ArrayList<>();


    public abstract double calculateSalary();
    public abstract void getInfo();
    public abstract void addProject(String project);
    public abstract void removeProject(String project);
    public abstract void getProjects();
}
