package com.cagri.service;

import com.cagri.entity.Cashier;
import com.cagri.entity.Customer;
import com.cagri.repository.CashierRepository;
import com.cagri.repository.CustomerRepository;
import com.cagri.repository.ICashierRepository;
import com.cagri.repository.ICustomerRepository;

import java.util.ArrayList;

public class CustomerService {
    private ICustomerRepository customerRepository;
    public CustomerService(){
        customerRepository= new CustomerRepository();
    }
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    public void delete(int index) {
        customerRepository.delete(index);

    }

    public ArrayList<Customer> findAll() {
        return customerRepository.findAll();
    }
}
