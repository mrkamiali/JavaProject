package com.company;

import javax.crypto.Mac;
import java.util.ArrayList;

class People{
    private int age ;
    private String name ;

    People(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';

    }
}

public class Main {

    public static void main(String[] args) {

        People people1 = new People(23,"Kamran");
        People people2 = new People(22,"Ali");

        people1.toString();

        ArrayList<Integer> numerical = new ArrayList<Integer>();

        numerical.add(23);
        numerical.add(123);
        numerical.add(221);

        int alias = numerical.get(1);

        System.out.println(alias);

//        /////InterFace Code /////
//        Machine machine1 = new Machine(8);
//        machine1.status();
//
//        Person person1 = new Person("bob");
//        person1.greet();
//
//        Info info1 = machine1;
//        info1.showInfo();
//
//        Info info2 = person1;
//        info2.showInfo();

    }

    }

