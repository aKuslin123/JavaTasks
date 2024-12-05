package com.example.javatasks.expressInterviewTasks.hw.hw4.calculateDiscount;

public class CalculateDiscount {
    public double calculateDisc(CustomerType customerType, double amount) {
        return amount * customerType.getDiscount();
    }
}
