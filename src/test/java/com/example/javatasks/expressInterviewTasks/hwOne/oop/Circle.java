package com.example.javatasks.expressInterviewTasks.hwOne.oop;

/*
Задача 1: Создание класса "Круг"
Создайте класс Circle, который будет описывать круг с помощью следующих свойств и методов:
Поле radius (радиус круга).
Конструктор, который принимает радиус круга.
Метод getArea(), возвращающий площадь круга (π * r^2).
Метод getCircumference(), возвращающий длину окружности (2 * π * r).
Пример использования:
java
Copy code
Circle circle = new Circle(5);
System.out.println("Площадь: " + circle.getArea());
System.out.println("Длина окружности: " + circle.getCircumference());
 */

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}
