package org.fasttrackit;

public class HybridCar extends Vehicle {


    @Override
    public double accelerate(double speed, double durationInHours) {
        System.out.println(getName() + " is accelerating with: " + speed + "for" + durationInHours + "h");
        double actualSpeed = 2 * speed;
        double distance = actualSpeed * durationInHours;
        setTravelDistance(getTravelDistance() + distance);

        System.out.println("Cheater!!!");
        return distance;
    }
//co-variant return type

        @Override
        protected HybridCar clone() throws CloneNotSupportedException {
            return new HybridCar();


        }



    public void fly()  {

        System.out.println("Yeey! Flying!");
    }




    }

