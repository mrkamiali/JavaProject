package com.company;

import java.util.Arrays;

/**
 * Created by Kamran ALi on 7/13/2016.
 */
public class MyInsertion {
    public static int[] doInsertionSort(int[] input) {

        int temp;
        for (int i = 1; i < input.length; i++) {
            print((i - 1), Arrays.toString(input));
            for (int j = i; j > 0; j--) {
                System.out.println(input[j] + " is comparing by " + input[j - 1]);
                if (input[j] < input[j - 1]) {
                    System.out.println(input[j] + " IS REPLACED BY " + input[j - 1]);

                    temp = input[j];
                    input[j] = input[j - 1];
                    input[j - 1] = temp;
                }
            }
        }
        return input;
    }

    private static void print(int i, String s) {
        System.out.println("Step " + i + ": " + s);

    }

}
