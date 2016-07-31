package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int randomNumebr;
        int minimumNumber = 1;
        int maximumNumber = 10;
        char userInput;
        int trial=0;
        Scanner input = new Scanner(System.in);
        Random random = new Random();


        System.out.println("Want to play Game ? Y/n ?");
        userInput=input.next().charAt(0);
        if(userInput=='y'||userInput=='Y'){
            do{
                randomNumebr= random.nextInt(maximumNumber - minimumNumber + 1) + minimumNumber;

                int inputValue;
                //  System.out.println("You Enter in Trial Version");
                System.out.println("Enter any Number between 1 to 10!");
                inputValue=input.nextInt();
                if(randomNumebr==inputValue){
                    System.out.println("Your enterd "+inputValue+" and Random Number was "+randomNumebr);
                    System.out.println("huhoo ! Your number matched to Random Number ,You won !");
                }else{
                    System.out.println("Your enterd Number "+inputValue+" and Random Number was "+randomNumebr);
                    System.out.println("Your Number does not match.. You Lose!");

                }
                trial++;


            }while(trial<3);

            System.out.println("For Play more You have to Buy Premium coins?");
            int premium;
            System.out.println("Enter Your amount of Coin Between 1-10 ");
            premium=input.nextInt();

            if(premium>0 && premium<=10){
                trial=premium;
            }



        }else if(userInput=='N'||userInput=='n'){
            System.out.println("Good Bye");
        }



    }
    }
