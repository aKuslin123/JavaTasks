package com.example.javatasks.expressInterviewTasks.hw.hw4.calculateDiscount;

public class Main {
    public static void main(String[] args) {
        CalculateDiscount calculateDiscount = new CalculateDiscount();
        double regular = calculateDiscount.calculateDisc(CustomerType.REGULAR, 1000);
        double vip = calculateDiscount.calculateDisc(CustomerType.VIP, 1000);
        double employee = calculateDiscount.calculateDisc(CustomerType.EMPLOYEE, 1000);
        System.out.println(regular);
        System.out.println(vip);
        System.out.println(employee);
    }
}
