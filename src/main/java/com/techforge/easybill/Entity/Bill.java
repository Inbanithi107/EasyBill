package com.techforge.easybill.Entity;

import java.time.LocalDateTime;
import java.util.List;

public class Bill {

    private int id;

    private int customerid;

    private String admin;

    private List<Product> products;

    private int rate;

    private LocalDateTime datetime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public LocalDateTime getDatetime() {
        return datetime;
    }

    public void setDatetime(LocalDateTime datetime) {
        this.datetime = datetime;
    }

    public Bill(int id, int customerid, String admin, List<Product> products, int rate, LocalDateTime datetime) {
        this.id = id;
        this.customerid = customerid;
        this.admin = admin;
        this.products = products;
        this.rate = rate;
        this.datetime = datetime;
    }

    public Bill(){

    }
}
