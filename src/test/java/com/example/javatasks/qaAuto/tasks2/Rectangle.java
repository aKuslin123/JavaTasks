package com.example.javatasks.qaAuto.tasks2;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }

    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    public void printRectangleInfo() {
        double area = calculateArea();  // Вычисляем площадь
        double perimeter = calculatePerimeter();  // Вычисляем периметр
        System.out.println("Прямоугольник: Ширина = " + width + ", Высота = " + height +
                ", Площадь = " + area + ", Периметр = " + perimeter);
    }
}
