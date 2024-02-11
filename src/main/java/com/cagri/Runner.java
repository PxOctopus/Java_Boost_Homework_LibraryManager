package com.cagri;

import com.cagri.controller.RentalController;
import com.cagri.entity.*;
import com.cagri.utility.DataBase;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;

import static com.cagri.utility.DataBase.*;

public class Runner {
    public static void main(String[] args) {

        Book book1 = new Book(1, "Martin Eden", "Jack London", "Novel", false);
        Book book2 = new Book(2, "After The Ball", "Leo Tolstoy", "Short Story", false);
        Book book3 = new Book(3, "Guns, Germs, and Steel", "Jared Diamond", "Popular Science", false);
        Book book4 = new Book(4, "The Plague", "Albert Camus", "Novel", false);
        Book book5 = new Book(5, "The Triple Helix", "Richard Lewontin", "Science", false);
        Collections.addAll(bookList, book1, book2, book3, book4, book5);

        Customer customer1 = new Customer(1, "Cagri Gumuskaptan", "Samsun", "5294212348");
        Customer customer2 = new Customer(2, "Sevgin Gumuskaptan", "Samsun", "5294231122");
        Customer customer3 = new Customer(3, "Zeynep Oyku Buyukbay", "Ankara", "5193216677");
        Collections.addAll(customerList, customer1, customer2, customer3);


        Cashier cashier1 = new Cashier(1, "Hasan Inceler", "Istanbul", "05110001122");
        Cashier cashier2 = new Cashier(2, "Erman Caglar", "Istanbul", "05102203322");
        Collections.addAll(cashierList, cashier1, cashier2);





        Rental rent1 = new Rental(book1, customer1, cashier1);
        LocalDate issueDate = LocalDate.parse("2024-01-24");
        LocalDate returnDate = LocalDate.parse("2024-01-30");
        Rental rent2 = new Rental(issueDate, returnDate, book1, customer1, cashier1);
//
        RentalController rent5 = new RentalController();





    }
}
