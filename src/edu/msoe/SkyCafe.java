package edu.msoe;


import java.util.Scanner;
/**
 * This is a simple program to order sandwiches
 * from the Sky Cafe.
 */
public class SkyCafe {

    private static final int BUILD_SANDWICH = 1;
    private static final int CALCULATE_PRICE = 2;
    private static final int QUIT = 0;

    public static void main(String[] args){
        Scanner standardIn = new Scanner(System.in);
        int menuChoice;
        boolean quitting = false;

        while (!quitting) {
            displayMainMenu();
            menuChoice = getMainMenuChoice(standardIn);

            switch (menuChoice) {
                case BUILD_SANDWICH:
                    //TODO Your code goes here.
                    break;
                case CALCULATE_PRICE:
                    //TODO Your code goes here.
                    break;
                case QUIT:
                    quitting = true;
                    break;
                default:
                    System.out.println("Option " + menuChoice + " is not valid.");
            }

        }

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
