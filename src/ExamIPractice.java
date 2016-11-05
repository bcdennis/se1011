/*
 * ExamIPractice.java
 *
 * This is a sample solution to the practice problem.
 *
 * @author Brad Dennis
 * Created:  09/20/2016
 * Modified: --
 */
import java.util.Scanner;

public class ExamIPractice {

    public static void main(String[] args) {
        Scanner standardIn = new Scanner(System.in);

        String input;
        String sentence = "";
        int wordCounter = 0;
        boolean quitting = false;

        while (!quitting) {
            System.out.print("Enter one word a time: ");
            input = standardIn.nextLine();
            sentence += " " + input;
            wordCounter++;

            if (input.equals("")) {
                wordCounter--;
                quitting = true;
                System.out.println("Word getNumberOfScores: " + wordCounter);

            } else if (input.contains(".")) {
                System.out.println(sentence);
                sentence = "";
            }

        }
    }
}

