package com.cagri.entity;

import com.cagri.utility.DataBase;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class Rental extends DataBase {

    private LocalDate issueDate;
    private LocalDate returnDate;
    private final double finePerDay = 0.75;
    private Book book;
    private Customer customer;
    private Cashier cashier;
    static int numberOfLoans;


    // P. CONSTRUCTORS //
    public Rental(LocalDate issueDate, LocalDate returnDate, Book book, Customer customer, Cashier cashier) {
        this.issueDate = issueDate;
        this.returnDate = returnDate;
        this.book = book;
        this.customer = customer;
        this.cashier = cashier;

        numberOfLoans++;
    }
public int getNumberOfLoans(){
        return numberOfLoans;
}
    public Rental(Book book, Customer customer, Cashier cashier) {
        this.book = book;
        this.customer = customer;
        this.cashier = cashier;
    }

    // METHOD TO CALCULATE TOTAL FINE //
    public void loanBook(int bookIndex) {
        Book book = booklist.get(bookIndex);
        book.setIssued(true);
    }

    public double calculateFine() {
        return ChronoUnit.DAYS.between(issueDate, returnDate) * finePerDay;
    }

    public String findCustomerByBookId() {
        System.out.println("Please, enter a book ID you want to find the borrower: ");
        int bookID = new Scanner(System.in).nextInt();

        for (int i = 0; i < booklist.size(); i++) {
//            bookID = booklist.get(i).getBookId();
            if (booklist.get(i).getBookId() == bookID)
                return customer.getUsername();
        }
        return null;
    }

//    // FIND WHO BORROWED //
//    public Customer findBorrower(Book book) {
//        for (DataBase b : b) {
//            if (b.getBook() == book) {
//                Customer customer = b.getCustomer();
//                Customer customerInfo = new Customer(
//                        customer.getId(),
//                        customer.getUsername(),
//                        customer.getAddress(),
//                        customer.getPhoneNo());
//                return customerInfo;
//            }
//        }
//        return null;
//    }

    // GETTER & SETTER //


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Rental{");
        sb.append("issueDate=").append(issueDate);
        sb.append(", returnDate=").append(returnDate);
        sb.append(", finePerDay=").append(finePerDay);
        sb.append(", book=").append(book);
        sb.append(", customer=").append(customer);
        sb.append(", cashier=").append(cashier);
        sb.append('}');
        return sb.toString();
    }
}
