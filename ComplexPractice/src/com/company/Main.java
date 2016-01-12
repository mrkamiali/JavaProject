package com.company;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static String[] vehicles = {
      "ambulance", "Heli", "lifeboat"
    };
    public static String[][] drivers = {
            {"Kamran", "Moosa", "Qasim"},
            {"Samad", "Imran", "Bilal"},
            {"Ali", "Noman", "Junaid"}
    };
    public static void main(String[] args) {

   Map<String, Set<String>> personnal = new HashMap<String, Set<String>>();

        for (int i = 0 ; i < vehicles.length; i++){
            String vehicle = vehicles[i];
            String[] driversList = drivers[i];

            Set<String> driversSet = new LinkedHashSet<String>();

            for (String driver : driversList){
                driversSet.add(driver);
            }
            personnal.put(vehicle,driversSet);
        }
        {
            Set<String> driverList = personnal.get("Heli");
            for (String drivers : driverList) {
                System.out.println("Heli Drivers are " + drivers);
            }
        }
        System.out.print("\n");

        for (String vehicle : personnal.keySet()){
            System.out.print(vehicle);
            System.out.print(" : ");
            Set<String> driverList = personnal.get(vehicle);

            for (String drivers : driverList) {
                System.out.print(drivers);
                System.out.print(" ");
            }
            System.out.println(" ");

        }
        System.out.println("\n");
    }
}
