package com.company;

public class Vehicle {

    public String engine;
    public String type;
    public boolean isLand;
    public boolean isAir;
    public boolean isWater;
    public boolean isSpace;
    public int passengers;
    public int maxPassengers;

    public void vehicle(String engine,
                        String type,
                        boolean isLand,
                        boolean isAir,
                        boolean isWater,
                        boolean isSpace,
                        int passengers,
                        int maxPassengers) {
        this.engine = engine;
        this.type = type;
        this.isLand = isLand;
        this.isAir = isAir;
        this.isWater = isWater;
        this.isSpace = isSpace;
        this.passengers = passengers;
        this.maxPassengers = maxPassengers;
    }

    public void turnOn() {

    }

    public void turnOff() {

    }

    public void addPassenger() {

    }

    public void removePassenger() {

    }



}
