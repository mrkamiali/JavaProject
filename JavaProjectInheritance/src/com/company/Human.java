package com.company;

/**
 * Created by Kamran ALi on 7/1/2016.
 */
public class Human {
    String name;
    int age;
    String gender;

    public Human() {
        System.out.println("Human no arguments");
    }

    public Human(String name, int age, String gender) {
        System.out.println("HUman three Argumenta");
        this.name = name;
        this.age = age;
        this.gender = gender;
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
    public void sleeping(){
        System.out.println("Human is sleeping");
    }
    public void eating(){
        System.out.println("Human is eating");
    }
}
