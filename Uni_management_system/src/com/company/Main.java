package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        University uni = new University();
        System.out.print("Enter University Name = ");
        String uniName = in.next();

        System.out.println("Welcome to " + uniName + " menu !");
        System.out.println("1.To add Teacher;");
        System.out.println("2.To add Student;");
        System.out.println("3.To View Teachers;");
        System.out.println("4.To View Students;");
        System.out.println("5.To Search Teacher;");
        System.out.println("6.To Search Student;");
        System.out.println("7.Exit;");
        int input = in.nextInt();

        if (input == 1) {
            Util.addTeacher();
        } else if (input == 2) {

        } else if (input == 3) {
            Util.getTeachers(uni);
        } else if (input == 4) {

        } else if (input == 5) {

        } else if (input == 6) {

        } else {

        }
    }
}
