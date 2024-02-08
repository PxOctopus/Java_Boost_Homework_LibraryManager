package com.cagri.entity;

import com.cagri.utility.DataBase;

public abstract class Person extends DataBase {
    private int id;
    private String username;
    private String password;
    private String address;
    private String phoneNo;

    // P. CONSTRUCTOR //
    public Person(int id, String username, String password, String address, String phoneNo) {

        this.username = username;
        this.password = password;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    public Person(int id, String username, String address, String phoneNo) {
        this.id = id;
        this.username = username;
        this.address = address;
        this.phoneNo = phoneNo;
    }

// GETTER & SETTER //
    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }



    // INFO //
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                '}';
    }
}
