package com.company;

/**
 * Created by Kamran ALi on 7/1/2016.
 */
public class SportsCar extends Vehicle {
    public SportsCar(String color, int model, int engineNo, String brand) {
        super(color, model, engineNo, brand);
    }

    @Override
    public void repair() {
        super.repair();
        System.out.println("sportsCar repaired");
    }
}
