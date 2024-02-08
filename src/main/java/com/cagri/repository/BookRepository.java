package com.cagri.repository;

import com.cagri.entity.Book;
import com.cagri.entity.Cashier;
import com.cagri.utility.DataBase;

import java.util.ArrayList;

public class BookRepository {
    public void save(Book book) {
        DataBase.booklist.add(book);
    }

    public void delete(int index) {
        DataBase.booklist.remove(index);

    }

    public ArrayList<Book> findAll() {
        return DataBase.booklist;
    }
}