package com.techforge.easybill.Entity;

import com.google.gson.Gson;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Bill {

    private int id;

    private int customerid;

    private String admin;

    private List<Product> products;

    private int rate;


    private String formateddatetime;


    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy-HH:mm:ss");

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

    public void setDateTimeFromLocalDateTime(LocalDateTime dateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy-HH:mm:ss");
        this.formateddatetime = dateTime.format(formatter);
    }

    public String getDateTimeAsLocalDateTime() {
        return formateddatetime;
    }

    public Bill(int id, int customerid, String admin, List<Product> products, int rate, LocalDateTime datetime) {
        this.id = id;
        this.customerid = customerid;
        this.admin = admin;
        this.products = products;
        this.rate = rate;

    }

    public Bill(){

    }

    public String productTojson(){
        Gson gson = new Gson();
        return gson.toJson(products);
    }


}
