package com.example.javatasks.expressInterviewTasks.hw.hw2.animal;

public class Main {
    public static void main(String[] args) {
        Animal dog1 = new Dog("Шарик", 2, 6);
        dog1.makeSound();

        Dog dog2 = new Dog("Шарик", 2, 6);
        dog2.fetch();
    }
}
