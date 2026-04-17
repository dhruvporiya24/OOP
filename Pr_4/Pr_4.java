package Pr_4;

/*
Program Name: Pr_4
Program Description: This program calculates the Body Mass Index (BMI) of a person.
It takes weight in pounds and height in inches as input, converts them into
kilograms and meters respectively, and then calculates BMI using the formula:
BMI = weight (kg) / (height (m))^2
*/

import java.util.Scanner;

public class Pr_4 {
    public static void main(String[] args) {
        
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Input weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weightPounds = sc.nextDouble();

        // Input height in inches
        System.out.print("Enter height in inches: ");
        double heightInches = sc.nextDouble();

        // Convert pounds to kilograms
        double weightKg = weightPounds * 0.45359237;

        // Convert inches to meters
        double heightMeters = heightInches * 0.0254;

        // Calculate BMI
        double bmi = weightKg / (heightMeters * heightMeters);

        // Display result
        System.out.printf("Your BMI is: %.2f\n", bmi);

        sc.close();
    }
}
