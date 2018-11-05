package ru.raiffeisen;

public class BookLoanException extends Exception{
    public BookLoanException() {
    }

    public BookLoanException(String message) {
        super(message);
    }

    public BookLoanException(String message, Throwable cause) {
        super(message, cause);
    }

    public BookLoanException(Throwable cause) {
        super(cause);
    }

    public BookLoanException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
