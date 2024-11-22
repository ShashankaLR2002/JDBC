package com.xworkz.dto;

public class FormDB {
    private int id;
    private String name;
    private int age;
    private String email;
    private long contact;  
    private String password;
    private String address;

    public FormDB(int id, String name, int age, String email, long contact, String password, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.contact = contact;
        this.password = password;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
