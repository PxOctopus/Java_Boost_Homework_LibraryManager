package com.cagri.utility;

import com.cagri.entity.Book;
import com.cagri.entity.Cashier;
import com.cagri.entity.Customer;
import com.cagri.entity.Rental;

import java.util.ArrayList;

public abstract class DataBase {
public static ArrayList<Book> booklist = new ArrayList<>();
    public static ArrayList<Rental> rentalList = new ArrayList<>();
    public static ArrayList<Customer> customerList = new ArrayList<>();
    public static ArrayList<Cashier> cashierList = new ArrayList<>();

}
