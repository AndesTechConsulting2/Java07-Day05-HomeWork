package ru.raiffeisen;

public class Library {

    private Book[] books = new Book[10];

    public void add(Book book) {
        for (int i = 0; i < books.length; i++)
            if (books[i] == null) {
                books[i] = book;
                System.out.println("Книга добавлена: " + book);
                return;

            }
        System.out.println("Нет места в библиотеке");
    }

    public void remove(int id) {
        for (int i = 0; i < books.length; i++)
            if ((books[i] != null) && (id == books[i].getId())) {
                books[i] = null;
                System.out.println("Книга удалена. ID = " + id);
                return;

            }
        System.out.println("Книги в бибилиотеке уже не было");
    }

    public void loan(int id) throws BookLoanException, BookNotFoundException {
        for (int i = 0; i < books.length; i++)

            if ((books[i] != null) && (id == books[i].getId())) {

                if (books[i].isOnLoan() != true) {
                    System.out.println("Выдаем вам книгу " + books[i]);
                    books[i].setOnLoan(true);
                    return;
                } else throw new BookLoanException("Книга уже на руках");


            }
        throw new BookNotFoundException("Книга отсутствует в библиотеке");


    }


}
