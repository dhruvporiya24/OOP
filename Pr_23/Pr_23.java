/*
Program Name: Pr_23
Program Description: Two threads printing numbers at different intervals.
*/

class Thread1 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("T1: " + i);
            try { Thread.sleep(1000); } catch (Exception e) {}
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        for (int i = 11; i <= 20; i++) {
            System.out.println("T2: " + i);
            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }
}

public class Pr_23 {
    public static void main(String[] args) {
        new Thread1().start();
        new Thread2().start();
    }
}
