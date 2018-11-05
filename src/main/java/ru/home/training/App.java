package ru.home.training;

public class App {

    public static void main(String[] args) throws BookNotFoundException, BookLoanException {


        Library library = new Library();
        Book book1 = new Book(1,456-67-987,1978,"test", "test");
        Book book2 = new Book(2,456-67-987,1978,"test", "test");
        Book book3 = new Book(3,456-67-987,1978,"test", "test");
        Book book4 = new Book(4,456-67-987,1978,"test", "test");
        Book book5 = new Book(5,456-67-987,1978,"test", "test");
        //System.out.println(book1.toString());
        library.addBook(book1);
        //library.addBook(book2);
        //library.addBook(book3);
        //library.addBook(book4);
        //library.addBook(book5);
        //library.removeBook(book2);
        library.allBooks();
        //library.loan(book1);

    }
}
