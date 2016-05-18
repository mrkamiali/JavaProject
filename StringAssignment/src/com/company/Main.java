package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        String ones[] = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String tens[] = {"Ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninty"};
        String twentys[] = {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};


        Scanner in = new Scanner(System.in);
        System.out.println("Please enter any number from 1 to 99 !");
        int userInput = in.nextInt();
        int quotient = userInput / 10;
        int reminder = userInput % 10;
        System.out.println("Quotient " + quotient + " reminder " + reminder);

        if (reminder == 0) {
            System.out.println(tens[quotient - 1]);
        } else if (quotient == 1) {
            System.out.println(twentys[reminder-1]);
        } else if (quotient < 1) {
            System.out.println(ones[userInput-1]);
        } else {
            System.out.println(tens[quotient - 1] + " " + ones[reminder - 1]);
        }
    }
}
