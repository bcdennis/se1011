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
    public static void main(String[] args) {

        String testString = "eve";
        boolean isPalindrome = true;

        for (int i = testString.length(); i > 0; i--) {
            char left = testString.charAt(testString.length() - i);
            char right = testString.charAt(i -1);

            if (left != right) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(testString + " is a palindrome.");
        } else {
            System.out.println(testString + " is not a palindrome");
        }
    }
}
