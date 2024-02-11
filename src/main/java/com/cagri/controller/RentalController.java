package com.cagri.controller;

import com.cagri.entity.Rental;
import com.cagri.service.BookService;
import com.cagri.service.RentalService;
import com.cagri.utility.DataBase;

import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class RentalController implements IRentalController{
    private RentalService rentalService;
    private BookService bookService;
    public RentalController(){
        rentalService = new RentalService();
        bookService = new BookService();
    }
    // SEARCH & RENT A BOOK //
    public void searchNrentBook() {
        System.out.print("Please enter a book name that you want to search: ");
        String book = new Scanner(System.in).nextLine();
        for (int i = 0; i < bookService.findAll().size(); i++) {
            if (bookService.findAll().get(i).getName().equalsIgnoreCase(book) && !DataBase.bookList.get(i).isIssued()) {
                System.out.println(book + " is available!" + " \nWould you like to rent the book? Y/N");
                String answer = new Scanner(System.in).nextLine();
                if (answer.equalsIgnoreCase("Y")) {
                   bookService.findAll().get(i).setIssued(true);
                    System.out.println(book + " was successfully rented!");
                } else if (answer.equalsIgnoreCase("N")) {
                    System.out.println("Exited");
                }
            } else if (bookService.findAll().get(i).isIssued()) {
                System.out.println("Book's already rented!");
            } else {
                System.err.println("Not found!");
            }
        }
    }
}
