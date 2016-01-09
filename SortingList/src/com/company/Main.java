package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person{
        private int id ;
    private String name ;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{ " +
                " id= " + id +
                ", name=' " + name + '\'' +
                '}';
    }
};
public class Main {

    public static void main(String[] args) {


        List<String> list = new ArrayList<String>();
        list.add("cat");
        list.add("dog");
        list.add("owl");
        list.add("elephent");
        list.add("crow");

        Collections.sort(list);
        for (String lists : list){
            System.out.println(lists);
        }


        List<Integer> number = new  ArrayList<Integer>();
            number.add(1);
        number.add(7);
        number.add(4);
        number.add(3);
        number.add(9);

        Collections.sort(number);

        for (Integer numbers: number ){
            System.out.println(numbers);
        }

        List<Person> people = new ArrayList<Person>();

        people.add(new Person(1,"Kamran"));
        people.add(new Person(3,"Moosa"));
        people.add(new Person(4,"Qasim"));
        people.add(new Person(2,"ALi"));

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {

                if (p1.getId() > p2.getId()){
                    return 1 ;
                }else if (p1.getId() < p2.getId()){
                    return -1;
                }
                return 0;
            }
        });
        for (Person person: people){
            System.out.println(person);
        }

    }
}
