package com.example.javatasks.qaAuto.tasks2;

import java.sql.SQLOutput;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public void printCircleInfo() {
        double area = calculateArea();
        double circumference = calculateCircumference();
        System.out.println("Круг: Радиус = " + radius + ", Площадь = " + area + ", Длина окружности = " + circumference);
    }


}
