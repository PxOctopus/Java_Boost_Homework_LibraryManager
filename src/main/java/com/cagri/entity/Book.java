package com.cagri.entity;

import java.util.ArrayList;

public class Book extends Library{
    private int bookId;
    private String name;
    private String author;
    private String genre;
    private boolean isIssued;
    static int numberOfLoans;


    // P. CONSTRUCTOR //
    public Book(int bookId, String name, String author, String genre, boolean isIssued) {
        count++;
        if (bookId == -1) {
            bookId = count;
        } else {
            this.bookId = bookId;
        }

        this.bookId = bookId;
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.isIssued = isIssued;
    }


    public Customer findBorrower(Book book) {
        for (Rental b : borrowedBooks) {
            if (b.getBook() == book) {
                Customer customer = b.getCustomer();
                Customer customerInfo = new Customer(
                        customer.getId(),
                        customer.getUsername(),
                        customer.getAddress(),
                        customer.getPhoneNo());
                return customerInfo;
            }
        }
        return null;
    }

    // GETTER & SETTER //

    public int getBookId() {
        return bookId;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public static void setRentalNumber(int rentalNumber) {
        Book.count = rentalNumber;
    }

    // INFO //
    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", isIssued=" + isIssued +
                '}';
    }
}
