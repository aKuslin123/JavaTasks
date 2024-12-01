package com.example.javatasks.expressInterviewTasks.hw.hw2.library;

import java.util.Objects;

/*
Задача 9: Библиотека
Описание задачи:
Создайте класс Book, который будет представлять книгу в библиотеке. Класс должен иметь следующие свойства:
Название книги (title) — строка.
Автор книги (author) — строка.
Год издания (yearPublished) — целое число.
Статус книги (isAvailable) — логическое значение (доступна или нет).
Класс должен содержать следующие методы:
Конструктор, который инициализирует все поля.
Метод borrowBook(), который помечает книгу как недоступную.
Метод returnBook(), который помечает книгу как доступную.
Метод getBookInfo(), который возвращает строку с информацией о книге (например: "Название: Название книги, Автор: Автор книги, Год издания: 2020, Доступна: true").
Дополнительное задание:
Создайте класс Library, который будет управлять несколькими книгами. Реализуйте методы:
Добавление книги в библиотеку.
Поиск книги по названию.
Вывод всех доступных книг.
 */
public class Book {
    private String title;
    private String author;
    private int yearPublished;
    private boolean isAvailable;

    public Book(String title, String author, int yearPublished, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.isAvailable = isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.printf("Взяли книгу - %s %n", title);
        } else {
            System.out.printf("Книга - %s отсутствует в библиотеке %n", title);
        }
    }

    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.printf("Вернули книгу - %s %n", title);
        } else {
            System.out.printf("Книга - %s отсутствует у вас %n", title);
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearPublished=" + yearPublished +
                ", isAvailable=" + isAvailable +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublished == book.yearPublished && isAvailable == book.isAvailable && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, yearPublished, isAvailable);
    }
}
