package org.andestech.learning.rfb18.g2;



public class App
{

    private static void tryLoanBook(Library library, Book book){
        System.out.println("----------\nTry to loan the book");
        try {
            library.loanBook(book);
            System.out.println("The book has been loaned");
        }
        catch (BookLoanException | BookNotFoundException e) {
            System.out.println("Message: " +  e.getMessage());
            for(StackTraceElement st : e.getStackTrace()) {
                System.out.println("file: " + st.getFileName() +
                        ", class: " + st.getClassName() +
                        ", method: " + st.getMethodName() +
                        ", line: " + st.getLineNumber() + "."

                );
            }
        }
    }

    private static void tryRemoveBook(Library library, Book book){
        System.out.println("----------\nTry to remove the book");
        try{
            library.removeBook(book);
            System.out.println("The book has been removed from Library");
        }
        catch (BookLoanException | BookNotFoundException e) {
            System.out.println("Message: " +  e.getMessage());
            for(StackTraceElement st : e.getStackTrace()) {
                System.out.println("file: " + st.getFileName() +
                        ", class: " + st.getClassName() +
                        ", method: " + st.getMethodName() +
                        ", line: " + st.getLineNumber() + "."

                );
            }
        }
    }

    private static void tryRemoveBook(Library library, int id){
        System.out.println("----------\nTry to remove the book");
        try{
            library.removeBook(id);
            System.out.println("The book has been removed from Library");
        }
        catch (BookLoanException | BookNotFoundException e) {
            System.out.println("Message: " +  e.getMessage());
            for(StackTraceElement st : e.getStackTrace()) {
                System.out.println("file: " + st.getFileName() +
                        ", class: " + st.getClassName() +
                        ", method: " + st.getMethodName() +
                        ", line: " + st.getLineNumber() + "."

                );
            }
        }
    }

    private static void tryAddBook(Library library, Book book, boolean expResult){
        boolean res = library.addBook(book);
        assert res == expResult;
    }


    public static void main( String[] args )
    {

        //-------------------
        // Books test examples
        Book b1 = new Book("Book1","Author1", 1950,"1-234-56789");
        Book b2 = new Book("Book2","Author2", 2002,"9-876-54321");
        Book b3 = new Book("Book3","Author2", 1853,"9-845-54842");
        Book b4 = new Book("Book4","Author2", 2015,"7-535-45862");
        Book b5 = new Book("Test5","Author3", 1999,"4-953-59634");

        Book books[] = new Book[Library.MAX_BOOKS_NUM];
        books[0]=b1;
        books[1]=b2;


        //-------------------
        //Library and filling examples
        Library library = new Library(books);
        Library library1 = new Library();
        library.addBook(new Book("Title K","Author K", 2000,"6-456-45612"));
        library.addBook("Title N","Author N", 2010,"6-456-45612");


        //-------------------
        //Tests

        tryAddBook(library,b3,true);
        tryAddBook(library,b4,false); // There is no place. Library is full

        tryLoanBook(library,b1); //OK
        tryLoanBook(library,b1); //Exception IsLoan
        tryLoanBook(library1,b1); //Exception NoFound
        tryLoanBook(library,b5); //Exception NoFound*/

        tryRemoveBook(library,b2); //OK
        tryRemoveBook(library,b3.getId()); //OK
        tryRemoveBook(library,b1); //Exception IsLoan
        tryRemoveBook(library1,b1); //Exception NoFound
        tryRemoveBook(library,b2.getId()); //Exception NoFound


        library.printLibrary(); //final library printed
    }
}