package com.example.javatasks.expressInterviewTasks.hw.hw2.Library;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Война и мир", "Лев Толстой", 1869, true);
        Book book2 = new Book("Преступление и наказание", "Фёдор Достоевский", 1866, false);
        Book book3 = new Book("Мастер и Маргарита", "Михаил Булгаков", 1967, true);

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.showAvailableBooks();
        library.findBookByTitle("Война и мир");
        library.findBookByTitle("fdsf");

        book1.borrowBook();
        library.showAvailableBooks();

        book1.returnBook();
        library.showAvailableBooks();
    }
}
