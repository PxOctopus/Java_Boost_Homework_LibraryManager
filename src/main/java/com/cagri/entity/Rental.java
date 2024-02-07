package com.cagri.entity;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Rental {

    private LocalDate issueDate;
    private LocalDate returnDate;
    private double finePerDay;
    private Book book;
    private Customer customer;
    private Cashier cashier;

    // P. CONSTRUCTOR //
    public Rental(LocalDate issueDate, LocalDate returnDate, double finePerDay, Book book, Customer customer, Cashier cashier) {
        this.issueDate = issueDate;
        this.returnDate = returnDate;
        this.finePerDay = finePerDay;
        this.book = book;
        this.customer = customer;
        this.cashier = cashier;
    }

    // METHOD TO CALCULATE TOTAL FINE //

    public double calculateFine() {
        return ChronoUnit.DAYS.between(issueDate, returnDate) * finePerDay;
    }
    public void loanBook(){

    }

    // GETTER & SETTER //

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

    public double getFinePerDay() {
        return finePerDay;
    }

    public void setFinePerDay(double finePerDay) {
        this.finePerDay = finePerDay;
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

    // INFO //
    @Override
    public String toString() {
        return "Rental{" +
                "issueDate=" + issueDate +
                ", returnDate=" + returnDate +
                ", finePerDay=" + finePerDay +
                ", book=" + book +
                ", customer=" + customer +
                ", cashier=" + cashier +
                '}';
    }
}
