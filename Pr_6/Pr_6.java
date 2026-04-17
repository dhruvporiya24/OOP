package Pr_6;
/*
Program Name: Pr_6
Program Description: This program defines a class named Rectangle with two data fields:
width and height (default value = 1). It includes constructors and methods to calculate
area and perimeter. The program takes width and height as input from the user.
*/

import java.util.Scanner;

class Rectangle {
    double width = 1;
    double height = 1;

    // No-argument constructor
    Rectangle() {
        width = 1;
        height = 1;
    }

    // Parameterized constructor
    Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    // Method to calculate area
    double getArea() {
        return width * height;
    }

    // Method to calculate perimeter
    double getPerimeter() {
        return 2 * (width + height);
    }
}

public class Pr_6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter width: ");
        double w = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        // Create object using parameterized constructor
        Rectangle r = new Rectangle(w, h);

        // Display results
        System.out.println("Area: " + r.getArea());
        System.out.println("Perimeter: " + r.getPerimeter());

        sc.close();
    }
}