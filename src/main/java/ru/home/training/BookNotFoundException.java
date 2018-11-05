package ru.home.training;

public class BookNotFoundException extends Exception {
    public BookNotFoundException(String warning) {
        super(warning);
    }
}