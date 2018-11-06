package ru.home.training;

public class Book {


    public int id, year;
    public String author, title,ISBN;
    public boolean onloan;

    public Book(int id, String ISBN, int year, String author, String title,boolean onloan) {
        this.id = id;
        this.ISBN = ISBN;
        this.year = year;
        this.author = author;
        this.title = title;
        this.onloan = onloan;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isOnloan() {
        return onloan;
    }

    public void setOnloan(boolean onloan) {
        this.onloan = onloan;
    }


    @Override
    public String toString() {
        return getClass().getName() + "__" +
                "id: " + id +
                ", ISBN: " + ISBN +
                ", Автор: " + author +
                ", Название книги: " + title +
                ", Год издания: " + year +
                ", В наличии: " + onloan;
    }
}