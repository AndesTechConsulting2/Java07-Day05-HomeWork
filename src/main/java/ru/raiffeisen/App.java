package ru.raiffeisen;

public class App {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book(1, 1990, "123456789", "Author", "Title", false);
        Book book2 = new Book(2, 1990, "123456888", "Author", "Title", false);

        library.add(book1);
        library.add(book2);

        library.remove(2);

        try {
            library.loan(1);
            library.loan(1);
            library.loan(2);

        } catch (BookLoanException e) {
            e.printStackTrace();
        } catch (BookNotFoundException e) {
            e.printStackTrace();
        }
    }
}
