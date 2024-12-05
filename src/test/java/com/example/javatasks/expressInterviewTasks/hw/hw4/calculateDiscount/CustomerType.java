package com.example.javatasks.expressInterviewTasks.hw.hw4.calculateDiscount;

public enum CustomerType {
    REGULAR(0.05),
    VIP(0.10),
    EMPLOYEE(0.30);

    private final double discount;

    CustomerType(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }
}
