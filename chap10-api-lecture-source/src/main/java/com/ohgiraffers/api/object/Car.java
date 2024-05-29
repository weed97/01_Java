package com.ohgiraffers.api.object;

public class Car {
    private String carName;
    private String carColor;
    private int engiceCC;
    // ...


    public Car() {
    }

    public Car(String carName, String carColor, int engiceCC) {
        this.carName = carName;
        this.carColor = carColor;
        this.engiceCC = engiceCC;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public int getEngiceCC() {
        return engiceCC;
    }

    public void setEngiceCC(int engiceCC) {
        this.engiceCC = engiceCC;
    }

    @Override
    public String Car(String carName,String carColor) {

        if (carColor == this.carColor && carName == this.carName) {


        }
    }
}


