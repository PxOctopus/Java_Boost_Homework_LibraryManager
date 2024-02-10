package com.cagri.repository;

import com.cagri.entity.Cashier;
import com.cagri.utility.DataBase;

import java.util.ArrayList;

public interface ICashierRepository {
    public void save(Cashier cashier);

    public void delete(int index);

    public ArrayList<Cashier> findAll ();
}
