/*
Program Name: Pr_20
Description: Exception handling with CLI.
*/

public class Pr_20 {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println(a/b);
        } catch(Exception e) {
            System.out.println("Error: "+e);
        }
    }
}
