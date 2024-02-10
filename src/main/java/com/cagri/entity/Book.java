package com.cagri.entity;

import com.cagri.utility.DataBase;

import java.util.ArrayList;
import java.util.function.BooleanSupplier;

public class Book {
    private final int bookId;
    private final String name;
    private final String author;
    private final String genre;
    public static boolean isIssued;


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


    public String getName() {
        return name;
    }


    public String getAuthor() {
        return author;
    }


    public String getGenre() {
        return genre;
    }


    public boolean isIssued() {
        return isIssued;
    }

    public void setIssued(boolean issued) {
        isIssued = issued;
    }

}


