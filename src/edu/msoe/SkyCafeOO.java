package edu.msoe;


import java.util.Scanner;

/**
 * This is a simple program to order sandwiches
 * from the Sky Cafe.  With an OO implementation.
 */
public class SkyCafeOO {

    public static final int BUILD_SANDWICH = 1;
    private static final int CALCULATE_PRICE = 2;
    private static final int QUIT = 0;

    private static Sandwich sandwich;

    public static void main(String[] args) {
        Scanner standardIn = new Scanner(System.in);
        int menuChoice;
        sandwich = null;


        boolean quitting = false;

        while (!quitting) {
            displayMainMenu();
            menuChoice = getMainMenuChoice(standardIn);

            switch (menuChoice) {
                case BUILD_SANDWICH:
                    sandwich = buildASandwich(standardIn);
                    break;
                case CALCULATE_PRICE:
                    displayPrice(sandwich);
                    break;
                case QUIT:
                    quitting = true;
                    break;
                default:
                    System.out.println("Option " + menuChoice + " is not valid.");
            }

        }

    }

    private static void displayPrice (Sandwich sandwich) {
        if (sandwich == null) {
            System.out.println("You must build a sandwich first.");
        } else {
            System.out.println("You ordered a:  ");
            System.out.println(sandwich);
            System.out.format("Total: $%.2f\n\n", sandwich.calculatePrice());
        }
    }

    private static Sandwich buildASandwich(Scanner input) {
        Sandwich sandwich = new Sandwich();
        Sandwich anotherSandwich = new Sandwich();
        Sandwich thirdSandwich = new Sandwich();
        int i = 10;

        System.out.print("Enter bread (" + Sandwich.WHITE_BREAD + " for white, " + Sandwich.WHEAT_BREAD + " for wheat): ");
        sandwich.setBread(1);

        anotherSandwich.setBread(0);
        thirdSandwich.setCondiments(1);


        System.out.println(sandwich == anotherSandwich);
        System.out.println(sandwich.equals(anotherSandwich));
        System.out.print("Enter meat (" + Sandwich.HAM + " for ham, " + Sandwich.TURKEY + " for turkey): ");
        sandwich.setMeat(input.nextInt());

        System.out.print("Enter condiments (" + Sandwich.NONE + " for none, " + Sandwich.MAYO + " for mayo): ");
        sandwich.setCondiments(input.nextInt());

        System.out.print("Enter cheese (" + Sandwich.NONE + " for none, "
                + Sandwich.AMERICAN_CHEESE + " for American,  "
                + Sandwich.SWISS_CHEESE + " for Swiss):  ");
        sandwich.setCheese(input.nextInt());

        input.nextLine();

        return sandwich;
    }

    private static int getMainMenuChoice(Scanner input) {
        int choice = 0;
        System.out.print("Enter your choice: ");
        choice = input.nextInt();
        input.nextLine();
        return choice;
    }


    private static void displayMainMenu() {
        System.out.println("****[ Sky Cafe Menu ] ****");
        System.out.println("1 - Build Sandwich");
        System.out.println("2 - Calculate Price");
        System.out.println("0 - Exit");
    }
}
