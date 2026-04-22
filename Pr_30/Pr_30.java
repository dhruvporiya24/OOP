/*
Program Name: Pr_30
Program Description: Counts frequency of each word using HashMap.
*/

import java.util.*;

public class Pr_30 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] words = input.split("\\s+");

        HashMap<String, Integer> map = new HashMap<>();

        // Count frequency
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // Display result
        System.out.println("\nWord Frequency:");
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

        sc.close();
    }
}
