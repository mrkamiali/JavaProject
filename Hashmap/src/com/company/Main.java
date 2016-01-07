package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        HashMap<Integer, String> list = new HashMap<Integer, String>();

        list.put(5,"Five");
        list.put(4,"Four");
        list.put(3,"Three");
        list.put(2,"Two");
        list.put(1,"One");


        System.out.println(list.get(2));


        for (Map.Entry<Integer,String> entry: list.entrySet()){
            int key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key + " ," + value);
        }

    }
}
