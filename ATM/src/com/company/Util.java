package com.company;

import java.util.Scanner;

/**
 * Created by Kamran ALi on 6/26/2016.
 */
public class Util {
    double balance = 1000;
    Scanner in = new Scanner(System.in);

    public void deposit() {
        System.out.print("Please enter Amount to Deposit = ");
        double input = in.nextInt();
        balance += input;
        System.out.println("Your Current balance is " + balance);
    }

    public void withDraw() {
        System.out.print("Please enter Amount to WithDraw = ");
        double input = in.nextInt();
        balance -= input;
        System.out.println("Your Current balance is " + balance);
    }

    public void displayAmount() {
        System.out.println("Your Current Balance is " + balance);
    }
}
