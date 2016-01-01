
package com.company;

import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Machine machine1 = new Machine();

        machine1.start();
        machine1.stop();

        Car car1 = new Car();

        car1.start();
        car1.stop();


        Person person1 = new Person("Kamran " , 23);
        System.out.println(person1);








//      //Multi Dimension Array
//        int[][] grid = {
//                {3,4,5},
//                {1,2,4},
//                {4,2,1},
//                {7,8,9}
//        };
//            for (int row = 0 ; row < grid.length ; row++){
//                for (int col = 0 ; col < grid[row].length ; col++){
//                    System.out.print(grid[row][col] + "\t");
//                }
//                System.out.println();
//            }


//         //Array String
//        String[] fruits = {"apple", "mango", "orange", "kiwi"};
//
//        String[] cars ;
//        cars = new String[3];
//
//        cars[0] = "Lambo";
//        cars[1] = "mustang";
//        cars[2] = "porsche";
//
//        for (String car: cars){
//            System.out.println(car);
//        }
//        System.out.println("\n");
//        for (String fruit: fruits){
//            System.out.println(fruit);
//        };





//        //Arrays//
//            int[] numbers = {2,4,5,6};
//
//            int[] values ;
//            values = new int[3];
//
//            values[0]   = 23 ;
//        values[1]   = 21 ;
//        values[2]   = 22 ;
//        for (int i = 0 ; i <numbers.length; i++){
//            System.out.println(numbers[i]);
//        }
//
//        for (int i = 0; i < values.length ; i++){
//            System.out.println(values[i]);
//        }

//        //Switch Case
//        System.out.print("Please enter your Command: ");
//        String value = input.nextLine();
//
//        switch ( value ) {
//            case "start":
//                System.out.println("Machne Started");
//                break;
//            case "stop":
//                System.out.println("Machine Stopped");
//                break;
//            default:
//
//                System.out.println("Command not recognize !");
//
//        }


//
//          int value = 0 ;
////        do {
////            System.out.println("Enter a number " );
////            value = input.nextInt();
////        }while ( value != 5);
////        System.out.println("Got 5 !");

//        System.out.println("Enter a number " );
//        value = input.nextInt();
//      //If conditions //
//        if ( value == 5 ){
//            System.out.println(" yes given condition is true");
//        } else if  ( value == 3){
//            System.out.println(" you have entered " +value);
//
//        } else {
//            System.out.println("Non of the Conditions are matched ");
//        }


//          //For Loop //
//        for (int i=0; i<10 ; i++){
//            System.out.println("Hello World " +i);
//        }

//        /// While Loop//
//          int value = 0;
//        while (value < 10) {
//            System.out.println("Heloo World " + value);
//
//            value = value + 1;
//        }

    }
}
