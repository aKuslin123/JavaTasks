package com.example.javatasks.expressInterviewTasks.hw.hw2_oop.animal;

public class Dog extends Animal {
    private int weight;

    public Dog (String name, int age, int weight) {
        super(name, age);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void makeSound() {
        System.out.println("Собака лает");
    }

    public void fetch() {
        System.out.println("Собака приносит палку");
    }
}
