/*
Program Name: Pr_11
Program Description: Demonstrates inner class. College class contains inner class Admission.
*/

import java.util.Scanner;

class College {
    String collegeName;

    College(String name) {
        collegeName = name;
    }

    // Inner class
    class Admission {
        String studentName, course;

        void input() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter student name: ");
            studentName = sc.nextLine();
            System.out.print("Enter course: ");
            course = sc.nextLine();
        }

        void display() {
            System.out.println("College: " + collegeName);
            System.out.println("Student: " + studentName);
            System.out.println("Course: " + course);
        }
    }
}

public class Pr_11 {
    public static void main(String[] args) {
        College c = new College("SSASIT");
        College.Admission a = c.new Admission();
        a.input();
        a.display();
    }
}
