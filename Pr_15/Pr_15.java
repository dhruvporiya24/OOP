/*
Program Name: Pr_15
Program Description: Demonstrates method overriding.
*/

class Employee {
    void displayDetails() {
        System.out.println("Employee: General Info");
    }
}

class Manager extends Employee {
    void displayDetails() {
        System.out.println("Manager: Team Size = 10");
    }
}

public class Pr_15 {
    public static void main(String[] args) {
        Employee e = new Employee();
        Manager m = new Manager();

        e.displayDetails();
        m.displayDetails();
    }
}
