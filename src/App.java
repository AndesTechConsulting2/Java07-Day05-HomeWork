package org.raiffeisen.ruanad4.learning;


public class App {
    public static void main(String[] args) throws BookNotFoundException, BookLoanException {
        Book book = new Book();
        book.setId(1);
        book.setOnLoan(false);
        book.setAuthor("Тургенев");
        book.setISBN("ISBN 978-5-444565-999-7");
        book.setTitle("Отцы и деты");
        book.setYear(1862);
        Library library = new Library();
        library.add(book);
        try {
            library.loan(book.getId());
            library.loan(book.getId());
            // library.loan(3); тест на книгу, которой нет
        }
        catch (BookLoanException ex){
            System.out.println(ex);
        }
        catch (BookNotFoundException ex){
            System.out.println(ex);
        }
    }
}