package com.cagri.entity;

public class Cashier extends Person{
    private double salary;

    // P. CONSTRUCTORS //
    public Cashier(int id, String username, String password, String address, String phoneNo) {
        super(id, username, password, address, phoneNo);
    }

    public Cashier(int id, String username, String address, String phoneNo) {
        super(id, username, address, phoneNo);
    }

    public Cashier(int id, String username, String password, String address, String phoneNo, double salary) {
        super(id, username, password, address, phoneNo);
        this.salary = salary;
    }
}
