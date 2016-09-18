/*
 * Iteration.java
 *
 * This is a simple program that will be used to demonstrate
 * iteration statements in Java
 *
 * @author Brad Dennis
 * Created:  09/18/2016
 * Modified: --
 */
import java.util.Scanner;


public class Iteration {
    public static void main(String[] args) {
        int x = 100;
        System.out.println("The value of 'x' is " + x);
        while(x < 200)
            x++;

        System.out.println("The value of 'x' is " + x);
        System.out.println("\n\n");

        Scanner standardIn = new Scanner(System.in);
        boolean isQuitting = false;
        while (!isQuitting) {
            System.out.println("Enter any string ('q' or 'Q' to quit): ");
            String input = standardIn.nextLine();
            if (input.equalsIgnoreCase("q")) {
                isQuitting = true;
            }
        }



    }
}
