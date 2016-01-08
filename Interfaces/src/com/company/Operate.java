package com.company;

/**
 * Created by Kamran ALi on 1/9/2016.
 */
public class Operate {
    private Interrupt interrupt;
    private int number;

    public Operate(Interrupt interrupt, int number) {
        this.interrupt = interrupt;
        this.number = number;

    }

    public void function() {
        String result;
        switch (number) {
            case 0:
                result = "YOu number is zero !";
                break;

            case 1:
                result = "YOu number is One !";
                break;

            case 2:
                result = "YOu number is Two !";
                break;

            case 3:
                result = "YOu number is Three !";
                break;

            case 4:
                result = "YOu number is Four !";
                break;
            default:
                result = "Sorry ! we don't have your Data";
                break;

        }
        if (number >= 0 && number <
                4){
            interrupt.okey(result);
        }else {
            interrupt.error(result);
        }
    }
}
