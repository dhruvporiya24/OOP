package Pr_8;

/*
Program Name: Pr_8
Program Description: This program defines a Point class representing a 2D point (x, y).
It includes:
1. Default constructor (initializes x and y to 5)
2. Parameterized constructor (user-defined values)
3. Copy constructor (copies values from another object)
4. display() method to show coordinates
The main method tests all constructors.
*/

import java.util.Scanner;

class Point {
    int x, y;

    // Default constructor
    Point() {
        x = 5;
        y = 5;
    }

    // Parameterized constructor
    Point(int a, int b) {
        x = a;
        y = b;
    }

    // Copy constructor
    Point(Point p) {
        x = p.x;
        y = p.y;
    }

    // Display method
    void display() {
        System.out.println("Point coordinates: (" + x + ", " + y + ")");
    }
}

public class Pr_8 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Default constructor
        Point p1 = new Point();
        System.out.println("Default Constructor:");
        p1.display();

        // Parameterized constructor (user input)
        System.out.print("\nEnter x coordinate: ");
        int x = sc.nextInt();

        System.out.print("Enter y coordinate: ");
        int y = sc.nextInt();

        Point p2 = new Point(x, y);
        System.out.println("Parameterized Constructor:");
        p2.display();

        // Copy constructor
        Point p3 = new Point(p2);
        System.out.println("Copy Constructor:");
        p3.display();

        sc.close();
    }
}
