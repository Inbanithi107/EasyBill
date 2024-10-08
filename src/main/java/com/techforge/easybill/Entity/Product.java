package com.techforge.easybill.Entity;

public class Product {

    private int id;

    private String name;

    private String Barcode;

    private int price;

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

    public String getBarcode() {
        return Barcode;
    }

    public void setBarcode(String barcode) {
        Barcode = barcode;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Product(int id, String name, String barcode, int price) {
        this.id = id;
        this.name = name;
        Barcode = barcode;
        this.price = price;
    }

    public Product(){

    }
}
