package com.cagri.entity;

import com.cagri.utility.DataBase;

import java.awt.image.DataBuffer;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class Rental implements IRental{
    private LocalDate issueDate;
    private LocalDate returnDate;
    private final double feePerDay = 0.75;
    private Book book;
    private Customer customer;
    private Cashier cashier;
//    ArrayList<Book> bookList = new ArrayList<>();


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

    public Rental() {
    }

    // SEARCH & RENT A BOOK //
    public void searchNrentBook() {
        System.out.print("Please enter a book name that you want to search: ");
        String book = new Scanner(System.in).nextLine();
        for (int i = 0; i < DataBase.bookList.size(); i++) {
            if (DataBase.bookList.get(i).getName().equalsIgnoreCase(book) && !DataBase.bookList.get(i).isIssued()) {
                System.out.println(book + " is available!" + " \nWould you like to rent the book? Y/N");
                String answer = new Scanner(System.in).nextLine();
                if (answer.equalsIgnoreCase("Y")) {
                    DataBase.bookList.get(i).setIssued(true);
                    System.out.println(book + " was successfully rented!");
                } else if (answer.equalsIgnoreCase("N")) {
                    System.out.println("Exited");
                }
            } else if (DataBase.bookList.get(i).isIssued()) {
                System.out.println("Book's already rented!");
            } else {
                System.out.println("Not found!");
            }
        }
    }

    // PRINT RENTED BOOK LIST //
    public void getRentedBookList() {
        for (int i=0; i<DataBase.bookList.size();i++){
            if (DataBase.bookList.get(i).isIssued==true){
                System.out.println("Rented books are: " + DataBase.bookList.get(i).getName());
            }else{
                System.err.println("No rented books found!");
            }
        }
    }


    // SEARCH A CUSTOMER //
    public void searchCustomer() {
        System.out.print("Please enter a customer name that you want to search: ");
        String customer = new Scanner(System.in).nextLine();
        for (int i = 0; i < DataBase.customerList.size(); i++) {
            if (DataBase.customerList.get(i).getUsername().equalsIgnoreCase(customer)) {
                System.out.println(customer + " is matched our records!");
            } else {
                System.out.println("Customer not found!" + "\nPlease check the rented books on the list!");
            }
        }
    }


    // FIND CUSTOMER BY BOOKID //
    public void findCustomerByBookId() {
        System.out.print("Please enter a book ID you want to find the renter: ");
        int bookID = new Scanner(System.in).nextInt();
        for (int i = 0; i < DataBase.bookList.size(); i++) {
            if (DataBase.bookList.get(i).getBookId() == bookID)
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
