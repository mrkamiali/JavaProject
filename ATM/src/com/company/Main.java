package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        final int pin = 1234;
        Util util = new Util();

        boolean doContinue = true;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Welcome to Syalani ATM Machine !");
            System.out.println("Enter Your PIN !");
            int inputPin = in.nextInt();
            if (inputPin == pin) {
                doContinue = false;

            } else {
                System.err.println("Your Pin is Wrong !");
            }
        } while (doContinue);


        boolean cont = true;
        do {
            System.out.println("What Do You want me to DO ?");
            System.out.println("1.Deposit");
            System.out.println("2.WithDraw");
            System.out.println("3.Display Amount");
            System.out.println("4.Exit");
            int inputAfterLogin = in.nextInt();
            if (inputAfterLogin == 1) {
                util.deposit();
//                cont = false;
            } else if (inputAfterLogin == 2) {
                util.withDraw();
//                cont = false;
            } else if (inputAfterLogin == 3) {
                util.displayAmount();
//                cont = false;
            } else if (inputAfterLogin == 4) {
                cont = false;
            } else {
                System.err.println("YOu have enter Wrong Option please input correct option from Given Fields !\n Thanks");
            }
        }

        while (cont);
    }


}
