import java.util.Scanner;

/*
 * Conditionals.java
 *
 * This is a simple program that contains do-while and for-loops
 *
 * @author Brad Dennis
 * Created:  09/27/2016
 * Modified: --
 */
public class LoopsPreQuiz {
    private static final String DUCK = "d";
    private static final String COW = "c";
    private static final String LAMB = "l";
    private static final String SHEEP = "s";
    private static final String HORSE = "h";
    private static final String QUIT = "q";
    private static final String EXIT = "x";

    public static void main(String[] args) {
        boolean quitting = false;
        Scanner standardIn = new Scanner(System.in);
        String menuSelection;
        String repeatInput;
        int repeat;
        String animalSounds = "";

        System.out.println("");
        System.out.println("*****[ Barnyard Animals Menu ]*****");
        System.out.println("Available animals:");
        System.out.println("'l' for lamb");
        System.out.println("'d' for duck");
        System.out.println("'c' for cow");
        System.out.println("'s' for sheep");
        System.out.println("'h' for horse");
        System.out.println("-------------------");

        do {
            System.out.print("Make a selection ('q' or 'x' to exit): ");
            menuSelection = standardIn.nextLine();
            System.out.print("How many times would you like to repeat? ");
            repeatInput = standardIn.nextLine();
            repeat = Integer.parseInt(repeatInput);

            switch (menuSelection.toLowerCase()) {
                case DUCK:
                    animalSounds = "Quack quack";
                    break;
                case COW:
                    animalSounds = "Moooooo";
                    break;
                case LAMB:
                case SHEEP:
                    animalSounds = "Baaaa baaaa";
                    break;
                case HORSE:
                    animalSounds = "Naaaayyyy";
                    break;
                case QUIT:
                case EXIT:
                    quitting = true;
                    break;
                default:
                    System.out.println("That animal is not on the farm!");
            }

            for (int i = 0; i < repeat; i++) {
                System.out.println(animalSounds);
            }

        } while (!quitting);
    }
}
