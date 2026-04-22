/*
Program Name: Pr_16
Description: Interface implementation.
*/

interface Classify {
    String getDivision(double avg);
}

class Result implements Classify {
    public String getDivision(double avg) {
        if(avg >= 60) return "First Division";
        else return "Second Division";
    }

    public static void main(String[] args) {
        Result r = new Result();
        System.out.println(r.getDivision(65));
    }
}
