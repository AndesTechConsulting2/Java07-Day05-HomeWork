package org.raiffeisen.ruallai.learning;

public class Main {

    public static void main(String[] args)
    {
        Book[] books = new Book[3];
        Library library = new Library(books);


        // Заполнение библиотеки книгами
        for(int i = 0; i < books.length; i++)
        {
            books[i] = library.addABook();
            books[i].setId(i);
        }


        // Вывод исходной библиотеки
        for(Book b:books)
        {
            System.out.println(b);
        }


        // Удаление книги из библиотеки
        library.removeABook(books);


        // Вывод библиотеки после удаления книг
        for(Book b:books)
        {
            if(b != null)
            {
                System.out.println(b);
            }
        }

        // Выдача книг
        try
        {
            library.giveABook(books);
            library.giveABook(books);
        }
        catch (BookNotFoundException | BookLoanException ex)
        {
            System.out.println(ex + "\n");
        }
        finally
        {
            System.out.println("\n" + "Finally");

            for(Book b:books)
            {
                if(b != null)
                {
                    System.out.println(b);
                }
            }
        }

    }
}
