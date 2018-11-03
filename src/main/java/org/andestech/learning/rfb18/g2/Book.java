package org.raiffeisen.ruallai.learning;

public class Book
{
    private int id;
    private String author;
    private String title;
    private String year;
    private String isbn;
    private boolean onLoan;


    public Book() { }

    public Book(int id, String author, String title, String year, String isbn, boolean onLoan)
    {
        this.id = id;
        this.author = author;
        this.title = title;
        this.year = year;
        this.isbn = isbn;
        this.onLoan = onLoan;
    }


    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getYear()
    {
        return year;
    }

    public void setYear(String year)
    {
        this.year = year;
    }

    public String getIsbn()
    {
        return isbn;
    }

    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }

    public boolean isOnLoan()
    {
        return onLoan;
    }

    public void setOnLoan(boolean onLoan)
    {
        this.onLoan = onLoan;
    }


    @Override
    public String toString()
    {
        String loan;

        if(isOnLoan() == true)
           loan = "да";
        else
            loan = "нет";

        return "\n" + " ID: " + id +
                "\n \"" + title + "\"\n" +
                " Автор: " + author + "\n" +
                " Год издания: " + year + "\n" +
                " Выдана: " + loan;
    }
}
