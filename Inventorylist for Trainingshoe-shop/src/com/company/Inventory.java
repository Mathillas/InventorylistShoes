package com.company;

import java.io.*;
import java.util.ArrayList;

class Inventory {
    private ArrayList<Shoe> inventory;

    public Inventory( ArrayList<Shoe> inventory ) {
        this.inventory = inventory;
    }


    public Inventory() {
        inventory = new ArrayList<Shoe>();
       readFromFile();

/*
       inventory.add(new Aerobic_shoe("Nike", "W_Free_TR_Ultra", 36.5, "Echo_Pink", 1, 175, 599));
       inventory.add(new Aerobic_shoe("Nike", "W_Free_TR_Ultra", 36.5, "Black/White_Anthra", 5, 175, 599));
      inventory.add(new Aerobic_shoe("Nike", "W_Free_TR_Ultra", 37, "Echo_Pink", 7, 175, 699));
       inventory.add(new Aerobic_shoe("Nike", "W_Free_TR_Ultra", 37, "Black/White_Anthra", 7, 175, 699));
        inventory.add(new Aerobic_shoe("Nike", "W_Free_TR_Ultra", 37.5, "Echo_Pink", 15, 175, 699));
       inventory.add(new Aerobic_shoe("Nike", "W_Free_TR_Ultra", 37.5, "Black/White_Anthra", 15, 175, 699));
      inventory.add(new Aerobic_shoe("Nike", "W_Free_TR_Ultra", 38, "Echo_Pink", 15, 175, 699));
        inventory.add(new Aerobic_shoe("Nike", "W_Free_TR_Ultra", 38, "Black/White_Anthra", 15, 175, 699));
       inventory.add(new Aerobic_shoe("Nike", "W_Free_TR_Ultra", 38.5, "Echo_Pink", 15, 175, 699));
       inventory.add(new Aerobic_shoe("Nike", "W_Free_TR_Ultra", 38.5, "Black/White_Anthra", 15, 175, 699));
      inventory.add(new Aerobic_shoe("Nike", "W_Free_TR_Ultra", 39, "Echo_Pink", 15, 175, 699));
        inventory.add(new Aerobic_shoe("Nike", "W_Free_TR_Ultra", 39, "Black/White_Anthra", 15, 175, 699));
       inventory.add(new Aerobic_shoe("Nike", "W_Free_TR_Ultra", 39.5, "Echo_Pink", 15, 175, 699));
       inventory.add(new Aerobic_shoe("Nike", "W_Free_TR_Ultra", 39.5, "Black/White_Anthra", 15, 175, 699));
        inventory.add(new Aerobic_shoe("Nike", "W_Free_TR_Ultra", 40, "Echo_Pink", 15, 175, 699));
        inventory.add(new Aerobic_shoe("Nike", "W_Free_TR_Ultra", 40, "Black/White_Anthra", 15, 175, 699));
       inventory.add(new Aerobic_shoe("Nike", "W_Free_TR_Ultra", 40.5, "Echo_Pink", 10, 175, 699));
        inventory.add(new Aerobic_shoe("Nike", "W_Free_TR_Ultra", 40.5, "Black/White_Anthra", 10, 175, 699));
       inventory.add(new Aerobic_shoe("Nike", "W_Free_TR_Ultra", 41, "Echo_Pink", 5, 175, 699));
        inventory.add(new Aerobic_shoe("Nike", "W_Free_TR_Ultra", 41, "Black/White_Anthra", 5, 175, 699));
        inventory.add(new Aerobic_shoe("Nike", "W_Free_TR_Ultra", 41.5, "Echo_Pink", 5, 175, 699));
        inventory.add(new Aerobic_shoe("Nike", "W_Free_TR_Ultra", 41.5, "Black/White_Anthra", 5, 175, 699));
        inventory.add(new Aerobic_shoe("Nike", "W_Free_TR_Ultra", 42, "Echo_Pink", 5, 175, 699));
        inventory.add(new Aerobic_shoe("Nike", "W_Free_TR_Ultra", 42, "Black/White_Anthra", 5, 175, 699));
        inventory.add(new ClimbingShoe("La Sportiva", "Miura VS", 37, "Yellow", 5, 1200 , 1599));
        inventory.add(new ClimbingShoe("La Sportiva", "Miura VS", 37.5, "Yellow", 5, 1200 , 1599));
        inventory.add(new ClimbingShoe("La Sportiva", "Miura VS", 38, "Yellow", 5, 1200 , 1599));
        inventory.add(new ClimbingShoe("La Sportiva", "Miura VS", 38.5, "Yellow", 5, 1200 , 1599));
        inventory.add(new ClimbingShoe("La Sportiva", "Miura VS", 39, "Yellow", 5, 1200 , 1599));
        inventory.add(new ClimbingShoe("La Sportiva", "Miura VS", 39.5, "Yellow", 5, 1200 , 1599));
        inventory.add(new ClimbingShoe("La Sportiva", "Miura VS", 40, "Yellow", 5, 1200 , 1599));
        inventory.add(new ClimbingShoe("La Sportiva", "Miura VS", 40.5, "Yellow", 5, 1200 , 1599));
        inventory.add(new ClimbingShoe("La Sportiva", "Miura VS", 41, "Yellow", 5, 1200 , 1599));
        inventory.add(new ClimbingShoe("La Sportiva", "Miura VS", 41.5, "Yellow", 5, 1200 , 1599));
        inventory.add(new ClimbingShoe("La Sportiva", "Miura VS", 42, "Yellow", 5, 1200 , 1599));
        inventory.add(new Aerobic_shoe("Adidas", "FastRunner", 36.5, "NeonGreen", 5, 299, 699));
        inventory.add(new Aerobic_shoe("Adidas", "FastRunner", 37, "NeonGreen", 5, 299, 699));
        inventory.add(new Aerobic_shoe("Adidas", "FastRunner", 37.5, "NeonGreen", 5, 299, 699));
        inventory.add(new Aerobic_shoe("Adidas", "FastRunner", 38, "NeonGreen", 5, 299, 699));
        inventory.add(new Aerobic_shoe("Adidas", "FastRunner", 38.5, "NeonGreen", 5, 299, 699));
        inventory.add(new Aerobic_shoe("Adidas", "FastRunner", 39, "NeonGreen", 5, 299, 699));
        inventory.add(new Aerobic_shoe("Adidas", "FastRunner", 39.5, "NeonGreen", 5, 299, 699));
*/

    }


    public void AddShoe( String brand, String model, double size, String color, int number, int purchase_price, int sale_price){

            inventory.add(new Shoe(brand,model,size,color,number,purchase_price,sale_price));



    }

    public ArrayList<Shoe> getInventory() {
        return inventory;
    }

    public void setInventory( ArrayList<Shoe> inventory ) {
        this.inventory = inventory;
    }

    public Shoe GetShoe( String brand, String model, double size, String color, int number ) {
        for (Shoe shoe : inventory) {
            if (shoe.model.equals(model) && shoe.size == size && shoe.color.equals(color) ) {

                return shoe;
            }
        }
        return null;
    }

   public Shoe GetSale_price( String model, double size, String color) {
        for(Shoe shoe : inventory){
            if (shoe.model.equals(model) && shoe.size == size && shoe.color.equals(color) ) {

                return shoe;
            }
        }
       return null;
        }





    public ArrayList<Shoe> getShoesByBrand( String brand ) {
        ArrayList<Shoe> brandShoes = new ArrayList<Shoe>();
        for(Shoe shoe: inventory){
            if (shoe.brand.equals(brand)){
                brandShoes.add(shoe);
            }
        }
        return brandShoes;
    }


        public boolean SetBrand(String model){

            for(Shoe shoe : inventory){
                if (shoe.model.equals(model)  ) {

                    return true ;
                }
            }
            return false;
        }

    public boolean setNumber( String model, double size, String color, int newNumber ) {
        for (Shoe shoe : inventory) {
            if (shoe.model.equals(model) && shoe.size == size && shoe.color.equals(color)) {
                shoe.number += newNumber;
                return true;
            }
        }
        return false;
    }

    public boolean setSale_price( String name, double size, String color, int newSale_price ){
       for (Shoe shoe : inventory) {
            if (shoe.model.equals(name) && shoe.size == size && shoe.color.equals(color)) {
                shoe.sale_price = newSale_price;
                return true;
            }
        }
        return false;
    }

    public void saveToFile()  {

        for(Shoe shoe : inventory) {

            try {
                String color = shoe.getColor();
                color = color.replace("/", "");

                FileOutputStream fout =fout = new FileOutputStream("./shoes/" + shoe.getBrand() + shoe.getModel() + shoe.getSize() +  color + ".obj");
                ObjectOutputStream objOut = new ObjectOutputStream(fout);
                objOut.writeObject(shoe);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    private Shoe readShoe( String fileName) {
        try {
            FileInputStream fin = new FileInputStream("./shoes/" + fileName);
            ObjectInputStream objIn = new ObjectInputStream(fin);
            return (Shoe) objIn.readObject();
        }
        catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public void readFromFile() {
        File dir = new File("./shoes");
        File[] files = dir.listFiles((d, n) -> n.endsWith(".obj"));
        if(files != null) {
            for(File file : files) {
                inventory.add(readShoe(file.getName()));
            }
        }

    }

    public void ShowSavedFile() {  //Get the saved file from Inventory. Nieder this method work.
        for (Shoe shoe : inventory) {
            System.out.println(shoe.getBrand() + " " + shoe.getModel() + " " + shoe.getSize() + " " + shoe.getColor() + " " + shoe.getNumber() + " " + shoe.getPurchase_price() + " " + shoe.getSale_price());

        }

    }


}






