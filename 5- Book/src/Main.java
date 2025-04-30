/*
5. Write a Java program to create an abstract class Employee with abstract methods calculateSalary()
and displayInfo(). Create subclasses Manager and Programmer that extend the Employee class and implement
the respective methods to calculate salary and display information for each role.
*/

public class Main {
    public static void main(String[] args) {
        Employee programmer = new Programmer("John", 25, 2500.35, 2);
        Employee manager = new Manager("Paul", 28, 3250, 4);

        System.out.println(programmer.calculateSalary());
        programmer.getInfo();
        programmer.addProject("Add authentication");
        programmer.addProject("Add a background");
        programmer.addProject("remove me");
        programmer.removeProject("remove me");
        programmer.getProjects();
        System.out.println();
        System.out.println(manager.calculateSalary());
        manager.getInfo();
        manager.addProject("Do a meeting");
        manager.addProject("prepare the definination of done");
        manager.addProject("remove me");
        manager.removeProject("remove me");
        manager.getProjects();


    }
}