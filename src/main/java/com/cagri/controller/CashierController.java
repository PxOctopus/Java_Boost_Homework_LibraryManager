package com.cagri.controller;

import com.cagri.service.BookService;
import com.cagri.service.CashierService;

public class CashierController {
    private CashierService cashierService;

    public CashierController(){
        cashierService = new CashierService();
    }
}
