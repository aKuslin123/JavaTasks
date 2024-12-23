package com.example.javatasks.expressInterviewTasks.hw.hw5.library;

public class Book {
    private boolean isActive;
    private final String name;
    private int activePage;

    public Book(boolean isActive, String name, int activePage) {
        this.isActive = false;
        this.name = name;
        this.activePage = activePage;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getActivePage() {
        return activePage;
    }

    public void setActivePage(int activePage) {
        this.activePage = activePage;
    }

    public String getName() {
        return name;
    }

    public int nextPage() {
        return activePage++;
    }

    public int previousPage() {
        return activePage--;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isActive=" + isActive +
                ", name='" + name + '\'' +
                ", activePage=" + activePage +
                '}';
    }
}
