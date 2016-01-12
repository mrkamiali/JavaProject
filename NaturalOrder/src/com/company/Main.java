package com.company;

import java.util.*;

class Person implements Comparable<Person>{
    private String  name ;

    Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (!name.equals(person.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public int compareTo(Person person) {


        return name.compareTo(person.name);
    }
}
public class Main {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();
        SortedSet<Person> set = new TreeSet<Person>();

        addElements(list);
        addElements(set);

        Collections.sort(list);
        showElement(list);

        System.out.println();
        showElement(set);

    }
    private static void addElements (Collection<Person> collection){
            collection.add(new Person("Kamran"));
        collection.add(new Person("Qasum"));
        collection.add(new Person("Moosa"));
        collection.add(new Person("ALi"));
        collection.add(new Person("Imrana"));

    };
    private static void showElement(Collection<Person> collection){
        for (Person element: collection){
            System.out.println(element);
        }
    }
}
