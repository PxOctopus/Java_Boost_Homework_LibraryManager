package com.cagri.entity;

import com.cagri.utility.DataBase;

import java.util.ArrayList;

public class Book extends Library{
    private int bookId;
    private String name;
    private String author;
    private String genre;
    private boolean isIssued;
    static int numberOfLoans;


    // P. CONSTRUCTORS //
    public Book(int bookId, String name, String author, String genre, boolean isIssued) {
        super();

        this.bookId = bookId;
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.isIssued = isIssued;
    }




    // GETTER & SETTER //

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void setIssued(boolean issued) {
        isIssued = issued;
    }

    public static int getNumberOfLoans() {
        return numberOfLoans;
    }

    public static void setNumberOfLoans(int numberOfLoans) {
        Book.numberOfLoans = numberOfLoans;
    }


//    public static void setRentalNumber(int rentalNumber) {
//        Book.numberOfLoans = rentalNumber;
//    }

    // INFO //
//    @Override
//    public String toString() {
//        return "Book{" +
//                "bookId=" + bookId +
//                ", name='" + name + '\'' +
//                ", author='" + author + '\'' +
//                ", genre='" + genre + '\'' +
//                ", isIssued=" + isIssued +
//                '}';
//    }
}
