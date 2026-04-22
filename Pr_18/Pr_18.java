/*
Program Name: Pr_18
Description: Abstract class Vehicle.
*/

abstract class Vehicle {
    abstract String fuelType();
    abstract int wheels();
}

class Car extends Vehicle {
    String fuelType() { return "Petrol"; }
    int wheels() { return 4; }
}

class Bike extends Vehicle {
    String fuelType() { return "Petrol"; }
    int wheels() { return 2; }
}

public class Pr_18 {
    public static void main(String[] args) {
        Car c = new Car();
        Bike b = new Bike();

        System.out.println(c.fuelType()+" "+c.wheels());
        System.out.println(b.fuelType()+" "+b.wheels());
    }
}
