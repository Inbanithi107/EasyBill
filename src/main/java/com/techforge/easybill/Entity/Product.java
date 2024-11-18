package com.techforge.easybill.Entity;

public class Product {

    private int id;

    private String name;

    private String barcode;

    private int mrp;

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
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMrp() {
        return mrp;
    }

    public void setMrp(int mrp) {
        this.mrp = mrp;
    }

    public Product(int id, String name, String barcode, int price, int mrp) {
        this.id = id;
        this.name = name;
        barcode = barcode;
        this.price = price;
        this.mrp = mrp;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", barcode='" + barcode + '\'' +
                ", mrp=" + mrp +
                ", price=" + price +
                '}';
    }

    public Product(){

    }
}
