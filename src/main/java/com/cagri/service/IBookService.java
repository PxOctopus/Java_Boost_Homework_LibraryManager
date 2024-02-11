package com.cagri.service;

import com.cagri.entity.Book;
import com.cagri.repository.BookRepository;

import java.util.ArrayList;

public interface IBookService {

    public void save(Book book);

    public void delete(int index);

    public ArrayList<Book> findAll();
}
