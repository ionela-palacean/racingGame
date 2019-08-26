package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static  void main(String[] args )
    {
        // this is the one-line comment

       Car car= new Car();
       car.name="Dacia";
       car.fuelLevel=60;
       car.mileage=8.5;
       car.doorCount=5;
       car.maxSpeed=180;
       car.fuelType="Gasoline";

       Engine engine=new Engine();
       engine.manufacturer="Renault";
       engine.capacity=1600;

       car.engine=engine;
        System.out.println(car.name);
        System.out.println(car.travelDistance);
        System.out.println(car.running);
        System.out.println(car.engine);

        Car car2= new Car();
        car2.name="Golf";
        car.fuelLevel=70;
        car.mileage=10;
        car.doorCount=2;
        car.maxSpeed=210;
        car.fuelType="Diesel";

        car.name=null;
//concatenation
        System.out.println("car2 name: "+ car2.name);
        System.out.println("car1 name: "+ car.name);

        car=car2;

    }
}
