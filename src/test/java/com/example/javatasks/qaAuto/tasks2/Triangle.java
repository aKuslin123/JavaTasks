package com.example.javatasks.qaAuto.tasks2;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    // Метод для расчета периметра
    public double calculatePerimeter() {
        return a + b + c;
    }

    // Метод для расчета площади по формуле Герона
    public double calculateArea() {
        double s = calculatePerimeter() / 2; // Полупериметр
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Формула Герона
    }

    // Метод для вывода информации о треугольнике
    public void printTriangleInfo() {
        System.out.printf("Стороны треугольника: A = %.2f, B = %.2f, C = %.2f\n", a, b, c);
        System.out.printf("Периметр: %.2f\n", calculatePerimeter());
        System.out.printf("Площадь: %.2f\n", calculateArea());
    }
}
