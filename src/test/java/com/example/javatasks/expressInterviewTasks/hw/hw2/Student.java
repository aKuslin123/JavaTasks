package com.example.javatasks.expressInterviewTasks.hw.hw2;

import java.util.Arrays;
import java.util.Objects;

/*
Задача 5: Класс Student
Создайте класс Student, который будет представлять студента.
Требования:
Поля:
Имя (name).
ID студента (id).
Средний балл (gpa).
Реализуйте:
Конструкторы:
По умолчанию (без параметров).
Конструктор для инициализации всех полей.
equals и hashCode: два студента считаются равными, если у них совпадают id.
toString: метод, возвращающий строку с информацией о студенте (например, "Student{id=101, name='Anna', gpa=3.8}").
clone: создайте глубокую копию объекта.
 */
public class Student implements Cloneable {
    private String name;
    private int id;
    private double gpa;
    private int[] grades;

    public Student() {}

    public Student (String name, int id, double gpa, int[] grades) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", gpa=" + gpa +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public Student clone() {
        try {
            Student cloned = (Student) super.clone(); // Поверхностное клонирование

            /*
            Если объект содержит ссылки на другие объекты,
            они также должны быть рекурсивно клонированы,
            чтобы изменения в одном объекте не влияли на другой.

            Если, например, у объекта есть массив или список оценок,
            то оригинал и клон будут ссылаться на один и тот же массив/список.
             */

            // Глубокое клонирование массива
            if (this.grades != null) {
                cloned.grades = this.grades.clone(); // Копируем массив отдельно
            }

            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
