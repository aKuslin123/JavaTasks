package com.example.javatasks.qaAuto.tasks2;

public class Currency {
    private String name;
    private double rateToUsd;

    public Currency(String name, double rateToUsd) {
        this.name = name;
        this.rateToUsd = rateToUsd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRateToUsd() {
        return rateToUsd;
    }

    public void setRateToUsd(double rateToUsd) {
        this.rateToUsd = rateToUsd;
    }

    public double convertToUsd(double amount) {
        return amount * rateToUsd;
    }

    public void printCurrencyInfo() {
        System.out.println("php\n" +
                "Copy code\n" +
                "Валюта: %s, Курс к USD: %2f"
                        .formatted(name, rateToUsd));
    }
}
