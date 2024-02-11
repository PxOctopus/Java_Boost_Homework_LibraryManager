package com.cagri.service;

import com.cagri.entity.Cashier;
import com.cagri.repository.CashierRepository;

import java.util.ArrayList;

public interface ICashierService {

    public void save(Cashier cashier);

    public void delete(int index);

    public ArrayList<Cashier> findAll();
}
