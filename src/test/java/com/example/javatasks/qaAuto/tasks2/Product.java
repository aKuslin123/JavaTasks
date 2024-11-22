package com.example.javatasks.qaAuto.tasks2;

public class Product {
    private String name;
    private String category;
    private int quantity;
    private double pricePerUnit;

    public Product(String name, String category, int quantity, double pricePerUnit) {
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public double calculateTotalPrice() {
        return quantity * pricePerUnit;
    }

    public void printProductInfo() {
        System.out.println("php\n" +
                "Copy code\n" +
                "Товар: %s, Категория: %s, Количество: %d, Общая стоимость: %4f\n"
                        .formatted(name, category, quantity, calculateTotalPrice())
        );
    }
}
