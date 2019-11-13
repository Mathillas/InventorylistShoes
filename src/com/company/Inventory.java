package com.company;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Inventory extends ArrayList<Shoe> {
    private ArrayList<Shoe> inventory;
    Scanner in;

    public Inventory( ArrayList<Shoe> inventory ) {
        this.inventory = inventory;
    }


    public Inventory() {
        in = new Scanner(System.in);
        inventory = new ArrayList<Shoe>();
        readFromFile();

/*      List below was saved to file, then not used anymore.
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

    public void editStock() {    // start of method for editing existing stock regarding number and sale_price of shoe
        String brand;
        String model = null;
        double size = 0;
        String color = null;
        int number = 0;
        int sale_price = 0;

        // The user choose an existing brand
        while (true) {
            System.out.println("Select shoe brand:");
            Set<String> brandSet = new HashSet<>();
            for (Shoe shoe : this.inventory) {
                brandSet.add(shoe.brand);
            }

            ArrayList<String> brandChoice = new ArrayList<>(brandSet);
            for (int i = 0; i < brandSet.size(); i++) {    //Print a Arraylist of existing brands in inventory
                System.out.println(i + ". " + brandChoice.get(i));  // User asked to choose a brand from the list.
            }
            String result = in.nextLine();  // read the input
            if (result.matches("\\d+")) {      // If choice of brand is a figure within existing brands
                brand = brandChoice.get(Integer.parseInt(result)); // brand get a value
                System.out.println("You have chosen brand " + brand); // Printout what was chosen by user
                break;
            } else {
                System.out.println("Wrong choice!");    // End of choice af shoe brand
            }
        }

        while (true) {               //Start of choice of shoe model,size and color of the brand
            System.out.println("Choose model,size and color for " + brand);
            ArrayList<Shoe> brandList = getShoesByBrand(brand); // Get the shoe models,sizes and colors in the decided brand
            int i = 0;

            for (Shoe shoe : brandList) {
                System.out.println(i + ". " + shoe); // Print all shoe model,sizes and colors within brand

                i++;
            }
            String result = in.nextLine();  // read user choice of model,size and color of shoe

            if (result.matches("\\d+")) {   // If choise is a figure
                brand = brandList.get(Integer.parseInt(result)).getBrand();
                model = brandList.get(Integer.parseInt(result)).getModel();
                size = brandList.get(Integer.parseInt(result)).getSize();
                color = brandList.get(Integer.parseInt(result)).getColor();
                System.out.println("You haven chosen " + getShoe(brand, model, size, color).toString());

                break;
            } else {
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
                        for (Shoe shoe : this.inventory) {
                            numberSet.add(shoe.number);
                        }
                        ArrayList<Integer> numberChoice = new ArrayList<>(numberSet);
                        for (int i = 0; i < numberSet.size(); i++) {
                            System.out.println(i + ". " + numberChoice.get(i));  // Print a list of numbers for user to choose.
                        }
                        String result = in.nextLine();  // Read input from user
                        if (result.matches("\\d+")) {   // If choise of number is a figure
                            if(!((result.equals("0")) || (result.equals("1")) || (result.equals("2")) || (result.equals("3")) || (result.equals("4")) || (result.equals("5")) || (result.equals("6")) )){
                                System.out.println("Wrong choice. Choose a number: 1-6");
                                continue;

                            }
                            number = numberChoice.get(Integer.parseInt(result)); // Convert from type string to type int
                            System.out.println("You want to add " + number + " of shoes"); //Print user choice
                            if (setNumber(model, size, color, number)) { //if correct shoe increase number of it
                                int purchase_price = 0;
                                System.out.println("You have changed the number of this shoe to " + GetShoe(brand, model, size, color, number));
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
                    for (Shoe shoe : this.inventory) {
                        numberSet.add(shoe.number);
                    }
                    ArrayList<Integer> numberChoice = new ArrayList<>(numberSet);
                    for (int i = 0; i < numberSet.size(); i++) {
                        System.out.println(i + ". " + numberChoice.get(i));  // Print existing number of shoes
                    }
                    String result = in.nextLine(); //Read user input
                    if (result.matches("\\d+")) {   // If choice of number is a figure
                        number = numberChoice.get(Integer.parseInt(result));
                        System.out.println("You want to remove " + number + " of this shoe");
                        if (getShoe(brand, model, size, color).number >= number)
                            if (setNumber(model, size, color, -number)) {
                                System.out.println("You have changed the number of this shoe to " + GetShoe(brand, model, size, color, number));
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
                        System.out.println("The current price of this shoe is: " + GetShoe(brand, model, size, color, number)); //Get the sale_price of thr shoe
                        System.out.println("Enter a new sale price");
                        result = in.nextLine();  // Read input from user
                        int newSale_price = Integer.parseInt(result);  // Convert input from type string to to type int
                        setSale_price(model, size, color, newSale_price);  // Change the sale_price
                        System.out.println("The new sale prise for this shoe is now: " + newSale_price); // Print the new sale_price for the shoe
                        break;
                    } // End of changing sale price
                case "e":
                    return;

            } // End of switch
        }     // End of while-loop for changing the number or price of specific shoe

    }  // End of showEditStockMenu

    public void addShoe() {  // Method for adding a new shoe of type Aerobic_shoe or Climbing_shoe
        String brand;
        String model;
        double size;
        String color;
        int number;
        int purchase_price;
        int sale_price;

        while (true) {
            System.out.println("Enter a brand:");
            brand = in.nextLine();
            System.out.println("Enter a model:");
            model = in.nextLine();
            System.out.println("Enter a size");
            while (true) {
                try {
                    size = Double.parseDouble(in.nextLine());
                    break;
                } catch (NumberFormatException ex) {
                    System.out.println("Your input is incorrect. Enter a size");
                }
            }
            System.out.println("Enter a color");
            color = in.nextLine();
            System.out.println("Enter number");
            while(true){
                try {
                    number = Integer.parseInt(in.nextLine());
                    break;        // if value OK then break
                }
                catch(NumberFormatException ex){
                    System.out.println("Your input is incorrect. Enter a number");
                }
            }

            System.out.println("Enter a purchase price");
            while (true){
                try {
                    purchase_price = Integer.parseInt(in.nextLine());
                    break;        // if value OK then break
                }
                catch(NumberFormatException ex){
                    System.out.println("Your input is incorrect. Enter a purchase price");
                }
            }

            System.out.println("Enter sale_price");
            while(true){
                try {
                    sale_price = Integer.parseInt(in.nextLine());
                    break;
                }
                catch(NumberFormatException ex){
                    System.out.println("Your input is incorrect. Enter a sale price");
                }
            }

            System.out.println("Enter type of shoe: [A]erobic/[C]limbing or [E]xit");
            String type = in.nextLine().toLowerCase();
            switch (type) {
                case "a":
                    // Create a shoe of class Aerobic_shoe
                    Aerobic_shoe a1 = new Aerobic_shoe(brand, model, size, color, number, purchase_price, sale_price);
                    inventory.add(a1);
                    System.out.println("You have added shoe: " + a1.toString());
                    break;
                case "c":
                    //Create a shoe of class Climbing_shoe
                    ClimbingShoe c1 = new ClimbingShoe(brand, model, size, color, number, purchase_price, sale_price);
                    inventory.add(c1);
                    System.out.println("you have added shoe " + c1.toString());
                    break;

                case "e":
                    continue;

                default:
                    break;

            }

            System.out.println("Do you want to continue adding shoe? [Y]es/[N]o");
            String answer = in.nextLine().toLowerCase();
            switch (answer) {
                case "y":
                    continue;

                case "n":
                    return;  // End While(true)

                default:
                    break;
            }

        }

    } // End of method addShoe of new class

    public void removeShoe() {
        String type = null;
        String brand = null;
        String model = null;
        double size = 0;
        String color = null;


        while (true) {
            System.out.println("Add shoe type Aerobic_shoe or Climbing_shoe:");

            Set<String> brandSet = new HashSet<>();
            for (Shoe shoe : this.inventory) {
                brandSet.add(shoe.brand);
            }

            ArrayList<String> brandChoice = new ArrayList<>(brandSet);
            for (int i = 0; i < brandSet.size(); i++) {    //Print a Arraylist of existing brands in inventory
                System.out.println(i + ". " + brandChoice.get(i));  // User asked to choose a brand from the list.
            }
            String result = in.nextLine();  // read the input
            if (result.matches("\\d+")) {      // If choice of brand is a figure within existing brands
                brand = brandChoice.get(Integer.parseInt(result)); // brand get a value
                System.out.println("You have chosen brand " + brand); // Printout what was chosen by user
                break;
            } else {
                System.out.println("Wrong choice!");    // End of choice af shoe brand
            }


        }
        boolean done = false;
        while (!done) {               //Start of choice of shoe model,size and color of the brand
            System.out.println("Choose model,size and color for " + brand);
            ArrayList<Shoe> brandList = getShoesByBrand(brand); // Get the shoe models,sizes and colors in the decided brand
            int i = 0;

            for (Shoe shoe : brandList) {
                System.out.println(i + ". " + shoe); // Print all shoe model,sizes and colors within brand

                i++;
            }
            String result = in.nextLine();  // read user choice of model,size and color of shoe

            if (result.matches("\\d+")) {   // If choise is a figure
                brand = brandList.get(Integer.parseInt(result)).getBrand();
                model = brandList.get(Integer.parseInt(result)).getModel();
                size = brandList.get(Integer.parseInt(result)).getSize();
                color = brandList.get(Integer.parseInt(result)).getColor();
                System.out.println("You haven chosen to remove " + getShoe(brand, model, size, color).toString());
                System.out.println("Do you want to continue with removal? [Y]es]/[N]o");
                String answer = in.nextLine().toLowerCase();
                switch (answer) {
                    case "y":
                        Path filePath = Paths.get("./shoes/" + brand + model + size + color + ".obj");
                        try {
                            Files.delete(filePath);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        System.out.println("You have now removed " + getShoe(brand, model, size, color).toString());
                        done = true;
                        break;

                    case "n":
                        return;

                    default:
                        break;

                }

            } else {
                System.out.println("Wrong choice!");   // End of choice of shoe model
            }


        } // End of choose model, size and color
    }

    public void valueStock() {    // Method for getting total value of stock
        int totalValue = 0;
        for (Shoe shoe : this.inventory) {
            shoe.getNumber();    // Get number for all shoes
            shoe.getPurchase_price();  // Get purchase_price for all shoes
            totalValue += shoe.getPurchase_price() * shoe.getNumber(); // calculate the total purchase_price for all shoes.
        }
        System.out.println(" Total value of stock is " + totalValue + " SEK");  // Print the total value of the shoes.

    } // End of method valueStock()


    public ArrayList<Shoe> getInventory() {
        return inventory;
    }


    public Shoe GetShoe( String brand, String model, double size, String color, int number ) {
        for (Shoe shoe : inventory) {
            if (shoe.model.equals(model) && shoe.size == size && shoe.color.equals(color)) {

                return shoe;
            }
        }
        return null;
    }


    public ArrayList<Shoe> getShoesByBrand( String brand ) {
        ArrayList<Shoe> brandShoes = new ArrayList<Shoe>();
        for (Shoe shoe : inventory) {
            if (shoe.brand.equals(brand)) {
                brandShoes.add(shoe);
            }
        }
        return brandShoes;
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

    public boolean getNumber( String brand, String model, double size, String color, int number ) {
        for (Shoe shoe : inventory) {
            if (shoe.brand.equals(brand) && shoe.model == model && shoe.size == size && shoe.color.equals(color)) {
                shoe.number = number;
                return true;
            }

        }
        return false;


    }

    public boolean setSale_price( String model, double size, String color, int newSale_price ) {
        for (Shoe shoe : inventory) {
            if (shoe.model.equals(model) && shoe.size == size && shoe.color.equals(color)) {
                shoe.sale_price = newSale_price;
                return true;
            }
        }
        return false;
    }


    public Shoe getShoe( String brand, String model, double size, String color ) {
        for (Shoe shoe : inventory) {
            if (shoe.model.equals(model) && shoe.size == size && shoe.color.equals(color)) {
                return shoe;
            }
        }
        return null;
    }

    public void saveToFile() {  // Method for Saving shoe to file

        for (Shoe shoe : inventory) {

            try {
                String color = shoe.getColor();
                color = color.replace("/", "");

                FileOutputStream fout = new FileOutputStream("./shoes/" + shoe.getBrand() + shoe.getModel() + shoe.getSize() + color + ".obj");
                ObjectOutputStream objOut = new ObjectOutputStream(fout);
                objOut.writeObject(shoe);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    private Shoe readShoe( String fileName ) throws IOException {
        FileInputStream fin = null;
        ObjectInputStream objIn = null;
        try {
            fin = new FileInputStream("./shoes/" + fileName);
            objIn = new ObjectInputStream(fin);
            return (Shoe) objIn.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            fin.close(); // close down files
            objIn.close(); // close down files
        }
        return null;
    }

    public void readFromFile() {
        File dir = new File("./shoes");
        File[] files = dir.listFiles(( d, n ) -> n.endsWith(".obj"));
        if (files != null) {
            for (File file : files) {
                try {
                    inventory.add(readShoe(file.getName()));// ass one shoe at a time
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public void showSavedFile() {  // Method for getting all saved shoe files
        for (Shoe shoe : inventory) {
            System.out.println(shoe.getBrand() + " " + shoe.getModel() + " " + shoe.getSize() + " " + shoe.getColor() + " " + shoe.getNumber() + " " + shoe.getPurchase_price() + " " + shoe.getSale_price());

        }

    }

    @Override
    public String toString() {
        return "Inventory{" +
                "inventory=" + inventory +
                '}';
    }
}






