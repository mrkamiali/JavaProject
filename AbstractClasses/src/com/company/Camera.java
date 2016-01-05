package com.company;

/**
 * Created by Kamran ALi on 1/5/2016.
 */
public class Camera extends Machine {
    @Override
    public void start() {
        System.out.println("Camera Started .");
    }

    @Override
    public void off() {
        System.out.println("Camera Off.");
    }
}
