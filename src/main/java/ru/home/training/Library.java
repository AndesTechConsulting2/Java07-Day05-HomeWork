package ru.home.training;

public class Library {


    private static int N = 5; //количество книг в библиотеке

    private Book book[] = new Book[N];


    public void loan(Book search) throws BookLoanException, BookNotFoundException {

        for (int i = 0; i < N; i++) {
            if ((book[i] != null) && (book[i] == search) && (book[i].onloan = true)) {
                book[i].onloan = false;
            } else throw new BookLoanException("Данная книга выдана " + search.toString());
            break;
        }
        for (int i = 0; i < N; i++) {
            if (search != book[i])
                throw new BookNotFoundException("Данная книга не найдена");

            break;
        }
    }

    public void addBook(Book newbook) {
        for (int i = 0; i < N; i++) {
            if (book[i] == null) {
                book[i] = newbook;
                break;
            } else continue;
        }
    }


    public void removeBook(Book deletebook) {
        for (int i = 0; i < N; i++) {
            if (book[i].getId()
                    == deletebook.getId()) {
                book[i] = null;
                break;
            } else continue;
        }
    }


    public void allBooks() {
        for (int i = 0; i < N; i++) {
            System.out.println(book[i]);
        }
    }
}

