/*
Program Name: Pr_19
Description: Result class in package exam.
*/

package exam;

import student.Student;

public class Result extends Student {
    int marks1, marks2, marks3;

    public Result(int rollNo, String name, int m1, int m2, int m3) {
        super(rollNo, name);
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
    }

    public void displayResult() {
        displayStudent();
        int total = marks1 + marks2 + marks3;
        double avg = total / 3.0;

        System.out.println("Marks: " + marks1 + ", " + marks2 + ", " + marks3);
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
    }

    public static void main(String[] args) {
        Result r = new Result(1, "Amit", 80, 85, 90);
        r.displayResult();
    }
}
