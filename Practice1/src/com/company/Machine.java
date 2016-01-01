package com.company;

/**
 * Created by Kamran ALi on 12/29/2015.
 */
public class Machine implements  Info {
    private int code ;

    public Machine(int code) {
        this.code = code;
    }


    public void status(){
        System.out.println("THis is Machine COde");
    }


    @Override
    public void showInfo() {
        System.out.println("THis is Machine COde : " +code);
    }
}
