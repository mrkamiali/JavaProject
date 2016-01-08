package com.company;

/**
 * Created by Kamran ALi on 1/9/2016.
 */
public class Machine implements Info {

    private  int id  ;

    public Machine(int id) {
        this.id = id;
    }

    public void greet(){
        System.out.println("Machine id is :"+id ) ;
    }

    @Override
    public void showInfo() {
        System.out.println("Machine "+id +" is Working !");
    }
}
