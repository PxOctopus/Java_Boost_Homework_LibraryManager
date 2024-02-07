package com.cagri.entity;

import java.util.ArrayList;

public abstract class Library {
    private ArrayList<Book> bookList;


    // P. CONSTRUCTOR //
    public Library(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }


    // GETTER & SETTER //
    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }

}
