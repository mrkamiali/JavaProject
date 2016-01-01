package com.company;

import javax.crypto.Mac;
import java.util.ArrayList;


class Machine{
    @Override
    public String toString() {
        return "I'm a Father of Camera";
    }
}
class Camera /*extends Machine*/{
    @Override
    public String toString() {
        return "I'm a Camera";
    }
}


public class Main {

    public static void main(String[] args) {

        ArrayList<Machine> list = new ArrayList<Machine>();

        list.add(new Machine());
    //    showInfo(list);

        ArrayList<Camera> list1 = new ArrayList<Camera>();

        list1.add(new Camera());
        showInfo(list);
        showInfo(list1);

            }
    public static void showInfo(ArrayList<?> list){
        for (Object value : list){
            System.out.println(value);
        }
    }

}
