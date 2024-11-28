package com.example.javatasks.expressInterviewTasks.lessons.lesson3.oopTransport;

public class Car extends Transport implements IRefueable {
    private double levelOfFuel;

    public Car(String brand, int year) {
        super(brand, year);
        this.levelOfFuel = 0;
    }

    @Override
    public boolean fuel() {
        levelOfFuel++;
        return true;
    }
}
