package com.cagri.entity;

import com.cagri.utility.DataBase;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Rental {

    private LocalDate issueDate;
    private LocalDate returnDate;
    private double finePerDay;
    private Book book;
    private Customer customer;
    private Cashier cashier;
    private ArrayList<Book> books;

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
    public void loanBook(int bookIndex){
        Book book = books.get(bookIndex);
        book.setIssued(true);
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

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
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
