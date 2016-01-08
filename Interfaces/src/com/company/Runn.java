package com.company;

/**
 * Created by Kamran ALi on 1/9/2016.
 */
public class Runn implements  Interrupt {

    public Runn(int numb){
        Operate operate = new Operate(this, numb);
        operate.function();
    }

    @Override
            public void okey(String result) {
        System.out.println(result);
            }

    @Override
    public void error(String result) {
        System.out.println(result);
    }
}
