package Pr_7;

/*
Program Name: Pr_7
Program Description: This program defines an Employee class with private data members:
employeeName and employeeSalary. It includes methods to read employee data from the user
and display the entered data. The main method demonstrates object creation and method calling.
*/

import java.util.Scanner;

class Employee {
    // Private data members
    private String employeeName;
    private double employeeSalary;

    // Method to read employee data
    public void readEmployeeData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        employeeName = sc.nextLine();

        System.out.print("Enter employee salary: ");
        employeeSalary = sc.nextDouble();
    }

    // Method to display employee data
    public void displayEmployeeData() {
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + employeeSalary);
    }
}

public class Pr_7 {
    public static void main(String[] args) {
        
        // Create object of Employee
        Employee emp = new Employee();

        // Call methods
        emp.readEmployeeData();
        emp.displayEmployeeData();
    }
}