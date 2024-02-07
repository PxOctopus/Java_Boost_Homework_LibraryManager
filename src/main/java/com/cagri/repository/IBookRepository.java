package com.cagri.repository;

import com.cagri.entity.Book;

import java.util.ArrayList;

public interface IBookRepository {
    void save(Book book);
    void delete(int index);
    ArrayList<Book> findAll();
}
