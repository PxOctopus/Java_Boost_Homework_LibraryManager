package com.cagri;

import com.cagri.entity.*;

import java.time.LocalDate;

import static com.cagri.utility.DataBase.*;

public class Runner {
    public static void main(String[] args) {

        Book book1 = new Book(1, "Das Kapital", "Karl Marx", "Treatise", true);
        Customer customer1 = new Customer(1,"Cagri Gumuskaptan","Samsun","5354942288");
        Cashier cashier1 = new Cashier(1,"Hasan Inceler","Istanbul", "05550001122");
        booklist.add(book1);
        customerList.add(customer1);
//        System.out.println(customer1.getUsername());
        cashierList.add(cashier1);
        Loan loan1 = new Loan(book1,customer1,cashier1);
        LocalDate issueDate = LocalDate.parse("2024-01-24");
        LocalDate returnDate   = LocalDate.parse("2024-01-30");
        Loan loan2 = new Loan(issueDate,returnDate,book1,customer1,cashier1);
        loanList.add(loan1);
        System.out.println(loan1.findCustomerByBookId());
        System.out.println(loan2.calculateFee());





    }
}
