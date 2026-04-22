/*
Program Name: Pr_28
Program Description: Reads a file and counts lines, words,
and characters (excluding spaces and newline).
*/

import java.io.*;

public class Pr_28 {
    public static void main(String[] args) {

        int lines = 0, words = 0, chars = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                lines++;

                // Count characters (excluding spaces)
                chars += line.replace(" ", "").length();

                // Count words
                String[] w = line.trim().split("\\s+");
                if (line.trim().length() > 0)
                    words += w.length;
            }

            System.out.println("Lines: " + lines);
            System.out.println("Words: " + words);
            System.out.println("Characters (no spaces): " + chars);

            br.close();

        } 
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        } 
        catch (IOException e) {
            System.out.println("IO Error");
        }
    }
}
