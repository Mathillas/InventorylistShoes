package com.company;

import java.io.Serializable;

public class ClimbingShoe extends Shoe implements Serializable { // Class ClimbingShoe inherited from class Shoe
    private static final long serialVersionUID = 3L;

    //Constructor for ClimbingShoe
    public ClimbingShoe( String brand, String name, double size, String color, int number, int cost, int selling_price ) {
        super(brand, name, size, color, number, cost, selling_price);
    }

    @Override
    public String toString() {
        return "ClimbingShoe{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size=" + size +
                ", color='" + color + '\'' +
                ", number=" + number +
                ", purchase_price=" + purchase_price +
                ", sale_price=" + sale_price +
                '}';
    }
}
