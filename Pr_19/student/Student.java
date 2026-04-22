/*
Program Name: Pr_19
Description: Student class in package student.
*/

package student;

public class Student {
    protected int rollNo;
    protected String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public void displayStudent() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}
