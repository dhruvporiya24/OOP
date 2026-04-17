package Pr_7;

/*
Program Name: Pr_7
Description: Employee class using encapsulation.
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

    public void displayEmployeeData() {
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + employeeSalary);
    }
}

public class Pr_7 {
    public static void main(String[] args) {
   
        Employee emp = new Employee();

        emp.readEmployeeData();
        emp.displayEmployeeData();
       
    }
}