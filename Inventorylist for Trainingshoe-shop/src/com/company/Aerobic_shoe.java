package com.company;

import java.io.Serializable;
import java.util.ArrayList;

class Aerobic_shoe extends Shoe implements Serializable { // Class Aerobic_shoe inherited from class Shoe
    private static final long serialVersionUID = 2L;
    private ArrayList<Shoe> w_free_tr_ultra;


    public Aerobic_shoe() { //Default Constructor
    }

    //Constructor for all shoe properties
    public Aerobic_shoe( String brand, String model, double size, String color, int number, int purchase_price, int sale_price ) {
        super(brand, model, size, color, number, purchase_price, sale_price);

    }

    @Override
    public String toString() {
        return "Aerobic_shoe{" +
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




