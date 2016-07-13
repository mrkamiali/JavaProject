package com.company;

import java.util.Scanner;

/**
 * Created by Kamran ALi on 7/1/2016.
 */
public class University {
    Scanner input = new Scanner(System.in);

    Student s;
    Student[] studentsArray;
    int arrayLenght = 10;
    int index = 0;

    public University() {
        studentsArray = new Student[arrayLenght];
    }

    public void addStudent() {
        boolean doContinue = true;
        do {
            s = new Student();
            System.out.print("Enter Student Name = ");
            s.name = input.next();
            System.out.print("Enter Student Age =");
            s.age = input.nextInt();
            System.out.print("Enter Student Roll Number =");
            s.rolNumber = input.nextInt();
            System.out.print("Enter Student Gender =");
            s.gender = input.next();
            studentsArray[index++] = s;
            System.out.print("want to add more Student y/n ?? ");
            char cond = input.next().charAt(0);
            System.out.println(cond);
            if ((cond == 'n' || cond == 'N')) {
                doContinue = false;

            }

        } while (doContinue);
        Main.menu();
    }

    public void displayStudents() {
            for (int i = 0 ; i<this.index ; i++){
                System.out.println("+++++++++++++++++++++++++++++");
                System.out.println((i+1)+"."+("Name "+this.studentsArray[i].getName()+" \t Age "+this.studentsArray[i].getAge()+
                " \t Rol Number "+this.studentsArray[i].getRolNumber()+"\t Gender "+this.studentsArray[i].getGender()));
                System.out.println("+++++++++++++++++++++++++++++");
            }
    }
}
