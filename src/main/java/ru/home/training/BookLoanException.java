package ru.home.training;

public class BookLoanException extends Exception {

    public BookLoanException(String warning) {
        super(warning);
    }
}