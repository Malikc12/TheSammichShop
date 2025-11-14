package com.pluralsight.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;

    // constructor
    public UserInterface() {
        scanner = new Scanner(System.in);
    }


    // HOME SCREEN (string switch)

    public int showHomeScreen() {
        System.out.println("=================================================");
        System.out.println("         Welcome to Holy Molly Sandwich Shop ");
        System.out.println("=================================================");
        System.out.println("1) New Order");
        System.out.println("0) Exit");
        System.out.print("Enter choice: ");

        String input = scanner.nextLine();

        switch (input) {
            case "1":
                return 1;
            case "0":
                return 0;
            default:
                System.out.println("Invalid choice.");
                return -1;
        }
    }


    // ORDER MENU

    public int showOrderMenu() {
        System.out.println("\n---- Order Menu ----");
        System.out.println("1) Add Sandwich");
        System.out.println("2) Add Drink");
        System.out.println("3) Add Chips");
        System.out.println("4) Checkout");
        System.out.println("0) Cancel Order");
        System.out.print("Enter choice: ");

        String input = scanner.nextLine();

        switch (input) {
            case "1":
                return 1;
            case "2":
                return 2;
            case "3":
                return 3;
            case "4":
                return 4;
            case "0":
                return 0;
            default:
                System.out.println("Invalid choice.");
                return -1;
        }
    }


    // SANDWICH OPTIONS

    public String promptForBreadType() {
        System.out.println("\nChoose bread type:");
        System.out.println("white, wheat, rye, wrap");
        System.out.print("Enter bread type: ");
        return scanner.nextLine().toLowerCase();
    }

    public String promptForSize() {
        System.out.print("What size? (4, 8, or 12 inches): ");
        return scanner.nextLine();
    }

    public boolean promptForToasted() {
        System.out.print("Would you like it toasted? (yes or no): ");

        String input = scanner.nextLine().toLowerCase();

        switch (input) {
            case "yes":
                return true;
            case "no":
            default:
                return false;
        }
    }


    // MEATS

    public List<String> promptForMeats() {
        List<String> meats = new ArrayList<>();

        System.out.println("\nAdd meats (type 'done' to finish adding meats):");
        System.out.println("Options: steak, ham, salami, roast beef, chicken, bacon");

        while (true) {
            System.out.print("Enter meat: ");
            String input = scanner.nextLine().toLowerCase().trim();

            switch (input) {
                case "done":
                    return meats;

                default:
                    meats.add(input);
                    break;
            }
        }
    }

    public boolean promptForExtraMeat() {
        System.out.print("Extra meat? (yes or no): ");

        String input = scanner.nextLine().toLowerCase();

        switch (input) {
            case "yes":
                return true;
            case "no":
            default:
                return false;
        }
    }


    // CHEESES

    public List<String> promptForCheeses() {
        List<String> cheeses = new ArrayList<>();

        System.out.println("\nAdd cheeses (type 'done' to finish adding cheeses):");
        System.out.println("Options: american, provolone, cheddar, swiss");

        while (true) {
            System.out.print("Enter cheese: ");
            String input = scanner.nextLine().toLowerCase();

            switch (input) {
                case "done":
                    return cheeses;
                default:
                    cheeses.add(input);
                    break;
            }
        }
    }

    public boolean promptForExtraCheese() {
        System.out.print("Extra cheese? (yes or no): ");

        String input = scanner.nextLine().toLowerCase();

        switch (input) {
            case "yes":
                return true;
            case "no":
            default:
                return false;
        }
    }


    // REGULAR TOPPINGS

    public List<String> promptForRegularToppings() {
        List<String> toppings = new ArrayList<>();

        System.out.println("\nAdd regular toppings (type 'done' to finish adding toppings):");
        System.out.println("lettuce, peppers, onions, tomatoes, jalapenos, cucumbers, pickles, guacamole, mushrooms");

        while (true) {
            System.out.print("Enter topping: ");
            String input = scanner.nextLine().toLowerCase();

            switch (input) {
                case "done":
                    return toppings;
                default:
                    toppings.add(input);
                    break;
            }
        }
    }


    // SAUCES

    public List<String> promptForSauces() {
        List<String> sauces = new ArrayList<>();

        System.out.println("\nAdd sauces (type 'done' to finish):");
        System.out.println("mayo, mustard, ketchup, ranch, thousand islands, vinaigrette");

        while (true) {
            System.out.print("Enter sauce: ");
            String input = scanner.nextLine().toLowerCase();

            switch (input) {
                case "done":
                    return sauces;
                default:
                    sauces.add(input);
                    break;
            }
        }
    }


    // DRINK

    public String promptForDrinkSize() {
        System.out.println("\nDrink sizes: small, medium, large");
        System.out.print("Enter drink size: ");
        return scanner.nextLine().toLowerCase();
    }

    public String promptForDrinkFlavor() {
        System.out.print("Enter drink flavor: ");
        return scanner.nextLine().toLowerCase();
    }


    // CHIPS

    public String promptForChipsType() {
        System.out.print("\nChips available: Cheetos, Doritos, Funions, Sun Chips, Lay's  ");
        System.out.print("\nEnter chips type: ");
        return scanner.nextLine().toLowerCase();
    }
}


