package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Message> list = new ArrayList<Message>();

        list.add(new Message("Kamran", "kami@ymail.com", "THis is test message"));

        list.add(new Message("Moosa", "moosa@ymail.com"," this is second test message"));

        list.add( new Message("qasim", "Qasim@ymail.com"," this is 3rd test message"));


        for (int i = 0; i < list.size() ; i++ ){

            System.out.println("===================================");
           Message message = list.get(i);

            System.out.println(message.getName()+": (" + message.getEmail()+") \n" + message.getMessage()  );

        }
        System.out.println("===================================");

        for (Message message : list){
            System.out.println("++++++++++++++++++++++++++++++++++++");
            System.out.println(message.getName()+": (" + message.getEmail()+") \n" + message.getMessage());
        }

        int i = 0;
        while ( i < list.size()){
            System.out.println(i+"-"+list.get(i).getName());
i++;
        }
        i=0;
        while (true){

            if ( i == list.size()){break;}

            System.out.println(list.get(i).getName());
i++;
        }
    }
}
