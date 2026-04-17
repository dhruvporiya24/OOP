package Pr_3;

/*
Program Name: Pr_2
Description: Check vowel or consonant.
*/

import java.util.Scanner;

public class Pr_3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a single character: ");
        char ch = sc.next().charAt(0);

        ch = Character.toLowerCase(ch);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("It is a Vowel");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("It is a Consonant");
        } else {
            System.out.println("Invalid input");
        }

        sc.close();
    }
}
