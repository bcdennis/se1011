/*
 * SwitchStatements.java
 *
 * This is a simple program to demonstrate a switch statement.
 *
 * @author Brad Dennis
 * Created:  09/25/2016
 * Modified: --
 */
import java.util.Scanner;

public class SwitchStatements {

    private static final char DUCK = 'd';
    private static final char COW = 'c';
    private static final char LAMB = 'l';
    private static final char SHEEP = 's';
    private static final char HORSE = 'h';

    public static void main(String[] args) {
        doMenuDemoWithSwitch();
        doMenuDemoWithIfs();
    }

    private static void doMenuDemoWithSwitch() {
        Scanner standardIn = new Scanner(System.in);
        String menuSelection;

        System.out.println("*****[ Barnyard Animals Menu ]*****");
        System.out.println("Available animals:");
        System.out.println("'l' for lamb");
        System.out.println("'d' for duck");
        System.out.println("'c' for cow");
        System.out.println("'s' for sheep");
        System.out.println("'h' for horse");
        System.out.println("-------------------");
        System.out.print("Make a selection: ");

        menuSelection = standardIn.nextLine();

        switch(menuSelection.charAt(0)) {
            case DUCK:
                System.out.println("Quack quack");
            case COW:
                System.out.println("Moooooo");
                break;
            case LAMB:
            case SHEEP:
                System.out.println("Baaaa baaaa");
                break;
            case HORSE:
                System.out.println("Naaaayyyy");
                break;
            default:
                System.out.println("That animal is not on the farm!");
        }
    }

    private static void doMenuDemoWithIfs() {
        Scanner standardIn = new Scanner(System.in);
        String menuSelection;

        System.out.println("*****[ Barnyard Animals Menu ]*****");
        System.out.println("Available animals:");
        System.out.println("'l' for lamb");
        System.out.println("'d' for duck");
        System.out.println("'c' for cow");
        System.out.println("'s' for sheep");
        System.out.println("'h' for horse");
        System.out.println("-------------------");
        System.out.print("Make a selection: ");

        menuSelection = standardIn.nextLine();

        //TODO implement the menu feature using ifs.
    }
}
