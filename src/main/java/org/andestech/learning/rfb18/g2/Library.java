package org.raiffeisen.ruallai.learning;

import java.util.Scanner;

public class Library
{
    private Book[] books;


    public Library() { }

    public Library(Book[] books)
    {
        this.books = books;
    }

    public Book[] getBooks()
    {
        return books;
    }

    public void setBooks(Book[] books)
    {
        this.books = books;
    }


    // Метод для выдачи книги
    public void giveABook(Book[] books) throws BookNotFoundException, BookLoanException
    {
        int id;
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n" + "Для выдачи, введите id книги: ");
        id = scanner.nextInt();

        for(int i = id; i < books.length; i++)
        {
            if(books[id] != null && books[id].getId() == id)
            {
                if(!books[id].isOnLoan())
                {
                    books[id].setOnLoan(true);
                    break;
                }
                else throw new BookLoanException("Книга уже выдана");
            }
            else throw new BookNotFoundException("Книги нет в наличии");
        }
    }


    // Метод, добавляющий книгу
    public Book addABook()
    {
        Scanner scanner = new Scanner(System.in);
        Book book = new Book();

        System.out.print("Введите название книги: ");
        book.setTitle(scanner.nextLine());

        System.out.print("Введите фамилию и имя автора: ");
        book.setAuthor(scanner.nextLine());

        System.out.print("Введите год издания: ");
        book.setYear(scanner.nextLine());

        System.out.print("Введите ISBN: ");
        book.setIsbn(scanner.nextLine());

        book.setOnLoan(false);

        System.out.println();

        return book;
    }


    // Метод, удаляющий книгу
    public void removeABook(Book[] books)
    {
        int id;
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n" + "Для удаления, введите id книги: ");
        id = scanner.nextInt();

        for(int i = id; i < books.length; i++)
        {
            if(books[id] != null && books[id].getId() == id)
            {
                books[id] = null;
            }
        }
    }
}
