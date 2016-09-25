/*
 * Conditionals.java
 *
 * This is a simple program to demonstrate conditionals.
 *
 * @author Brad Dennis
 * Created:  09/25/2016
 * Modified: --
 */
import java.util.Scanner;


public class Conditionals {
    public static void main(String[] args) {
        doOrPracticeProblem();
        doAndPracticeProblem();
        doNotPracticeProblem();
    }

    private static void doOrPracticeProblem() {
        Scanner standardIn = new Scanner(System.in);
        String sentence;

        System.out.print("Enter in a sentence: ");
        sentence = standardIn.nextLine();

        if (sentence.endsWith(".") || sentence.endsWith("!")) {
            System.out.println(sentence);
        } else {
            System.out.println("Sentences must have periods or exclamation marks.");
        }
    }

    private static void doAndPracticeProblem() {
        Scanner standardIn = new Scanner(System.in);
        String sentence;

        System.out.print("Enter in a sentence: ");
        sentence = standardIn.nextLine();
        char firstLetter = sentence.charAt(0);

        if ((firstLetter >= 65) && (firstLetter <= 90)) {
            System.out.println(sentence);
        } else {
            System.out.println("Sentences must begin with a capital letter.");
        }
    }

    private static void doNotPracticeProblem() {
        Scanner standardIn = new Scanner(System.in);
        String sentence;

        System.out.print("Enter in a sentence: ");
        sentence = standardIn.nextLine();

        if (!sentence.endsWith(".")) {
            System.out.println("Sentences must have periods.");
        } else {
            System.out.println(sentence);
        }
    }

}
