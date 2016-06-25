package com.company;

import java.util.Scanner;

/**
 * Created by Kamran ALi on 6/12/2016.
 */
public class Teacher {
    private String name;
    private int age;
    private String qualification;

    public Teacher(String name, int age, String qualification) {
        this.name = name;
        this.age = age;
        this.qualification = qualification;
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

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
}
