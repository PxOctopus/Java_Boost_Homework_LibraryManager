package com.cagri.entity;

import java.util.ArrayList;

public class Customer extends Person{
    private ArrayList<Rental> borrowedBooks;


// P. CONSTRUCTOR //
    public Customer(int id, String username, String password, String address, String phoneNo) {
        super(id, username, password, address, phoneNo);

    }

    public Customer(int id, String username, String address, String phoneNo) {
        super(id, username, address, phoneNo);
    }
}
