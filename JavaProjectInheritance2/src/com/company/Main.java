package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Vehicle[] vehiclesArray = new Vehicle[3];

        Bus bus = new Bus("multi", 123, 123, "HINO");

        Car car = new Car("REd", 1999, 98762, "BMW");

        SportsCar sportsCar  = new SportsCar("REd", 1999, 98762, "SportsCar");
        Workshop workshop = new Workshop();

        workshop.doRepair(sportsCar);

        vehiclesArray[0] = car;
        vehiclesArray[1] = bus;
        vehiclesArray[2] = sportsCar;
        Random random = new Random();
        int ii = random.nextInt(3);

        workshop.doRepair(vehiclesArray[ii]);

            /*int i = 0 ;
        for (Vehicle v :vehiclesArray){
            System.out.println(i +"time");
            v.repair();
            i++;
        }
*/


    }

}
