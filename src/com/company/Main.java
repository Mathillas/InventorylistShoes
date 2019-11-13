package com.company;

public class Main {
    // Detta är klassen main
    public static void main(String[] args) {

        Inventory inventory = new Inventory();
        Menu menu = new Menu(inventory);
        menu.showMainMenu();
    }

}
