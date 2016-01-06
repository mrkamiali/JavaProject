package com.company;

/**
 * Created by Kamran ALi on 1/6/2016.
 */
public class Robot {
    private int id ;

     Robot(int id) {
        this.id = id;
    }

    private class Brain{
        public void run(){
            System.out.println("Robot "+ id + " Brain is working !");
        }
    }

    public void start(){
        System.out.println("Robot " + id + " working !");
        Brain brain = new Brain();
        brain.run();

        final String name = "Kamran ";
        // //class in Method //
        class temp {
            public void doSomething(){
                ///Calling privat int
                System.out.println("Working id is " + id);
                System.out.println("My Name is " +name);
            }
        }

        temp tmp = new temp();
        tmp.doSomething();
    }
}
