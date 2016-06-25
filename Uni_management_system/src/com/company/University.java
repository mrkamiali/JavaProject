package com.company;

import java.util.Scanner;

/**
 * Created by Kamran ALi on 6/12/2016.
 */
public class University {
    String name;
    Scanner input = new Scanner(System.in);
    private Teacher[] teachersArray;
    private boolean doContinue = true;
    Teacher teacher;
    int counter = 0;

    public void University(String name) {
        this.name = name;
        teachersArray = new Teacher[50];

    }

    public void getTeacher(Teacher obj) {
        teachersArray[counter] = obj;
        counter++;

    }

    public int totalnumberofTeachers() {
        return teachersArray.length;
    }


    public void teacherList() {
        System.out.println("Name \t Age \t Qualification");
        System.out.println(teacher.getName() + "\t " + teacher.getAge() + " \t " + teacher.getQualification());

    }

}

