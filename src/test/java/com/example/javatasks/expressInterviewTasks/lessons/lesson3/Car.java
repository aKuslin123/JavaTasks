package com.example.javatasks.expressInterviewTasks.lessons.lesson3;

public class Car {
    private String brand;
    private int year;
    private boolean isEngineOn;

    public Car(String brand, int year, boolean isEngineOn) {
        this.brand = brand;
        this.year = year;
        this.isEngineOn = isEngineOn;
    }

    public void engineTurnOn(boolean flag) {
        this.isEngineOn = flag;
    }
}
