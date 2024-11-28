package com.example.javatasks.expressInterviewTasks.hw.hw2;

/*
Задача 3: Класс для представления единицы товара
Описание:
Создайте класс Item, который будет представлять товар.
Класс должен содержать:
Поля:
Название товара (name).
Цена товара (price).
Количество на складе (quantity).
Методы:
sell(int amount): уменьшает количество на складе на заданное значение, если достаточно товара.
restock(int amount): добавляет указанное количество на склад.
getInfo(): возвращает строку с информацией о товаре.
 */
public class Item {
    private String name;
    private int price;
    private int quantity;

    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void sell(int amount) {
        if (quantity >= amount) {
            quantity -= amount;
        } else {
            System.out.println("Недостаточно товара на складе");
        }
    }

    public int restock(int amount) {
        return quantity += amount;
    }

    public String getInfo() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
