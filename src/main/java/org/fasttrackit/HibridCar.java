package org.fasttrackit;

public class HibridCar extends Vehicle {


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
        protected HibridCar clone() throws CloneNotSupportedException {
            return new HibridCar();


        }



    public void fly()  {

        System.out.println("Yeey! Flying!");
    }




    }

