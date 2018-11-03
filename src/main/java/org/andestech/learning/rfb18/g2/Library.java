package org.andestech.learning.rfb18.g2;

public class Library {
    public static final int MAX_BOOKS_NUM = 5;
    private Book books[];

    public Library() {
        books = new Book[MAX_BOOKS_NUM];
    }

    public Library(Book[] books) {
        this.books = new Book[MAX_BOOKS_NUM];
        this.books = books;
    }

    public boolean addBook(Book newBook){
        for (int i=0;i<books.length; i++){
            if (books[i] == null) {
                books[i] = newBook;
                return true;
            }
        }
        System.out.println("There is no place. Library is full");
        return false;
    }

    public boolean addBook(String title, String author, int year, String ISBN){
        Book newBook = new Book(title, author, year, ISBN);
        for (int i=0;i<books.length; i++){
            if (books[i] == null) {
                books[i] = newBook;
                return true;
            }
        }
        System.out.println("There is no place. Library is full");
        return false;
    }

    void removeBook(Book remBook) throws BookLoanException, BookNotFoundException {
        for(int i = 0; i<books.length; i++) {
            if ((books[i] != null) && (books[i] == remBook)) {
                if(!books[i].isOnLoan()){
                    books[i] = null;
                    return;
                }
                else throw new BookLoanException("Cannot remove book. It's loaned");
            }
        }
        throw new BookNotFoundException("The book doesn't exist in library");
    }

    void removeBook(int id) throws BookLoanException, BookNotFoundException {
        for(int i = 0; i<books.length; i++) {
            if ((books[i] != null) && (books[i].getId()==id)) {
                if(!books[i].isOnLoan()){
                    books[i] = null;
                    return;
                }
                else throw new BookLoanException("Cannot remove book. It's loaned");
            }
        }
        throw new BookNotFoundException("The book doesn't exist in library");
    }

    void loanBook(Book bookToLoan) throws BookLoanException, BookNotFoundException {
        for (Book book : books) {
            if ((book != null) && (bookToLoan == book)) {
                if (!book.isOnLoan()) {
                    book.giveBookAway();
                    return;
                }
                else throw new BookLoanException("The book is loaned already");
            }
        }
        throw new BookNotFoundException("The book doesn't exist in library");
    }

    void printLibrary(){
        System.out.println("Library books:\n********************");
        for (Book book : books)
            if (book != null)
                System.out.println(book.toString());
        System.out.println("********************");
    }
}