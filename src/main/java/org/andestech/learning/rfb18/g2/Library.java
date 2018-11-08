package ru.raiffeisen.mikhaylova;

public class Library {

    public String MESSAGE1 = "библиотека переполнена";
    public String MESSAGE2 = "нельзя удалить книгу, которая выдана";
    public String MESSAGE3 = "книги не существует";
    public String MESSAGE4 = "книга выдана";


    public static final int LIBRARY_SIZE = 5;
    private Book books[];

    public Library(Book[] books) {
        this.books = new Book[LIBRARY_SIZE];
        this.books = books;
    }

    //add
    public boolean add(Book newBook) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = newBook;
                return true;
            }
        }
        System.out.println(MESSAGE1);
        return false;
    }

    public boolean add(int year, String author, String title, String ISBN) {
        Book newBook = new Book(year, author, title, ISBN);
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = newBook;
                return true;
            }
        }
        System.out.println(MESSAGE1);
        return false;
    }

    //remove
    void remove(Book remBook) throws BookLoanException, BookNotFoundException {
        for (int i = 0; i < books.length; i++) {
            if ((books[i] != null) && (books[i] == remBook)) {
                if (!books[i].isOnLoan()) {
                    books[i] = null;
                    return;
                } else {
                    throw new BookLoanException(MESSAGE2);
                }
            }
        }
        throw new BookNotFoundException(MESSAGE3);
    }

    //loan
    void loan(Book bookToLoan) throws BookLoanException, BookNotFoundException {
        for (Book book : books) {
            if ((book != null) && (bookToLoan == book)) {
                if (!book.isOnLoan()) {
                    book.takeTheBook();
                    return;
                } else {
                    throw new BookLoanException(MESSAGE4);
                }
            }
        }
        throw new BookNotFoundException(MESSAGE3);
    }
}
