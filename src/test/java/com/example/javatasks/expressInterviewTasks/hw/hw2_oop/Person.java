package com.example.javatasks.expressInterviewTasks.hw.hw2_oop;

import java.util.Objects;

/*
Задача 4: Класс для человека
Описание задачи:
Создайте класс Person, который будет представлять человека. Класс должен содержать:
Поля:
Имя (name) — строка.
Возраст (age) — целое число.
Пол (gender) — строка (например, "мужчина" или "женщина").
Город (city) — строка.
Несколько конструкторов:
Конструктор, принимающий только имя.
Конструктор, принимающий имя и возраст.
Конструктор, принимающий все поля.
Методы:
Геттеры и сеттеры для всех полей.
Переопределите методы equals и hashCode так, чтобы люди считались равными, если у них совпадают имя и возраст.
 */
public class Person {
    private String name;
    private int age;
    private Gender gender;
    private String city;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, Gender gender, String city) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.city = city;
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", city='" + city + '\'' +
                '}';
    }
}
