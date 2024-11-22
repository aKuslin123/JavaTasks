package com.example.javatasks.qaAuto.tasks2;

public class Car {
    private String brand;
    private String model;
    private int year;
    private double price;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void printCarInfo() {
        System.out.println(
                "php\n" +
                        "Copy code\n" +
                        "Бренд: %s Модель: %s, Год: %d, Цена: %.2f\n"
                .formatted(brand, model, year, price));
    }
}
