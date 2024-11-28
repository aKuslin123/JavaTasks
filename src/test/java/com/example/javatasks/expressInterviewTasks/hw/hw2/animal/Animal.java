package com.example.javatasks.expressInterviewTasks.hw.hw2.animal;

/*
Задача 7: Класс животного и наследование
Описание:
Создайте классы Animal (животное) и Dog (собака). Используйте принцип наследования:
Animal — базовый класс, содержащий:
Поля: name (имя животного) и age (возраст).
Метод makeSound(), который выводит строку: "Животное издает звук".
Dog — подкласс, наследующий Animal:
Переопределяет метод makeSound() для вывода строки: "Собака лает".
Добавляет метод fetch() с выводом строки: "Собака приносит палку".
 */
public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Животное издает звук");
    }
}
