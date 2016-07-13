package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int[] arr1 = {10, 34, 2, 56, 7, 67, 88, 42};
        int[] arr2 = MyInsertion.doInsertionSort(arr1);
        for (int i : arr2) {
            System.out.print(i);
            System.out.print(", ");
        }
    }
}
