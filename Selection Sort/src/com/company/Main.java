package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr1 = {23,42,4,16,8,15};

        int[] arr2 = MySelectionSort.doSelectionSort(arr1);

        for (int i : arr2) {
            System.out.print(i);
            System.out.print(", ");
        }
    }
}
