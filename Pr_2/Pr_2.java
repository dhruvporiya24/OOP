package Pr_2;

/* Practical: Solve system of linear equations using Cramer's Rule
   Equations:
   ax + by = e
   cx + dy = f
*/

import java.util.Scanner;

public class Pr_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input coefficients
        System.out.print("Enter a, b, c, d, e, f: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();

        // Calculate determinants
        double D = (a * d) - (b * c);
        double Dx = (e * d) - (b * f);
        double Dy = (a * f) - (e * c);

        // Check if solution exists
        if (D == 0) {
            System.out.println("No unique solution (D = 0)");
        } else {
            double x = Dx / D;
            double y = Dy / D;

            System.out.printf("x = %.2f\n", x);
            System.out.printf("y = %.2f\n", y);
        }

        sc.close();
    }
}