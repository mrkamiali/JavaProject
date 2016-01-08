package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Machine machine = new Machine(3);
        machine.greet();

        Person person = new Person("Kamran");
        person.greet();

        Info info = new Machine(2);
        info.showInfo();

        Info info1 = new Person("Ali");
        info1.showInfo();
    }
}
