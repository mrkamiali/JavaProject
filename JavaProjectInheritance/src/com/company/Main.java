package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Human human = new Human();
        Human human2 = new Human("Kamran",23,"Male");
        System.out.println(human2.getName());
        System.out.println(human2.getAge());
        System.out.println(human2.getGender());
        human2.sleeping();
        human2.eating();
        System.out.println("+++++++++++++++++++++++++");
        Human human3 = new Human("Ali",21,"Male");
        System.out.println(human3.getName());
        System.out.println(human3.getAge());
        System.out.println(human3.getGender());
        human3.eating();
        human3.sleeping();
        System.out.println("++++++++++++++++++++++=");
        Human human1 = new Student("Sani",15,"male");

        human1.sleeping();
        human1.eating();
        System.out.println("+++++++++++++++++++");
        human.sleeping();



    }
}
