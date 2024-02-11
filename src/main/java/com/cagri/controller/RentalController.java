package com.cagri.controller;

import com.cagri.service.BookService;
import com.cagri.service.CustomerService;
import com.cagri.service.RentalService;
import com.cagri.utility.DataBase;

import java.util.ArrayList;
import java.util.Scanner;

public class RentalController {
    private RentalService rentalService;
    private BookService bookService;
    private CustomerService customerService;

    public RentalController() {
        rentalService = new RentalService();
        bookService = new BookService();
        customerService = new CustomerService();
    }

    /************************REQUESTED METHODS************************************/

    // SEARCH & RENT A BOOK //
    public void searchNrentBook() {
        System.out.print("Please enter a book name that you want to search: ");
        String book = new Scanner(System.in).nextLine();
        for (int i = 0; i < bookService.findAll().size(); i++) {
            if (bookService.findAll().get(i).getName().equalsIgnoreCase(book) && rentalService.findAll().get(i).getBook().isIssued()) {
                System.out.println(book + " is available!" + " \nWould you like to rent the book? Y/N");
                String answer = new Scanner(System.in).nextLine();
                if (answer.equalsIgnoreCase("Y")) {
                    bookService.findAll().get(i).setIssued(true);
                    System.out.println(book + " was successfully rented!");
                    break;
                } else if (answer.equalsIgnoreCase("N")) {
                    System.out.println("Exited!");
                }
            } else if (bookService.findAll().get(i).isIssued()) {
                System.out.println("Book's already rented!");
                break;
            }
        }
    }

    // PRINT RENTED BOOK LIST //
    public void getRentedBookList() {
        for (int i = 0; i < rentalService.findAll().size(); i++) {
            if (rentalService.findAll().get(i).getBook().isIssued()) {
                System.out.println(rentalService.findAll().get(i).getBook().getName());
            }
        }
    }

    // SEARCH A CUSTOMER //
    public void searchCustomer() {
        System.out.print("Please enter a customer name that you want to search: ");
        String customer = new Scanner(System.in).nextLine();
        for (int i = 0; i < customerService.findAll().size(); i++) {
            if (customerService.findAll().get(i).getUsername().equalsIgnoreCase(customer))
                System.out.println(customer + " is matched our records!");
        }
    }

    // FIND CUSTOMER BY BOOKID //
    public void findCustomerByBookId() {
        System.out.print("Please enter the book ID whose renter you want to find: ");
        int bookID = new Scanner(System.in).nextInt();
        for (int i = 0; i < rentalService.findAll().size(); i++) {
            if (rentalService.findAll().get(i).getBook().getBookId() == bookID)
                System.out.println(rentalService.findAll().get(i).getCustomer().getUsername());
        }
    }

    // FIND PREVIOUS BORROWERS //
    public void findBorrowersbyBookName() {
        System.out.print("Please enter the name of the book you want to find previous renters: ");
        String bookName = new Scanner(System.in).nextLine();
        for (int i = 0; i < rentalService.findAll().size(); i++) {
            if (rentalService.findAll().get(i).getBook().getName().equalsIgnoreCase(bookName))
                System.out.println(rentalService.findAll().get(i).getCustomer().getUsername());
        }
    }

    // FIND CUSTOMERS' NAMES STARTS WITH "AHM" //

    public void findCustomersStartsWithAHM() {
        for (int i = 0; i < customerService.findAll().size(); i++) {
            if (customerService.findAll().get(i).getUsername().toLowerCase().startsWith("ahm"))
                System.out.println(customerService.findAll().get(i).getUsername());
        }
    }


    // FIND BORROWED BOOKLIST by CUSTOMER'S ID//
    public void findBorrowedBookListByCustomerId() {
        System.out.print("Please enter the customer ID to find the list of books the customer rented: ");
        int customerID = new Scanner(System.in).nextInt();
        for (int i = 0; i < rentalService.findAll().size(); i++) {
            if (rentalService.findAll().get(i).getCustomer().getId() == customerID)
                System.out.println(rentalService.findAll().get(i).getBook().getName());
        }
    }


}
