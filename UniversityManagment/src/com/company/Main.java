package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter University name = ");
        String uniName = input.next();
        System.out.println("Welcome to " + uniName);
        menu();

    }

    public static void menu() {
        Scanner input = new Scanner(System.in);
        boolean doConitnue = true;
        University university = new University();

        do {
            System.out.println("1.Add Student");
            System.out.println("2.Add Teacher");
            System.out.println("3.View Student");
            System.out.println("4.View Teacher");
            int in = input.nextInt();
          if (in == 1){
              university.addStudent();
          }else if (in == 3){
              university.displayStudents();
          }else {
              System.out.println("Please enter the correct number");
          }
        }while (doConitnue);
    }

}
