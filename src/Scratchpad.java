import java.util.Scanner;

/*
 * ScratchPad.java
 *
 * Stubbed out program used for testing out stuff.
 *
 * @author Brad Dennis
 * Created:  09/11/2016
 * Modified: --
 */
public class Scratchpad {
    private static final String INPUT_PROMPT = "Enter your operation and data (‘X’ ends a list):";
    private static final String TERMINATOR = "X";
    private static final String EXIT = "exit";
    private static final String AVERAGE = "AVG";
    private static final String SUM = "SUM";

    public static void main(String[] args) {
        Scratchpad myCalculator = new Scratchpad();
        myCalculator.go();

    }

    private void go() {
        Scanner stdIn = new Scanner(System.in);
        System.out.print(INPUT_PROMPT);

        String command = stdIn.next();
        while (!command.toLowerCase().equals(EXIT)) {
            switch (command) {
                case AVERAGE:
                    System.out.println("The average is " + average(readData(stdIn)));
                    break;
                case SUM:
                    System.out.println("The sum is " + sum(readData(stdIn)));
                    break;
                default:
                    System.out.println("Command '" + command + "' not recognized.");
            }
            System.out.print(INPUT_PROMPT);
            command = stdIn.next();
        }

    }

    private int[] readData(Scanner stdIn) {
        String token = stdIn.next();
        int[] data = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        int counter = 0;
        while (!token.equals(TERMINATOR)) {
            data[counter] = Integer.parseInt(token);
            counter++;
            token = stdIn.next();
        }
        return data;
    }


    private static double average(int[] data) {
        int counter = 0;
        int sum = 0;
        double average = 0;

        for (int i = 0; i < data.length; i++) {
            if (data[i] != -1) {
                counter++;
                sum += data[i];
            }
        }

        if (counter > 0) {
            average = (double) sum / counter;
        }
        return average;
    }

    private static int sum(int[] data) {
        int sum = 0;

        for (int i = 0; i < data.length; i++) {
            if (data[i] != -1) {
                sum += data[i];
            }
        }

        return sum;
    }
}
