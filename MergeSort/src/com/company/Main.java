package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {
    private int[] array;
    private int[] tempMergArr;
    private int length;

    public static void main(String[] args) {
        // write your code here
//        int[] inputArr = {45, 23, 11, 89, 77, 98, 4, 28, 65, 43};
//        Main mms = new Main();
//        mms.sort(inputArr);
////        System.out.println(Arrays.toString(inputArr));
        /*for (int i : inputArr) {
            System.out.print(i);
            System.out.print(" ");
        }*/

        final int SIZE = 10;

        Random r = new Random();
        int[] test = new int[SIZE];

        for (int i = 0; i < SIZE; i++){
            test[i] = r.nextInt(99);
        }
        System.out.print(Arrays.toString(test));
        System.out.println("");
        test = Radix.sort(test);

       // for (Integer i : test){
            System.out.print(Arrays.toString(test));
        //}

     }

    public void sort(int inputArr[]) {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergArr = new int[length];
        doMergeSort(0, length - 1);
    }

    private void doMergeSort(int lowerIndex, int higherIndex) {
//        System.out.println(lowerIndex);
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            doMergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            doMergeSort(middle + 1, higherIndex);
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }

    private void mergeParts(int lowerIndex, int middle, int higherIndex) {

        for (int i = lowerIndex; i <= higherIndex; i++) {
            System.out.println(Arrays.toString(tempMergArr));
            tempMergArr[i] = array[i];
            System.out.println("array wala"+Arrays.toString(array));
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }

    }
}
