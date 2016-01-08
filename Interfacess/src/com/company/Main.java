package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Answer asd = new Answer(new Interrupt() {
            @Override
            public void okey(String s) {
                System.out.println(s);
            }

            @Override
            public void error(String s) {
                System.out.println(s);
            }
        },8);

    }
}
