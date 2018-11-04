package org.andestech.learning.rfb18.g2;

public class BookNotFoundException extends Exception {

    private int id;

    public BookNotFoundException(String m)
    {
        super(m);
    }

    public BookNotFoundException(String m, int id)
    {
        super(m);
        this.id = id;
    }
}
