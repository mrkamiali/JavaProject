package com.company;

/**
 * Created by Kamran ALi on 1/5/2016.
 */
public abstract class  Machine {
    private int id ;

    public int getId() {
        return id;
    };

    public void setId(int id) {
        this.id = id;
    }
    public abstract void start();
    public abstract void off();

    public void method(){
        start();
        off();
    }
}
