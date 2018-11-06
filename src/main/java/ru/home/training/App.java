package ru.home.training;

public class App {


    public static void main(String[] args) throws BookNotFoundException, BookLoanException {
        Library library = new Library();

        Book book1 = new Book(1,"456-567-45",1978,"test", "test",true);
        Book book2 = new Book(2,"456-567-45",1978,"test", "test",false);
        Book book3 = new Book(3,"456-567-45",1978,"test", "test",true);
        Book book4 = new Book(4,"456-567-45",1978,"test", "test",false);
        Book book5 = new Book(5,"456-567-45",1978,"test", "test",true);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        //library.removeBook(book1);
        //library.allBooks();
        library.loan(book4);
        library.loan(book2);

    }
}
