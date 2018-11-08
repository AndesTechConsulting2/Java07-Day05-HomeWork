package ru.raiffeisen.mikhaylova;

public class Book {

    // переменные
    private static int countId = 0;
    private int id;
    private int year;
    private String author, title, ISBN;
    private boolean onLoan;

    public int getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getISBN() {
        return ISBN;
    }

    public boolean isOnLoan() {
        return onLoan;
    }

    // конструктор
    public Book(int year, String author, String title, String ISBN) {
        super();
        this.year = year;
        this.author = author;
        this.title = title;
        this.ISBN = ISBN;
        onLoan = false;
        id = ++countId;
    }

    // переопределение метода
    @Override
    public String toString() {
        return "id: " + id + ", author: " + author + ", title: " + title + ", year: " + year + ", ISBN: " + ISBN
                + ", выдана ли книга: " + onLoan;
    }

    //
    public void takeTheBook() {
        this.onLoan = true;
    }
}
