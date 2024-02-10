package com.cagri.repository;

import com.cagri.entity.Cashier;
import com.cagri.entity.Customer;
import com.cagri.utility.DataBase;

import java.util.ArrayList;

public class CashierRepository implements ICashierRepository{
    public void save(Cashier cashier){
        DataBase.cashierList.add(cashier);
    }

    public void delete(int index){
        DataBase.cashierList.remove(index);

    }

    public ArrayList<Cashier> findAll () {
        return DataBase.cashierList;
    }
}
