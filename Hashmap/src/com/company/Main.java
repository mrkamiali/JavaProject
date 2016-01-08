package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

//      HashMap<String ,HashMap<Integer,value>  map =  new HashMap<String, HashMap<String, Value>>();
        HashMap<String, HashMap<Integer, Boolean>> outerMap = new HashMap<String, HashMap<Integer, Boolean>>();

        HashMap<Integer, Boolean> innerMap = new HashMap<Integer, Boolean>();

        innerMap.put(1, true);
        outerMap.put("OuterKey", innerMap);

        boolean value = outerMap.get("OuterKey").get(1);
        System.out.println("Retreived value is : " + value);


//        System.out.println(map.get(1));
//
//        for (Map.Entry<Integer,String> entry: map.entrySet()){
//            int key = entry.getKey();
//            String value = entry.getValue();
//
//            System.out.println(key +  " ," + value);
//        }
    HashMap<String,Object> map = new HashMap<String, Object>();
        map.put("array",new ArrayList<String>());
        map.put("Integer",1);
        map.put("boolean",true);


    }
}
