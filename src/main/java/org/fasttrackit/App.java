package org.fasttrackit;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws Exception {
        Game game = new Game();
        game.start();

       // do {
       //     System.out.println("Repeating something");
       //
       // } while (true);
    }
}
//        Engine engine = new Engine();
//
//        Car car = new Car(engine);
//        car.setName("Dacia");
//        car.setFuelLevel(60);
//        car.setMileage(8.5);
//        car.doorCount = 5;
//        car.setMaxSpeed(180);
//        car.setFuelType("Gasoline");
//
//        System.out.println("Car object:" + car.toString());
//
//        System.out.println(car.getName());
//        System.out.println(car.getTravelDistance());
//        System.out.println(car.isRunning());
//        System.out.println(car.engine);
//
//        car.accelerate(60, 1);
//        car.accelerate(90);
//
//
//        Engine engine2 = new Engine();
//        engine2.manufacturer = "VW";
//        engine2.capacity = 1600;
//
//        Car car2 = new Car(engine2);
//        car2.setName("Golf");
//        car.setFuelLevel(70);
//        car.setMileage(10);
//        car.doorCount = 2;
//        car.setMaxSpeed(210);
//        car.setFuelType("Diesel");
//
//
////concatenation
//        System.out.println("car2 name: " + car2.getName());
//        System.out.println("car1 name: " + car.getName());
//
//        //  car = car2;
//
//        System.out.println("Modulo examples:");
//        System.out.println(4 % 2);
//        System.out.println(4 % 3);
//
//        System.out.println("Please enter some text");
//        Scanner scanner = new Scanner(System.in);
//        String text = scanner.nextLine();
//        System.out.println("Input from user" + text);

        // we should only call static variables from the class itself (Car),
        //not from a variable containing an object of that class

//        System.out.println("Static variables example: ");
//        car.totalCount=1;
//        System.out.println("Total count in car: "+ car.totalCount);
//        car2.totalCount=2;
//        System.out.println("Total count in car after setting car 2: "+ car.totalCount);
//        System.out.println("Total count in car 2: "+ car2.totalCount);
//        System.out.println("Total count in Car class: "+ Car.totalCount);


//        Vehicle hybridCar = new HybridCar();
//        hybridCar.setName("Cheater!!!");
//     // method implementation from object's class not from  variable's class
//        hybridCar.accelerate(60, 1);
//        System.out.println("Fuel Level" + hybridCar.getFuelLevel());
//        System.out.println(" Traveled distance"+hybridCar.getTravelDistance());
//
//        //variable type what methods can be  invoked
//        // type casting
//        ((HybridCar) hybridCar).fly();
//    }
//}