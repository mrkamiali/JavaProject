package com.company;

/**
 * Created by Kamran ALi on 7/1/2016.
 */
public class Student extends Human {

    public Student(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void eating() {
        super.eating();
        System.out.println("Student is Eating ");
    }

    @Override
    public void sleeping() {
        super.sleeping();
        System.out.println("Student is sleeping");
    }
}
