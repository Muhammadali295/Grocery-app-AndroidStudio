package com.example.category.model;

public class DrinkModel {
    private String key,name,company_name,image,price;
    private int quantity;
    private float totalprice;
    public DrinkModel() {
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyname() {return company_name;}

    public void setCompanyname(String companyname) {this.company_name = companyname;}

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
