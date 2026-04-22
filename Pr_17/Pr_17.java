/*
Program Name: Pr_17
Description: Multiple interfaces.
*/

interface Exam {
    boolean isPassed(int marks);
}

interface Classify {
    String getDivision(double avg);
}

class Result implements Exam, Classify {
    public boolean isPassed(int m) {
        return m >= 40;
    }

    public String getDivision(double avg) {
        if(avg >= 60) return "First";
        else return "Second";
    }

    public static void main(String[] args) {
        Result r = new Result();
        System.out.println(r.isPassed(50));
        System.out.println(r.getDivision(70));
    }
}
