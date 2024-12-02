package com.example.javatasks.expressInterviewTasks.hw.hw2_oop;

import java.util.Objects;

/*
Задача 6: Класс "Товар"
Описание:
Создайте класс Product, который будет представлять товар.
Класс должен содержать:
Поля:
Название (name) — строка.
Цена (price) — double.
Уникальный идентификатор (id) — int.
Конструкторы:
Конструктор по умолчанию.
Конструктор с параметрами.
Методы:
Переопределите equals и hashCode так, чтобы товары считались равными, если совпадают их id.
Переопределите toString для вывода информации о товаре.
Реализуйте clone для копирования товара.
 */
public class Product implements Cloneable {
    private String name;
    private double price;
    private int id;

    public Product(String name, double price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        // проверяем, что this и obj ссылаются на одну и туже область памяти
        // пример p1.equals(p2)
        // p1 - this, текущий объект
        // p2 - obj, объект, который передан в метод equals
        /*
        Почему это полезно в equals?
        Если объекты this и obj равны по ссылке, они точно равны,
        и нам не нужно проверять их id или name.
        Мы просто сразу возвращаем true.
         */
        if (this == obj) return true;

        // obj == null - в этом случае объекты точно не равны, возвращаем false
        // В Java, сравнение с null всегда возвращает false
        // Когда мы пишем equals, мы предполагаем, что сравниваем два реальных объекта, а не один из которых — null.
        /*
        Предотвращение ошибок: Если мы не добавим проверку на null,
        попытка вызвать метод equals с null приведет к NullPointerException
         */

        /*
         getClass() != obj.getClass()
         Мы проверяем, являются ли объекты одного и того же класса.
         getClass() возвращает класс текущего объекта.
         Если классы отличаются, объекты не равны.
         */
        if (obj == null || getClass() != obj.getClass()) return false;

        /*
        Здесь мы делаем приведение типа (casting) объекта obj к типу Product.
        На этом этапе мы уверены, что obj — это объект класса Product (благодаря проверке с getClass()),
        и можем безопасно его привести к типу Product.

        Приведение типа нужно, чтобы получить доступ к полям и методам класса Product,
        так как obj изначально объявлен как Object (в параметре метода equals),
        и мы не можем использовать поля или методы Product до приведения.
         */
        /*
        Приведение типа (или casting) — это процесс преобразования объекта одного типа в объект другого типа.
        В языке Java приведение типа необходимо, когда мы работаем с объектами базового типа,
        а хотим использовать их как объекты более специфического (наследуемого) типа.
         */
        Product otherProduct = (Product) obj;

        return this.id == otherProduct.id && this.name.equals(otherProduct.name);
    }
        /*
        Наш метод проверяет:
        1. Тот же ли это объект.
        2. Сравниваются ли объекты одного типа.
        3. Равны ли значения полей id и name.
         */

        /*
        Хэш-код — это способ, которым Java "идентифицирует" объект
        на уровне памяти с помощью уникального целочисленного значения.
        Если два объекта равны (согласно методу equals), то они должны иметь одинаковый хэш-код.

        Метод hashCode должен быть реализован таким образом,
        чтобы поддерживать контракт с методом equals — если два объекта равны,
        то их хэш-коды должны быть одинаковыми.
         */

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", id=" + id +
                '}';
    }

    @Override
    public Product clone() {
        try {
            // Вызов метода clone у родительского класса Object
            return (Product) super.clone();
        } catch (CloneNotSupportedException e) {
            // Это исключение не должно возникать, так как класс реализует интерфейс Cloneable
            throw new RuntimeException("Clone not supported", e);
        }
    }
}
