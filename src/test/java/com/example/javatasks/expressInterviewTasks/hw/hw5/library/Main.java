package com.example.javatasks.expressInterviewTasks.hw.hw5.library;

/*
Задача 5:
Спроектировать библиотеку, где:
1. В один момент времени активна одна книга
2. Можно переключаться между другими книгами
3. В книге всегда отображается последняя активная страница
 */

/*
class Library
books ArrayList
switchBook()
showActiveBook()
addBook()
removeBook()

class Book
boolean isActive - mutable
String name - immutable
int activePage - mutable
nextPage()
previousPage()
 */

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(false, "Книга1", 1);
        Book book2 = new Book(false, "Книга2", 1);
        Book book3 = new Book(false, "Книга3", 1);

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.showBooks();

        library.switchBook(book3.getName());


        library.switchBook(book2.getName());


        library.switchBook(book1.getName());
        library.showBooks();

    }
}
