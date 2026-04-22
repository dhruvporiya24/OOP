/*
Program Name: Pr_29
Program Description: Uses ArrayList to store marks, display them,
and find highest and lowest marks.
*/

import java.util.*;

public class Pr_29 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> marks = new ArrayList<>();

        // Input 5 marks
        System.out.println("Enter 5 marks:");
        for (int i = 0; i < 5; i++) {
            marks.add(sc.nextInt());
        }

        // Display marks
        System.out.println("Marks: " + marks);

        // Find max and min
        int max = Collections.max(marks);
        int min = Collections.min(marks);

        System.out.println("Highest Marks: " + max);
        System.out.println("Lowest Marks: " + min);

        sc.close();
    }
}
