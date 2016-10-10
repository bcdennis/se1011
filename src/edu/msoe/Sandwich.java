package edu.msoe;

/**
 * This class represents a Sky Cafe
 * sandwich.
 */
public class Sandwich {
    public static final int WHITE_BREAD = 0;
    public static final int WHEAT_BREAD = 1;
    public static final int HAM = 0;
    public static final int TURKEY = 1;
    public static final int NONE= 0;
    public static final int MAYO = 1;
    public static final int AMERICAN_CHEESE = 1;
    public static final int SWISS_CHEESE = 2;

    private int cost = 0;
    private int bread;
    private int meat;
    private int condiments;
    private int cheese;

    /**
     * Sets the type of bread on the sandwich.
     * @param breadType  The bread type.
     */
    public void setBread(int breadType) {
        bread = breadType;
    }

    /**
     * Sets the type of meat on the sandwich.
     * @param meatType  The meat type.
     */
    public void setMeat(int meatType) {
        meat = meatType;
    }

    /**
     * Sets the condiments for the sandwich.
     * @param condimentType The condiment type.
     */
    public void setCondiments(int condimentType){
        condiments = condimentType;
    }

    /**
     * Sets the cheese on the sandwich.
     * @param cheeseType  The cheese type.
     */
    public void setCheese(int cheeseType) {
        cheese = cheeseType;
    }

    /**
     * Calculates the price of the sandwich based
     * upon the ingredients selected.
     * @return the price of the sandwich as configured.
     */
    public double calculatePrice() {
        double price = 0.0;

        if (bread == WHITE_BREAD) {
            price += 1.50;
        } else {
            price += 1.75;
        }

        if (meat == HAM) {
            price += 1.00;
        } else if (meat == TURKEY) {
            price += 1.25;
        }

        if (condiments == MAYO) {
            price += 0.50;
        }

        if (cheese == AMERICAN_CHEESE) {
            price += 0.50;
        } else if (cheese == SWISS_CHEESE) {
            price += 0.75;
        }

        return price;
    }

    /**
     * Represents the sandwich as a string.
     * @return The sandwich as a string.
     */
    public String toString() {
        String sandwich = "";

        if (meat == HAM) {
            sandwich = "Ham sandwich";
        } else if (meat == TURKEY) {
            sandwich = "Turkey sandwich";
        }

        if (condiments == MAYO) {
            sandwich += " add mayo";
        } else {
            sandwich += " hold the mayo";
        }

        if (cheese == AMERICAN_CHEESE) {
            sandwich += " with American";
        } else if (cheese == SWISS_CHEESE) {
            sandwich += " with Swiss";
        } else {
            sandwich += " no cheese";
        }

        if (bread == WHITE_BREAD) {
            sandwich += " on white.";
        } else {
            sandwich += " on wheat.";
        }

        return sandwich;
    }
}
