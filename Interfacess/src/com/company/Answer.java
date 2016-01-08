package com.company;

/**
 * Created by Kamran ALi on 1/9/2016.
 */
public class Answer {
    private Interrupt interrupt;
    private int number ;
    public Answer(Interrupt interrupt,int number) {
        this.interrupt = interrupt ;
        this.number = number ;
        run();
    }
    public void run(){
        if (number<5){
            interrupt.okey("Good Reult");
        }else {
            interrupt.error("bad Result");
        }
    }
}
