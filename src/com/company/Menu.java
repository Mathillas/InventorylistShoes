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
            System.out.println("2. Add a new shoe of type Aerobic or Climbing");
            System.out.println("3. Show total value of stock");
            System.out.println("4. Save all shoes to file");
            System.out.println("5. Get all shoes from saved file");
            System.out.println("6. Remove a specific shoe");
            System.out.println("9. End");
            String result = in.nextLine();
            if (result.matches("\\d")) {
                switch (Integer.parseInt(result)) {
                    case 1:
                        inventory.editStock(); // Change the number or sale price for a specific shoe
                        break;
                    case 2:
                        inventory.addShoe(); //Add a new shoe
                        break;
                    case 3:
                        inventory.valueStock(); // Show total value of stock
                        break;
                    case 4:
                        inventory.saveToFile(); // Save shoes to file
                    case 5:
                        inventory.showSavedFile(); // Show shoes in saved file
                        break;
                    case 6:
                        inventory.removeShoe();
                        break;
                    case 9:
                        showMenu = false;
                        break;


                    default:
                        System.out.println("Faulty alternative");
                        break;
                }

            }
        }

    }



}


