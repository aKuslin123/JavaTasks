package com.example.javatasks.qaAuto.tasks2;

public class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {}

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void printInfo() {
        System.out.println(String.format(("php\n" +
                "Copy code\n" +
                "Имя: %s, Возраст: %d, Пол: %s"), name, age, gender));
    }
}
