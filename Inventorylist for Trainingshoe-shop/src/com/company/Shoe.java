package com.company;

import java.io.Serializable;
import java.util.ArrayList;

public class Shoe  implements Serializable {  // Implement of interface Serializable to be able to save shoes to a file
    private static final long serialVersionUID = 1L;
    protected String brand;  // Property shoe brand
    protected String model;  // Property shoe model
    protected double size;   // Property size of shoe
    protected String color;  // Property color of shoe
    protected int number;  // Property number of shoes
    protected int purchase_price;   // Property Purchase price
    protected int sale_price;   // Property sale price

    // Above properties are only available for inherited classes since they are protected


    public Shoe() {    // Default Constructor
    }

    // Constructor for all properties
    public Shoe( String brand, String model, double size, String color, int number, int purchase_price, int sale_price ) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.color = color;
        this.number = number;
        this.purchase_price = purchase_price;
        this.sale_price = sale_price;
    }

    public Shoe( String brand, String model, double size, String color, int number, Inventory object ) { // Constructor
    }

    // Getters and setters for properties
    public int getNumber( String nike, String w_free_tr_ultra, double v, String s ) {
        return number;
    }

    public int getSale_price() {
        return sale_price;
    }

    public int getPurchase_price() {
        return purchase_price;
    }

    public int getNumber() {
        return number;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getSize() {
        return size;
    }
}
