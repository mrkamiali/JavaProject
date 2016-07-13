package com.company;

import java.util.Arrays;

/**
 * Created by Kamran ALi on 7/13/2016.
 */
public class MySelectionSort {
    public static int pos = 0;


    public static int[] doSelectionSort(int[] arr) {
        int i, j;
        System.out.println("" + Arrays.toString(arr));
        for (i = 0; i < arr.length - 1; i++) {
            int index = i;
            System.out.println("Step "+(i+1)+" " + Arrays.toString(arr));

            for (j = i + 1; j < arr.length; j++)
//                System.out.println("before Loop " + j);
                if (arr[j] < arr[index])
//                System.out.println("Item " +arr[j]);
                    index = j;
//            System.out.println("after assigning index " + j);

            int smallerNumber = arr[index];
            System.out.println("Smaller number " + smallerNumber);
            arr[index] = arr[i];

            arr[i] = smallerNumber;
//            System.out.println("Array after sort " + arr[i]);
        }
        return arr;
    }


}
