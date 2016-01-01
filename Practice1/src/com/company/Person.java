package com.company;

/**
 * Created by Kamran ALi on 12/29/2015.
 */
public class Person implements Info {

    private String name ;

    public Person(String name) {
        this.name = name;
    }

    public void greet(){
        System.out.println("Hello");
    }

    @Override
    public void showInfo() {
        System.out.println("Perosn Name is : "+name );
    }
}
