package com.cagri;

import com.cagri.entity.*;

import java.time.LocalDate;

import static com.cagri.utility.DataBase.*;

public class Runner {
    public static void main(String[] args) {

        Book book1 = new Book(1, "Das Kapital", "Karl Marx", "Treatise", true);
        Customer customer1 = new Customer(1, "Cagri Gumuskaptan", "Samsun", "5354942288");
        Cashier cashier1 = new Cashier(1, "Hasan Inceler", "Istanbul", "05550001122");
        booklist.add(book1);
        customerList.add(customer1);
//       customer1.getUsername();
        cashierList.add(cashier1);
        Rental rent1 = new Rental(book1, customer1, cashier1);
        LocalDate issueDate = LocalDate.parse("2024-01-24");
        LocalDate returnDate = LocalDate.parse("2024-01-30");
        Rental rent2 = new Rental(issueDate, returnDate, book1, customer1, cashier1);
        rentalList.add(rent1);
//        rent1.findCustomerByBookId();
//        rent2.calculateFee();
//        loan2.searchCustomer();
        rent2.searchNrentBook();
        Rental rent3 = new Rental(book1, customer1, cashier1);
        rent3.searchNrentBook();



    }
}
