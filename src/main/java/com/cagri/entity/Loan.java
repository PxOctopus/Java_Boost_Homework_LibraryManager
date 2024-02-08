package com.cagri.entity;

import com.cagri.utility.DataBase;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Loan extends DataBase{
    private LocalDate issueDate;
    private LocalDate returnDate;
    private final double feePerDay = 0.75;
    private Book book;
    private Customer customer;
    private Cashier cashier;


    // P. CONSTRUCTORS //
    public Loan(LocalDate issueDate, LocalDate returnDate, Book book, Customer customer, Cashier cashier) {
        this.issueDate = issueDate;
        this.returnDate = returnDate;
        this.book = book;
        this.customer = customer;
        this.cashier = cashier;
    }
    public Loan(Book book, Customer customer, Cashier cashier) {
        this.book = book;
        this.customer = customer;
        this.cashier = cashier;
    }

    // METHOD TO LOAN BOOK //
    public void loanBook(int bookIndex) {
        Book book = booklist.get(bookIndex);
        book.setIssued(true);
    }
    // SEARCH A BOOK //
    public void searchBook (){

    }

    // SEARCH A CUSTOMER //
    public void findCustomer(ArrayList<Customer> customer){
//        System.out.print("Please, enter a customer name that you want to find: ");
//        String customer = new Scanner(System.in).nextLine();
        if(customerList.contains(customer)){
            System.out.println("Customer name is: " + customer);
        }else{
            System.out.println("Customer not found!");;
        }
    }

    // PRINT BORROWED BOOK LIST //



    // FIND CUSTOMER BY BOOKID //
    public String findCustomerByBookId() {
        System.out.print("Please, enter a book ID you want to find the borrower: ");
        int bookID = new Scanner(System.in).nextInt();

        for (int i = 0; i < booklist.size(); i++) {
            if (booklist.get(i).getBookId() == bookID)
                return "Borrowed by: " + customer.getUsername();
        }
        return null;
    }
    // CALCULATING FEE //
    public String calculateFee() {
        System.out.println("Calculating Fee...");
        return "Fee: " + (ChronoUnit.DAYS.between(issueDate, returnDate) * feePerDay);
    }

    // FIND PREVIOUS BORROWERS //

    // FIND CUSTOMERS' NAMES STARTS WITH "AHM" //

    // FIND CUSTOMERS' BORROWED BOOKLIST //


}
