/*
Program Name: Pr_27
Program Description: Writes student records to a file and reads them.
Handles exceptions using try-catch-finally.
*/

import java.io.*;

public class Pr_27 {
    public static void main(String[] args) {

        FileWriter fw = null;
        BufferedReader br = null;

        try {
            // Writing data to file
            fw = new FileWriter("students.txt");
            fw.write("1 Amit 85\n");
            fw.write("2 Rahul 90\n");
            fw.write("3 Neha 88\n");

            System.out.println("Data written to file.");

            fw.close(); // close before reading

            // Reading data from file
            br = new BufferedReader(new FileReader("students.txt"));
            String line;

            System.out.println("\nStudent Records:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } 
        catch (IOException e) {
            System.out.println("Error: " + e);
        } 
        finally {
            try {
                if (fw != null) fw.close();
                if (br != null) br.close();
            } catch (IOException e) {
                System.out.println("Error closing file");
            }
        }
    }
}
