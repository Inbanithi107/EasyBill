package com.Techforge.EasyBill.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int customerid;

    private String admin;

    @OneToMany
    private List<Product> products;

    private int rate;

    private String formateddatetime;

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

    public String getFormateddatetime() {
        return formateddatetime;
    }

    public void setFormateddatetime(String formateddatetime) {
        this.formateddatetime = formateddatetime;
    }
}
