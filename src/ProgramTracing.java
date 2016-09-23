import java.util.Scanner;

/*
 * ProgramTracing.java
 *
 * Three demos to show how to trace a program.
 *
 * @author Brad Dennis
 * Created:  09/23/2016
 * Modified: --
 */
public class ProgramTracing {

    public static void main(String[] args) {
        doInstructorDemo();
        doCollaborativeDemo();
        doStudentDemo();

    }


    private static void doInstructorDemo() {
        int checking = 200;
        int savings = 300;
        int cash = 40;

        System.out.println("Total assets: " + (checking + savings + cash));
        System.out.println();

        cash--; // coffee
        checking -= 5;  // lunch

        checking += 300; // payday

        checking -= 30; // transfer to savings
        savings += 30;

        checking -= 30; // donate to children's hospital

        System.out.println("Cash balance: " + cash);
        System.out.println("Checking balance: " + checking);
        System.out.println("Savings balance: " + savings);
        System.out.println("----------------------");
        System.out.println("Total assets: " + (checking + savings + cash));
    }

    private static void doCollaborativeDemo() {
        int a;
        int b = 10;
        double c = 50.0;

        a = 2;
        c /= b;

        System.out.println ("a + b + c = " + (a + b + c));

        a++;
        b--;
        c *= 2;

        System.out.println ("a + b + c = " + (a + b + c));
    }

    private static void doStudentDemo() {
        Scanner standardIn = new Scanner(System.in);
        String name = "";
        int counter = 0;

        System.out.print("Enter in your name: ");
        name = standardIn.nextLine();

        while (counter < 2) {
            System.out.println(name);
            counter++;
        }
    }

}
