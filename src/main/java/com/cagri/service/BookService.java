package com.cagri.service;

import com.cagri.entity.Book;
import com.cagri.repository.BookRepository;
import com.cagri.repository.IBookRepository;
import com.cagri.utility.DataBase;

import java.util.ArrayList;

public class BookService{
    private IBookRepository bookRepository;

    public BookService(){
        bookRepository = new BookRepository();
    }
    public void save(Book book) {
       bookRepository.save(book);
    }

    public void delete(int index) {
       bookRepository.delete(index);

    }

    public ArrayList<Book> findAll() {
        return bookRepository.findAll();
    }
}
