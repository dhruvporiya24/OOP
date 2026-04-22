/*
Program Name: Pr_26
Program Description: Counts characters, words, and lines in a file.
*/

import java.io.*;

public class Pr_26 {
    public static void main(String[] args) {
        int chars = 0, words = 0, lines = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            String line;

            while ((line = br.readLine()) != null) {
                lines++;
                chars += line.length();

                String[] w = line.trim().split("\\s+");
                if (line.trim().length() > 0)
                    words += w.length;
            }

            System.out.println("Lines: " + lines);
            System.out.println("Words: " + words);
            System.out.println("Characters: " + chars);

            br.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
