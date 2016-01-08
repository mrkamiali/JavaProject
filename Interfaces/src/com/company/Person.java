package com.company;

/**
 * Created by Kamran ALi on 1/9/2016.
 */
public class Person implements Info {
        private String name ;

    public Person(String name) {
        this.name = name;
    };

    public void greet(){
        System.out.println("Hello There :" +name );
    };

    @Override
    public void showInfo() {
        System.out.println(" Here second person name is " +name);
    }
}
