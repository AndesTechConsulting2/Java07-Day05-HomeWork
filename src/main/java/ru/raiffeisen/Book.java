package ru.raiffeisen;

public class Book {
    private int id, year;
    private String author, ISBN, title;
    private boolean onLoan;

    public Book(int id, int year, String ISBN, String author, String title, boolean onLoan) {
        this.id = id;
        this.year = year;
        this.ISBN = ISBN;
        this.author = author;
        this.title = title;
        this.onLoan = onLoan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isOnLoan() {
        return onLoan;
    }

    public void setOnLoan(boolean onLoan) {
        this.onLoan = onLoan;
    }

    public String getBook() {
        return "id = " + id + ", year = " + year + " , ISBN = " + ISBN + " , author = " + author + " , title = " + title
                + " , onLoan = " + onLoan + ".";
    }

    @Override
    public String toString() {
        return getBook();
    }
}

