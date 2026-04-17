package Pr_5;

/*
Program Name: Pr_5
Program Description: This program takes three side lengths of a triangle as input.
It first checks whether the sides can form a valid triangle using the triangle inequality rule.
If valid, it calculates the area using Heron's formula:
s = (a + b + c) / 2
Area = sqrt(s * (s - a) * (s - b) * (s - c))
*/

import java.util.Scanner;

public class Pr_5 {
    public static void main(String[] args) {
        
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Input sides of triangle
        System.out.print("Enter side a: ");
        double a = sc.nextDouble();

        System.out.print("Enter side b: ");
        double b = sc.nextDouble();

        System.out.print("Enter side c: ");
        double c = sc.nextDouble();

        // Check triangle validity
        if (a + b > c && a + c > b && b + c > a) {
            
            // Calculate semi-perimeter
            double s = (a + b + c) / 2;

            // Calculate area using Heron's formula
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            // Display result
            System.out.printf("Area of triangle: %.2f\n", area);
        } 
        else {
            System.out.println("Invalid triangle sides");
        }

        sc.close();
    }
}
