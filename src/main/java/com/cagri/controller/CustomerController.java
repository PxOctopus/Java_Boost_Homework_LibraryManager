package com.cagri.controller;

import com.cagri.service.CashierService;
import com.cagri.service.CustomerService;

public class CustomerController {
    private CustomerService customerService;

    public CustomerController() {
        customerService = new CustomerService();
    }
}
