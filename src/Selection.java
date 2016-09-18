/*
 * Selection.java
 *
 * This is a simple program that will be used to demonstrate
 * selection statements in Java
 *
 * @author Brad Dennis
 * Created:  09/18/2016
 * Modified: --
 */
public class Selection {
    public static void main(String[] args) {

        if (true) {
            System.out.println("This will print");
        }

        if (false) {
            System.out.println("This will not print");
        }

        if (true) {
            System.out.println("This will print.");
            System.out.println("So will this.");
        }

        if (true) {
            System.out.println("This will print.");
            System.out.println("So will this.");
        } else {
            System.out.println("This will not print.");
        }

        if (false) {
            System.out.println("This will not print.");
        } else if (false) {
            System.out.println("This will not print");
        } else {
            System.out.println("This will print");
        }
    }
}
