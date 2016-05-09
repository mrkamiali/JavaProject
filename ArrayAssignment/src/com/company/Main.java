package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // write your code here
        int a[] = new int[10];
        Scanner in = new Scanner(System.in);


        int b = 22;
        boolean isPrime = true;
        for (int i = 2; i < b; i++) {
            if (b % i == 0) {
                System.out.println("This is not a prime number");
              //  isPrime = false;
              //  break;
            }else {
                System.out.println("this is prime number");
            }
        };
    }
}
