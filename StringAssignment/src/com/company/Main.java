package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here

        String ones[] = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String tens[] = {"Ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninty"};
        String twentys[] = {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
      //condition for loop
        char condition = 'y';
       //do this until you got n or N
        do {
            //obj for getting input from user
            Scanner input = new Scanner(System.in);
            //taking input from User
            System.out.println("Please enter any number from 1 to 99 !");
            int userInput = input.nextInt();
            int quotient = userInput / 10;
            int reminder = userInput % 10;
            System.out.println("Quotient " + quotient + " Reminder " + reminder);
          //condition 1 to 9
            if (quotient < 1) {
                System.out.println(ones[userInput - 1]);
            }//condition 10,20,30,30 ..... 90
            else if (reminder == 0) {
                System.out.println(tens[quotient - 1]);
            }//condition for 11 to 19
            else if (quotient == 1) {
                System.out.println(twentys[reminder - 1]);
            }//conditon for 21 to 99 except number with 0 i.e 10 20
            else {
                System.out.println(tens[quotient - 1] + " " + ones[reminder - 1]);
            }
            //getting user input for condition
            System.out.println("wanna try again enter y/n");
            condition = (char) System.in.read();
            //checking condition
        } while (condition == 'Y' || condition == 'y');
        System.out.println("Thanks for testing me !");

    }
}
