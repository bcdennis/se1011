import java.util.Scanner;

public class CodingStandard {

    public static void main(String[] args) {
        Scanner si = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int diameter = si.nextInt();
        si.nextLine();
        if (diameter < 1) System.out.println("Cannot make a zero or negative sized square.  Exiting.");
        System.out.print("Filled in? (y/n) ");
        String A = si.nextLine();

        if (!(A.equalsIgnoreCase("y") || A.equalsIgnoreCase("n"))) System.out.println("Only 'y' or 'n' are permitted.  Exiting.");
            for (int i = 0; i < diameter; i++)
                System.out.print("*");
                System.out.println();

        for (int i = 1; i < diameter - 1; i++);
        System.out.print("*");
            for (int j = 1; j < diameter - 1; j++) {
                if (A.equalsIgnoreCase("y"))
                {
                    System.out.print("*");
                } else
                {
                    System.out.print(" ");
                }
                System.out.println("*");
        }
    for (int counter = 0; counter < diameter; counter++) {
        System.out.print("*");
    }
        System.out.println();}}