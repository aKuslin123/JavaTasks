package com.example.javatasks.expressInterviewTasks.hw.hw2_oop.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.printf("Книга - %s добавлена в библиотеку %n", book.getTitle());
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                System.out.printf("Книга с названием - %s найдена %n", title);
                return book;
            }
        }
        System.out.printf("Книга с названием - %s не найдена %n", title);
        return null;
    }

    public void showAvailableBooks() {
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book);
            }
        }
    }
}
