package com.cagri.service;

import com.cagri.entity.Book;
import com.cagri.entity.Cashier;
import com.cagri.repository.BookRepository;
import com.cagri.repository.CashierRepository;
import com.cagri.repository.IBookRepository;
import com.cagri.repository.ICashierRepository;

import java.util.ArrayList;

public class CashierService implements ICashierService{
    private ICashierRepository cashierRepository;

    public CashierService(){
        cashierRepository = new CashierRepository();
    }
    public void save(Cashier cashier) {
        cashierRepository.save(cashier);
    }

    public void delete(int index) {
        cashierRepository.delete(index);

    }

    public ArrayList<Cashier> findAll() {
        return cashierRepository.findAll();
    }
}
