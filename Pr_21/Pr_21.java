/*
Program Name: Pr_21
Program Description: Checks voting eligibility using exception handling.
*/

import java.util.Scanner;

class VotingApp {

    void checkEligibility(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VotingApp v = new VotingApp();

        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            v.checkEligibility(age);
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        } 
        finally {
            System.out.println("Validation process completed");
        }

        sc.close();
    }
}
