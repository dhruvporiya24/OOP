/* Develop a Java program that prompts the user to enter a distance in meters
   then convert this distance to feet (1 meter = 3.28084 feet) and display
   the result with two decimal places. */

import java.util.Scanner;

public class Pr_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter distance in meters: ");
        double meters = sc.nextDouble();

        // Conversion
        double feet = meters * 3.28084;

        // Output
        System.out.printf("Distance in feet: %.2f\n", feet);

        sc.close();
    }
}