/*
 * InputOutput.java
 *
 * This is a simple program that will be used to demonstrate
 * I/O.
 *
 * @author Brad Dennis
 * Created:  09/13/2016
 * Modified: --
 */
import javax.swing.*;
import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {
        outputDemo();
        //inputDemo();
        //guiDemo();

        //Your turn
        //studentWorkshop();
    }
    private static void outputDemo() {
        //ASCII Art
        // https://docs.oracle.com/javase/8/docs/api/java/lang/System.html

        {
            System.out.println("     /\\___/\\");
            System.out.println("    (  o o  )");
            System.out.println("    /   *   \\\t-meow");
            System.out.println("    \\__\\_/__/");
            System.out.println("      /   \\");
            System.out.println("     / ___ \\");
            System.out.println("     \\/___\\/");

            System.out.println("\n\n\n");
            //http://www.tutorialspoint.com/java/java_characters.htm
        }
        System.out.print("This doesn't have");
        System.out.println(" a linebreak.");

        String escapeChars = "\tHeading\tColumn\t\r\n\"Row\"";
        System.out.println(escapeChars+"\n\n");
    }

    private static void inputDemo() {
        // https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html
        // Variable declarations & initializations
        Scanner standardIn = new Scanner(System.in);
        byte inputForByte;
        int inputForInteger;
        double inputForDouble;
        boolean inputForBoolean;
        String inputForString;

        System.out.println("/*********************\\");
        System.out.println(" *   Instructions    *");
        System.out.println("\\*********************/");
        System.out.println("Input the value, then hit the 'enter' key.\n");
        System.out.print("Enter in a small whole number:  ");
        inputForByte = standardIn.nextByte();

        //prompt the user, then skip any leading whitespace from the input
        // until a token is found, then return the token as an int.
        System.out.print("Enter in a large whole number: ");
        inputForInteger = standardIn.nextInt();

        //prompt the user, then skip any leading whitespace from the input
        // until a token is found, then return the token as a double.
        System.out.print("Enter in a rational number:  ");
        inputForDouble = standardIn.nextDouble();

        //prompt the user, then skip any leading whitespace from the input
        // until a token is found, then return the token as an boolean.
        System.out.print("Enter in a boolean ('true' or 'false'): ");
        inputForBoolean = standardIn.nextBoolean();

        // nextLine processes leading whitespace.  The previous CRLF is left on the System.in buffer
        // so we must have this line to remove the leftover character from the buffer.
        standardIn.nextLine();

        //prompt the user, then skip any leading whitespace from the input
        // until a token is found, then return the token as a String.
        System.out.print("Enter in any string: ");
        inputForString = standardIn.nextLine();

        System.out.println("The byte you entered was '" + inputForByte + "'.");
        System.out.println("The int you entered was '" + inputForInteger + "'.");
        System.out.println("The double you entered was '" + inputForDouble + "'.");
        System.out.println("The boolean you entered was '" + inputForBoolean + "'.");
        System.out.println("The String you entered was '" + inputForString + "'.");

    }

    private static void guiDemo() {
        // Variable declarations
        byte inputForByte;
        int inputForInteger;
        double inputForDouble;
        boolean inputForBoolean;
        String inputForString;
        String dialogResult;

        String title = "Instructions";
        String banner = "/*********************\\\n";
        banner += " *   "+ title + "    *\n";
        banner += "\\*********************/\n";
        String message = "Input the value, then hit the 'enter' key.";

        JOptionPane.showMessageDialog(null, banner + message);
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);

        //https://docs.oracle.com/javase/8/docs/api/javax/swing/JOptionPane.html

        dialogResult = JOptionPane.showInputDialog(null, "Enter in a small whole number:  ");
        inputForByte = Byte.parseByte(dialogResult);
        JOptionPane.showMessageDialog(null, "The byte you entered was '" + inputForByte + "'.");

        dialogResult = JOptionPane.showInputDialog(null, "Enter in a large whole number: ");
        inputForInteger = Integer.parseInt(dialogResult);
        JOptionPane.showMessageDialog(null, "The int you entered was '" + inputForInteger + "'.");

        dialogResult = JOptionPane.showInputDialog(null, "Enter in a rational number:  ");
        inputForDouble = Double.parseDouble(dialogResult);
        JOptionPane.showMessageDialog(null, "The double you entered was '" + inputForDouble + "'.");

        dialogResult = JOptionPane.showInputDialog(null, "Enter in a boolean ('true' or 'false'): ");
        inputForBoolean = Boolean.parseBoolean(dialogResult);
        JOptionPane.showMessageDialog(null, "The boolean you entered was '" + inputForBoolean + "'.");

        inputForString = JOptionPane.showInputDialog(null, "Enter in any string: ");
        JOptionPane.showMessageDialog(null, "The String you entered was '" + inputForString + "'.");
    }

    private static void runStudentWorkshop() {

    }

}
