package com.cagri.entity;

public class Cashier extends Person{

    // P. CONSTRUCTORS //
    public Cashier(int id, String username, String password, String address, String phoneNo) {
        super(id, username, password, address, phoneNo);
    }

    public Cashier(int id, String username, String address, String phoneNo) {
        super(id, username, address, phoneNo);
    }

}
