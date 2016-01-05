package com.company;

/**
 * Created by Kamran ALi on 1/5/2016.
 */
public class Car extends Machine {
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void off() {
        System.out.println("Car off");
    }
}
