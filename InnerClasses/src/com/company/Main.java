package com.company;

public class Main {

    public static void main(String[] args) {

        Robot robot = new Robot(5);
        robot.start();

        // ///After privating Brain classes Ii ain't work ///
//        Robot.Brain brain1 = robot.new Brain();
//        brain1.run();

    }
}
