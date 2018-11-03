package org.andestech.learning.rfb18.g2;

public class Book {

    private static int countId=0;
    private int id, year;
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


    public Book(String title, String author, int year, String ISBN) {
        this.year = year;
        this.author = author;
        this.title = title;
        this.ISBN = ISBN;
        id = ++countId;
        onLoan = false;
    }

    public boolean isOnLoan() {
        return onLoan;
    }

    public void giveBookAway() {
        this.onLoan = true;
    }

    public void returnBook() {
        this.onLoan = false;
    }

    @Override
    public String toString() {
        return  "\n----------" +
                "\nBook ID: " + id +
                ",\nTitle: " + title +
                ",\nAuthor: " + author +
                ",\nYear: " + year +
                ",\nISBN: " + ISBN +
                ",\nPlace: " + (onLoan ? "Away":"Library") +
                "\n----------\n";
    }
}