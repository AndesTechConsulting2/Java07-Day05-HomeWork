package org.raiffeisen.ruanad4.learning;


public class Book {
        private int id;
        private String author;
        private String title;
        private int year;
        private String ISBN;
        private boolean onLoan;

        public Book(int id, String author, String title, int year, String ISBN, boolean onLoan) {
            this.id = id;
            this.author = author;
            this.title = title;
            this.year = year;
            this.ISBN = ISBN;
            this.onLoan = onLoan;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public String getISBN() {
            return ISBN;
        }

        public void setISBN(String ISBN) {
            this.ISBN = ISBN;
        }

        public boolean isOnLoan() {
            return onLoan;
        }

        public void setOnLoan(boolean onLoan) {
            this.onLoan = onLoan;
        }

        public Book() {
        }

 @Override
        public String toString() {
            return "Book{" +
                    "id=" + id +
                    ", author='" + author + '\'' +
                    ", title='" + title + '\'' +
                    ", year=" + year +
                    ", ISBN='" + ISBN + '\'' +
                    ", onLoan=" + onLoan +
                    '}';
        }
    }