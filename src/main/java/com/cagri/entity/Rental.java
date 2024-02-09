package com.cagri.entity;

import com.cagri.utility.DataBase;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class Rental extends DataBase {
    private LocalDate issueDate;
    private LocalDate returnDate;
    private final double feePerDay = 0.75;
    private Book book;
    private Customer customer;
    private Cashier cashier;
    private static ArrayList<Book> rentedBooks = new ArrayList<>();


    // P. CONSTRUCTORS //
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

    // METHOD TO RENT A BOOK //
    public void rentBook(int bookIndex) {
        Book book = booklist.get(bookIndex);
        book.setIssued(true);
    }

    // SEARCH & RENT A BOOK //
    public void searchNrentBook() {
        System.out.print("Please enter a book name that you want to search: ");
        String book = new Scanner(System.in).nextLine();
        for (int i = 0; i < booklist.size(); i++) {
            if (booklist.get(i).getName().equalsIgnoreCase(book) && booklist.get(i).isIssued()) {
                System.out.println(book + " is available!" + " \nWould you like to rent the book? Y/N");
                String answer = new Scanner(System.in).nextLine();
                if (answer.equalsIgnoreCase("Y")){
                    booklist.get(i).setIssued(true);
                    rentedBooks.add(booklist.get(i));
                    System.out.println(book + " was successfully rented!");
                }else if(answer.equalsIgnoreCase("N")){
                    System.out.println("Exited");
                }
            } else {
                System.out.println("Book not found!");
            }
        }
    }

    // SEARCH A CUSTOMER //
    public void searchCustomer() {
        System.out.print("Please enter a customer name that you want to search: ");
        String customer = new Scanner(System.in).nextLine();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getUsername().equalsIgnoreCase(customer)) {
                System.out.println(customer + " is matched our records!");
            } else {
                System.out.println("Customer not found!" + "\nPlease check the rented books on the list!");
                ;
            }
        }
    }

    // PRINT RENTED BOOK LIST //


    // FIND CUSTOMER BY BOOKID //
    public void findCustomerByBookId() {
        System.out.print("Please enter a book ID you want to find the renter: ");
        int bookID = new Scanner(System.in).nextInt();
        for (int i = 0; i < booklist.size(); i++) {
            if (booklist.get(i).getBookId() == bookID)
                System.out.println("Rented by: " + customer.getUsername());
        }
        System.out.println("No matching results were found!");
    }

    // CALCULATING FEE //
    public void calculateFee() {
        System.out.println("Calculating Fee...");
        System.out.println("Fee: " + (ChronoUnit.DAYS.between(issueDate, returnDate) * feePerDay));
    }

    // FIND PREVIOUS BORROWERS //

    // FIND CUSTOMERS' NAMES STARTS WITH "AHM" //

    // FIND CUSTOMERS' BORROWED BOOKLIST //


}
