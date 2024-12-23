package com.example.javatasks.expressInterviewTasks.hw.hw5.library;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private Book activeBook;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void showBooks() {
        for(Book book : books) {
            System.out.println(book);
        }
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void switchBook(String name) {
        System.out.println("Смена активной книги");
        for(Book book : books) {
            if (activeBook != null) {
                activeBook.setActive(false);
            }
            if (name.equals(book.getName())) {
                book.setActive(true);
                activeBook = book;
                return;
            }
        }
        System.out.println("Книга с name: " + name + " не найдена");
    }

    public void showActiveBook() {
        System.out.println(activeBook);
    }


}
