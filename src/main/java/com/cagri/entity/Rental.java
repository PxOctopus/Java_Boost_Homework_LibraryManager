package com.cagri.entity;

import com.cagri.utility.DataBase;

import java.awt.image.DataBuffer;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class Rental{
    private LocalDate issueDate;
    private LocalDate returnDate;
    private final double feePerDay = 0.75;
    private Book book;
    private Customer customer;
    private Cashier cashier;


    public Rental(LocalDate issueDate, LocalDate returnDate, Book book, Customer customer, Cashier cashier) {
        this.issueDate = issueDate;
        this.returnDate = returnDate;
        this.book = book;
        this.customer = customer;
        this.cashier = cashier;
    }

    public Rental(Book book, Customer customer, Cashier cashier) {
        this.book = book;
        this.customer = customer;
        this.cashier = cashier;
    }

    public Rental() {
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public double getFeePerDay() {
        return feePerDay;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Cashier getCashier() {
        return cashier;
    }

    public void setCashier(Cashier cashier) {
        this.cashier = cashier;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Rental{");
        sb.append("issueDate=").append(issueDate);
        sb.append(", returnDate=").append(returnDate);
        sb.append(", feePerDay=").append(feePerDay);
        sb.append(", book=").append(book);
        sb.append(", customer=").append(customer);
        sb.append(", cashier=").append(cashier);
        sb.append('}');
        return sb.toString();
    }




    // CALCULATING FEE //
    public void calculateFee() {
        System.out.println("Calculating Fee...");
        System.out.println("Fee: " + (ChronoUnit.DAYS.between(issueDate, returnDate) * feePerDay));
    }
}
