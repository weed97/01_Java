package com.ohgiraffers.exercise.instance;

public class Laptop {
    private String brand;
    private String model;
    private String ramStorage;
    private String ssdStorage;



    public void setBrand(String brand) {
        this.brand = brand;
    }


    public void setModel(String model) {
        this.model = model;
    }


    public void setRamStorage(String ramStorage) {
        this.ramStorage = ramStorage;
    }


    public void setSsdStorage(String ssdStorage) {
        this.ssdStorage = ssdStorage;
    }

    public String getInfo() {
        return "브랜드명은 " + brand + "입니다." + "모덺명은 " + model + "입니다." + "램용량은" + ramStorage + "입니다. " + "SSD용량은" + ssdStorage + "입니다.";
    }
}
