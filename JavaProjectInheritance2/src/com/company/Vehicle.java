package com.company;

/**
 * Created by Kamran ALi on 7/1/2016.
 */
public class  Vehicle {

    private String color;
    private int model;
    private int engineNo;
    private String brand;

    public Vehicle() {
    }

    public Vehicle(String color, int model, int engineNo, String brand) {
        this.color = color;
        this.model = model;
        this.engineNo = engineNo;
        this.brand = brand;
    }
    public void repair(){
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getEngineNo() {
        return engineNo;
    }

    public void setEngineNo(int engineNo) {
        this.engineNo = engineNo;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
