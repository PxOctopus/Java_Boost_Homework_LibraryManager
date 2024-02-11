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
        Customer customer2 = new Customer(2, "Turkan Sevgin Gumuskaptan", "Samsun", "5294231122");
        Customer customer3 = new Customer(3, "Zeynep Oyku Buyukbay", "Ankara", "5193216677");
        Customer customer4 = new Customer(4, "Ahmet Pek", "Ankara", "5193316677");
        Customer customer5 = new Customer(5, "Ahmet Serin", "Istanbul", "5153216677");
        Collections.addAll(customerList, customer1, customer2, customer3, customer4, customer5);


        Cashier cashier1 = new Cashier(1, "Hasan Inceler", "Istanbul", "05110001122");
        Cashier cashier2 = new Cashier(2, "Erman Caglar", "Istanbul", "05102203322");
        Collections.addAll(cashierList, cashier1, cashier2);


        Rental rent1 = new Rental(book1, customer1, cashier1);
        Rental rent2 = new Rental(book2, customer2, cashier2);
        Rental rent3 = new Rental(book5, customer3, cashier1);
        Rental rent4 = new Rental(book1, customer2, cashier2);
        Collections.addAll(rentalList, rent1, rent2, rent3, rent4);


        RentalController rentalController = new RentalController();
//        rentalController.findBorrowersbyBookName();
//        rentalController.getRentedBookList();
//        rentalController.searchCustomer();
//        rentalController.findCustomerByBookId();

//        rentalController.searchNrentBook();
//        RentalController rentalController2 = new RentalController();
//        rentalController2.searchNrentBook();

//        rentalController.findCustomersStartsWithAHM();
        rentalController.findBorrowedBookListByCustomerId();


    }
}
