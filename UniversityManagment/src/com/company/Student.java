package com.company;

/**
 * Created by Kamran ALi on 7/1/2016.
 */
public class Student {
    String name;
    int age;
    String gender;
    int rolNumber;

    public Student() {
    }

    public Student(String name, int age, String gender, int rolNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.rolNumber = rolNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getRolNumber() {
        return rolNumber;
    }

    public void setRolNumber(int rolNumber) {
        this.rolNumber = rolNumber;
    }
}
