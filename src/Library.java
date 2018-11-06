package org.raiffeisen.ruanad4.learning;


import java.util.ArrayList;

public class Library {

        int booksSize = 10000;
        ArrayList<Book> books = new ArrayList<>(booksSize);

        public Book loan(int id) throws BookLoanException, BookNotFoundException {
            Book book = new Book();
            for(Book elem:books){
                if(elem.getId() == id && elem.isOnLoan() == true){
                    throw new BookLoanException("Книга уже выдана");
                }else
                if(elem.getId() == id){
                    book = elem;
                    book.setOnLoan(true);
                    System.out.println("Книга выдана");
                    return book;
                }
            }
            throw new BookNotFoundException("Книга не найдена");
        }
        public void add (Book book){
            books.add(book);
        }
        public void remove(Book book){
            books.remove(book);
        }
    }
