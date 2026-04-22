/*
Program Name: Pr_12
Program Description: Demonstrates method overloading for volume calculation.
*/

class Volume {

    double calculateVolume(double side) {
        return side * side * side;
    }

    double calculateVolume(double l, double w, double h) {
        return l * w * h;
    }

    double calculateVolumeSphere(double r) {
        return (4.0 / 3) * Math.PI * r * r * r;
    }
}

public class Pr_12 {
    public static void main(String[] args) {
        Volume v = new Volume();

        System.out.println("Cube: " + v.calculateVolume(3));
        System.out.println("Cuboid: " + v.calculateVolume(2,3,4));
        System.out.println("Sphere: " + v.calculateVolumeSphere(3));
    }
}
