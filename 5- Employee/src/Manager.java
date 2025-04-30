/*
5. Write a Java program to create an abstract class Employee with abstract methods calculateSalary()
and displayInfo(). Create subclasses Manager and Programmer that extend the Employee class and implement
the respective methods to calculate salary and display information for each role.
*/

import java.util.ArrayList;

public class Manager extends Employee {


    public Manager(String name, int age, double salary, int YOE) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.YOE = YOE;
    }

    public double calculateSalary(){

        finalSalary = salary + (salary * 0.1 * YOE);
        return finalSalary;
    }
    public void getInfo(){
        System.out.printf("Name: %s%nAge: %d%nSalary: %.2f%nYOE: %d%n", name,age,finalSalary,YOE);
    }
    public void addProject(String project){
        projects.add(project);
    }
    public void removeProject(String project){
        projects.remove(project);
    }
    public void getProjects(){
        projects.forEach(p -> System.out.println(p));
    }


}
