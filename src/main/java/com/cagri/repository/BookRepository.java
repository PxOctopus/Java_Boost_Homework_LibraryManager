package com.cagri.repository;

import com.cagri.entity.Book;
import com.cagri.entity.Cashier;
import com.cagri.utility.DataBase;

import java.util.ArrayList;

public class BookRepository implements IBookRepository{
    public void save(Book book) {
        DataBase.bookList.add(book);
    }

    public void delete(int index) {
        DataBase.bookList.remove(index);

    }

    public ArrayList<Book> findAll() {
        return DataBase.bookList;
    }
}