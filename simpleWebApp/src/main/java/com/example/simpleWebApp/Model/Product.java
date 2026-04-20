package com.example.simpleWebApp.Model;

public class Product {

    private  int pId;
    private String productName;
//    private  String productCategory;
    private int price;

    public Product(int pId, String productName, int price) {
        this.pId = pId;
        this.productName = productName;
        this.price = price;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
