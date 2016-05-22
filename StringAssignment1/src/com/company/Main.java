package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        String keyWord = "HelloWorld";
        int counter = 1;
        //loop to iterate through given String
        for (int i = 0; i < keyWord.length(); i++) {
            //condition for finding L
            if (keyWord.charAt(i) == 'l' || keyWord.charAt(i) == 'L') {
                System.out.println("Found 'l' in keyword " + counter + " times ;");
                counter++;
            }
        }
    }
}
