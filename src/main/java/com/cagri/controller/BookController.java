package com.cagri.controller;

import com.cagri.service.BookService;

public class BookController {
    private BookService bookService;

    public BookController(){
        bookService = new BookService();
    }
}
