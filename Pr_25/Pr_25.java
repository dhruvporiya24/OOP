/*
Program Name: Pr_25
Program Description: Prints multiplication tables using synchronized method.
*/

class Table {
    synchronized void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
            try { Thread.sleep(200); } catch (Exception e) {}
        }
    }
}

class MyThread extends Thread {
    Table t;
    int num;

    MyThread(Table t, int num) {
        this.t = t;
        this.num = num;
    }

    public void run() {
        t.printTable(num);
    }
}

public class Pr_25 {
    public static void main(String[] args) {
        Table t = new Table();

        new MyThread(t, 5).start();
        new MyThread(t, 7).start();
    }
}
