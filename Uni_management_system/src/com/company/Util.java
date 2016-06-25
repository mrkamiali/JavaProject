package com.company;

import java.util.Scanner;

/**
 * Created by Kamran ALi on 6/19/2016.
 */
public class Util {

    public static Teacher addTeacher() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Teacher Name:");
        String name = in.nextLine();
        System.out.println("Enter Teacher Age:");
        int age = in.nextInt();
        System.out.println("Enter Teacher Qualification:");
        String qualification = in.nextLine();

        return new Teacher(name, age, qualification);
    }

    public static void getTeachers(University uni) {
        Scanner in = new Scanner(System.in);
        boolean doContine = true;
        char choice;
        do {
            uni.getTeacher(addTeacher());
            System.out.println("Do you Want to Add More Student: y/n");
            choice = in.next().charAt(0);
            if ((choice == 'n' || choice == 'N') || (uni.counter == uni.totalnumberofTeachers())) {
                doContine = false;

            }
        } while (doContine);
    }


}
