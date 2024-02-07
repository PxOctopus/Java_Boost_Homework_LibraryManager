package com.cagri;

import com.cagri.entity.Book;
import com.cagri.entity.Customer;
import com.cagri.entity.Person;
import com.cagri.entity.Rental;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {

        Book book = new Book(1, "Das Kapital", "Karl Marx","Treatise", true);
book.findBorrower(book);

    }
}
