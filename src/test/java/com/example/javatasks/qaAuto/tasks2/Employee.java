package com.example.javatasks.qaAuto.tasks2;

public class Employee {
    private String name;
    private String position;
    private double salary;

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double percentage) {
        salary += salary*percentage/100;
    }

    public void printCurrencyInfo() {
        System.out.println("Сотрудник: %s, Должность: %s, Зарплата: %.2f"
                .formatted(name, position, salary));
    }
}
