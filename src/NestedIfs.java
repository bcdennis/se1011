import java.util.Scanner;

/*
 * NestedIfs.java
 *
 * This is a simple program to track the flow of nested ifs
 *
 * @author Brad Dennis
 * Created:  09/20/2016
 * Modified: --
 */
public class NestedIfs {

    public static void main(String[] args) {
        Scanner standardIn = new Scanner(System.in);
        String input;
        int age;

        System.out.print("Enter in your age: ");
        input = standardIn.nextLine();
        age = Integer.parseInt(input);

        if (age < 13) {
            if (age > 5) {
                System.out.println("You are in elementary school.");
            } else if (age >= 3) {
                System.out.println("You are in pre-K.");
            } else {
                System.out.println("You are in diapers.");
            }

        } else if (age < 19) {
            System.out.println("You are in high school.");

        } else {
            if (age <= 65) {
                System.out.println("You are probably working.");
            } else {
                System.out.println("Retired! (Maybe?)");
                if (age == 72) {
                    System.out.println("Happy retirement!");
                }
            }
        }

    }
}
