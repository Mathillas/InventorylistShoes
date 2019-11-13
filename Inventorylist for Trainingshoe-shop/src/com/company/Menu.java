package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Menu {

    Inventory inventory;
    Scanner in;

    public Menu( Inventory inventory ) {           //Constructor
        this.inventory = inventory;
        this.in = new Scanner(System.in);
    }

    public void showMainMenu() {

        boolean showMenu = true;
        while (showMenu) {
            System.out.println("Main menu");
            System.out.println("1. Change the number or sale_price for a specific shoe");
            System.out.println("2. Add a new shoe of a new brand");
            System.out.println("3. Show total value of stock");
            System.out.println("4. Save all shoes to file");
            System.out.println("5. Get all shoes from saved file");
            System.out.println("9. End");
            String result = in.nextLine();
            if (result.matches("\\d")) {
                switch (Integer.parseInt(result)) {
                    case 1:
                        showEditStockMenu(); // Change the number or sale price for a specific shoe
                        break;
                    case 2:
                        showAddNewShoe(); //Add a new shoe
                        break;
                    case 3:
                        showValueStockMenu(); // Show total value of stock
                        break;
                    case 4:
                        inventory.saveToFile(); // Unfortunately doesn't this method work
                    case 5:
                        inventory.ShowSavedFile();
                        break;

                    case 9:
                        showMenu = false;
                        return;


                    default:
                        System.out.println("Faulty alternative");
                        break;
                }

            }
        }

    }

    public void showValueStockMenu() {    // Method for getting total value of stock
        int totalValue = 0;
        for (Shoe shoe : this.inventory.getInventory()) {
            shoe.getNumber();    // Get number for all shoes
            shoe.getPurchase_price();  // Get purchase_price for all shoes
            totalValue += shoe.getPurchase_price() * shoe.getNumber(); // calculate the total purchase_price for all shoes.
        }
        System.out.println(" Total value of stock is " + totalValue + " SEK");  // Print the total value of the shoes.

    }

    public void setInventory( Inventory inventory ) {
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "inventory=" + inventory +
                ", in=" + in +
                '}';
    }

    void showAddNewShoe() {    // add a new brand/name/size/color/number/purchase_price,sale_price of shoe
        String brand;
        String model;
        double size;
        String color;
        int number = 0;
        int purchase_price;
        int sale_price;

        while (true) {
            System.out.println("Enter a brand:");
            brand = in.nextLine();
            System.out.println("Enter a model:");
            model = in.nextLine();
            System.out.println("Enter a size");
            size = Double.parseDouble(in.nextLine());
            System.out.println("Enter a color");
            color = in.nextLine();
            System.out.println("Enter a number");
            number = Integer.parseInt(in.nextLine());
            System.out.println("Enter a purchase price");
            purchase_price = Integer.parseInt(in.nextLine());
            System.out.println("Enter sale_price");
            sale_price = Integer.parseInt(in.nextLine());

            inventory.AddShoe(brand, model, size, color, number, purchase_price, sale_price);

//            System.out.println("You have entered shoe " + inventory.GetShoe(brand, model, size, color, number));
            System.out.println("You have entered shoe : " + brand + ". " + model + ". " + size + ". " + color + ". " + number + ". " + purchase_price + ". " + sale_price);
            System.out.println(" You have entered shoe " );
            break;
        }

    }


    void showEditStockMenu() {    //Start of choice of specific shoe brand/model/size/color/number
        String brand;
        String model = null;
        double size = 0;
        String color = null;
        int number = 0;
        int sale_price = 0;
        int newInventoryStock;


        // The user may choose a shoe manufacturer
        while (true) {
            System.out.println("Select shoe brand:");
            Set<String> brandSet = new HashSet<>();
            for (Shoe shoe : this.inventory.getInventory()) {
                brandSet.add(shoe.brand);
            }

            ArrayList<String> brandChoice = new ArrayList<>(brandSet);
            for (int i = 0; i < brandSet.size(); i++) {    //Print a Arraylist of existing brands in inventory
                System.out.println(i + ". " + brandChoice.get(i));  // User asked to choose a brand from the list.
            }
            String result = in.nextLine();  // read the input
            if (result.matches("\\d+")) {      // If choice of brand is a figure
                brand = brandChoice.get(Integer.parseInt(result)); // brand get a value
                System.out.println("You have chosen brand " + brand); // Print what was  chosen by user
                break;
            } else {
                System.out.println("Wrong choice!");    // slut på val af shoe brand
            }
        }

        while (true) {               //Start of choice of shoe model,size and color
            System.out.println("Choose model,size and color for " + brand);
            ArrayList<Shoe> brandList = inventory.getShoesByBrand(brand); // Get the shoe models,sizes and colors in the decided brand
            int i = 0;

            for(Shoe shoe : brandList){
                System.out.println(i + ". " + shoe); // Print all shoe models within brand


                i++;
            }
            String result = in.nextLine();
//
            if (result.matches("\\d+")) {   // If choise is a figure
                model = brandList.get(Integer.parseInt(result)).getModel();
                size = brandList.get(Integer.parseInt(result)).getSize();
                color = brandList.get(Integer.parseInt(result)).getColor();
                System.out.println("You have choosen model: " + model +"," + " size " + size +" and color : " +color);
                break;
            }

            else {
                System.out.println("Wrong choice!");   // End of choice of shoe model
            }


        } // End of choose model, size and color


        while (true) {   // Start changing the number of shoes
            System.out.println("Would you like to change the number of this shoe? Enter [Y]es,[N]o [E]xit");
            String answer = in.nextLine().toLowerCase();
            switch (answer) {
                case "y":        // Start increasing the number of shoes
                    System.out.println("Do you want to increase the number on this shoe? Enter [Y]es or [N]o");
                    answer = in.nextLine().toLowerCase();
                    if (answer.equals("y")) {
                        System.out.println("Choose the alternative for how many shoes you want to add");
                        Set<Integer> numberSet = new HashSet<>();
                        for (Shoe shoe : this.inventory.getInventory()) {
                            numberSet.add(shoe.number);
                        }
                        ArrayList<Integer> numberChoice = new ArrayList<>(numberSet);
                        for (int i = 0; i < numberSet.size(); i++) {
                            System.out.println(i + ". " + numberChoice.get(i));  // Print a list of numbers for user to choose.
                        }
                        String result = in.nextLine();  // Read input from user
                        if (result.matches("\\d+")) {   // If choise of number is a figure
                            number = numberChoice.get(Integer.parseInt(result)); // Convert from type string to type int
                            System.out.println("You want to add " + number + " of shoes"); //Print user choice
                            if (inventory.setNumber(model, size, color, number)) { //if correct shoe increase number of it
                                int purchase_price = 0;
                                System.out.println("You have changed the number of this shoe to " + inventory.GetShoe(brand, model, size, color, number));
                                break;
                            } else {
                                System.out.println("shoes are not in stock.");
                            }

                            break;
                        } else {
                            System.out.println("Wrong choice");
                        }
                        break;
                    } else // End of increasing the number of a specific shoeSystem.out.println("You want to reduce the number of this shoe?");    // Start of reducing the number of a specific shoe
                        System.out.println("Choose the alternative for how many shoes you want to reduce");
                    Set<Integer> numberSet = new HashSet<>();
                    for (Shoe shoe : this.inventory.getInventory()) {
                        numberSet.add(shoe.number);
                    }
                    ArrayList<Integer> numberChoice = new ArrayList<>(numberSet);
                    for (int i = 0; i < numberSet.size(); i++) {
                        System.out.println(i + ". " + numberChoice.get(i));  // Print existing number of shoes
                    }
                    String result = in.nextLine(); //Read user input
                    if (result.matches("\\d+")) {   // If choice of number is a figure
                        number = numberChoice.get(Integer.parseInt(result));
                        System.out.println("You want to remove" + number + " of the shoe");
                        if (inventory.setNumber(model, size, color, -number)) {
                            System.out.println("You have changed the number of this shoe to " + inventory.GetShoe(brand, model, size, color, number));
                        } else {
                            System.out.println("Shoes are not in stock.");
                        }

                        break;
                    } else {
                        System.out.println("Wrong choice");
                    }
                    break;  // End of changing the number of shoes


                case "n":  // Start of changing the price of a specific shoe
                    System.out.println("Do you want to change the price of the shoe? Enter [Y]es or [N]o");
                    answer = in.nextLine().toLowerCase();
                    if (answer.equals("y")) {
                        int purchase_price = 0;
                        System.out.println("The current price of this shoe is: " + inventory.GetShoe(brand, model, size, color, number)); //Get the sale_price of thr shoe
                        System.out.println("Enter a new sale price");
                        result = in.nextLine();  // Read input from user
                        int newSale_price = Integer.parseInt(result);  // Convert input from type string to to type int
                        inventory.setSale_price(model, size, color, newSale_price);  // Change the sale_price
                        System.out.println("The new sale prise for this shoe is now: " + newSale_price); // Print the new sale_price for the shoe
                        break;
                    } // End of changing sale price
                case "e":
                   return;

            } // End of switch
        }     // End of while-loop for changing the number or price of specific shoe

    }  // End of showEditStockMenu

}




