package com.company;

import javax.crypto.Mac;

interface Plants {
    public void grow();
};

class Machine implements  Plants{
    public void start(){
        System.out.println("Machine started");
    };


    @Override
    public void grow() {
        System.out.println("Machine Growing");
    };
};

class Camera extends Machine{
    public void start1(){
        System.out.println("Camera Started");
    };

    @Override
    public void grow() {
        System.out.println("Camera Growing");
    };
};

public class Main {

    public static void main(String[] args) {

        Machine machine1 = new Machine(){
            @Override
            public void start() {
                System.out.println("OverRide method with Annonymous Fun");
            };
        };

        machine1.start();

        Plants plants1 = machine1;
        plants1.grow();

        ////////////////Annonymous Function //////////////

        Plants plants = new Plants() {
            @Override
            public void grow() {
                System.out.println("Plants Growing");
            };
        };
        plants.grow();


        Camera camera = new Camera();

        camera.start1();
        camera.grow();

    };
};
