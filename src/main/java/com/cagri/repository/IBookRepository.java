package com.cagri.repository;

import com.cagri.entity.Book;
import com.cagri.utility.DataBase;

import java.util.ArrayList;

public interface IBookRepository {
    public void save(Book book);

    public void delete(int index);

    public ArrayList<Book> findAll();
}
