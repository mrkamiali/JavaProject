package com.company;

/**
 * Created by Kamran ALi on 5/22/2016.
 */
public class University {
    String name;
    Student s;
    Student[] student = new Student[10];
    int index = 0;

    public void displayStudent(Student s) {
        this.s = s;
    }

    //method which returns name age rollNo
    public void displayStudent2(String name, int age, int rollNo) {
        s = new Student();
        s.name = name;
        s.age = age;
        s.rollNo = rollNo;
    }

    //Array of Student Class
    public void StudentList(Student s) {
        student[index++] = s;
    }

}
