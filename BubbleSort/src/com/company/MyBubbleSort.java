package com.company;

import java.util.Arrays;

/**
 * Created by Kamran ALi on 7/13/2016.
 */
public class MyBubbleSort {
    public static int pos = 0;
    public static void BubbleSort( int [ ] num )
    {
        int j;
        boolean flag = true;   // set flag to true to begin first pass
        int temp;   //holding variable
        System.out.println("Given Array "+Arrays.toString(num));
        System.out.println("Start from the starting two Values "+num[0]+" and "+num[1]);
        while ( flag )
        {
            flag= false;    //set flag to false awaiting a possible swap
//            System.out.println("Step "+pos+" "+Arrays.toString(num));
            for( j=0;  j < num.length -1;  j++ )
            {
                System.out.println("Step "+pos+" "+Arrays.toString(num));
                if ( num[ j ] > num[j+1] )   // change to > for ascending sort
                {
                    System.out.println("Num "+num[j]+" replaced by "+num[j+1]);
                    temp = num[ j ];
                              //swap elements
                    num[ j ] = num[ j+1 ];
                    num[ j+1 ] = temp;
                    flag = true;              //shows a swap occurred
                }
                pos++;

            }
        }
    }
}
