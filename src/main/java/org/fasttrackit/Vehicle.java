package org.fasttrackit;

public class Vehicle {

    String name;
    double mileage;
    double maxSpeed;
    String fuelType;
    double fuelLevel;
    double travelDistance;
    boolean running;

    public double accelerate(double speed, double durationInHours) {
        System.out.println(name + " is accelerating with " + speed + " km/h " + durationInHours + " h.");
        double distance = speed * durationInHours;
        System.out.println("Distance: " + distance);

        travelDistance = travelDistance + distance;
        // same resultas the above statement

//        travelDistance += distance;
        double usedFuel = distance * mileage / 100;
        System.out.println("Used fuel" + usedFuel);
        fuelLevel -= usedFuel;
        System.out.println("Remaining fuel: " + fuelLevel);

        return distance;

    }
}
