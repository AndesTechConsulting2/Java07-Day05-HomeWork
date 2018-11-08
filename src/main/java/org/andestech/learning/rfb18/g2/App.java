package ru.raiffeisen.mikhaylova;

public class App {

    private static void tryLoan(Library library, Book book) {
        System.out.println("----------\nВзять книгу");
        try {
            library.loan(book);
            System.out.println("книга выдана");
        } catch (BookLoanException | BookNotFoundException ex) {
            System.out.println("Message: " + ex.getMessage());
        }
    }

    private static void tryRemove(Library library, Book book) {
        System.out.println("----------\nУдалить книгу");
        try {
            library.remove(book);
            System.out.println("Кгига удалена");
        } catch (BookLoanException | BookNotFoundException ex) {
            System.out.println("Message: " + ex.getMessage());
        }
    }

    private static void tryAdd(Library library, Book book, boolean expResult) {
        boolean res = library.add(book);
        assert res == expResult;
    }

    public static void main(String[] args) {
        // Books test data
        Book b1 = new Book(1000, "StoryMan", "Story", "9883161484100");
        Book b2 = new Book(1100, "StoryMan", "Story", "9883161484101");
        Book b3 = new Book(1200, "StoryMan", "Story", "9883161484102");
        Book b4 = new Book(1300, "StoryMan", "Story", "9883161484103");
        Book b5 = new Book(1400, "StoryMan", "Story", "9883161484104");

        Book books[] = new Book[Library.LIBRARY_SIZE];
        books[0] = b1;
        books[1] = b2;

        //Library and filling examples
        Library library = new Library(books);
        library.add(new Book(1500, "StoryMan", "Story", "9883161484105"));
        library.add(1600, "StoryMan", "Story", "9883161484106");

        //Tests
        tryAdd(library, b1, true);
        tryAdd(library, b1, false);
        tryLoan(library, b1);
        tryRemove(library, b1);
        tryLoan(library, b5);
    }
}
