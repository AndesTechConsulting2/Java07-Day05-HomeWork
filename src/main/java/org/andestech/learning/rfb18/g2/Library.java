package org.andestech.learning.rfb18.g2;



public class Library {

    String [] book = new String[10];

    public static String loan ()  {
        try {


        }
        catch (BookLoanException ex) {

            System.out.println("Книга на руках");
        }

        try {

        }
        catch (BookNotFoundException ex) {
            System.out.println("Книга отсутствует");
        }
         return " ";


    }
    public static String add () {
        return "";
    }

    public static String remove () {
        return "";
    }


}
