/*
 * SE1011
 * Fall 2018
 * Array practice
 * Name: Brad Dennis
 * Created: 11/04/2018
 */


import java.util.ArrayList;

/**
 * This is a set of exercises taken from Coding Bat for practice.
 * We will do these exercises again but with an ArrayList.
 */
public class ArrayLists {
    private static final String PASSED = "passed";
    private static final String FAILED = "FAILED";


    public static void main(String[] args) {

        System.out.println("\n*** firstLast6 Tests ***");

        int[] nums = new int[] {1, 2, 6};
        System.out.print("{1, 2, 6} ---- ");

        if (firstLast6(nums)) {
            System.out.println(PASSED);
        } else {
            System.out.println(FAILED);
        }

        nums = new int[] {6, 1, 2, 3};
        System.out.print("{6, 1, 2, 3} ---- ");

        if (firstLast6(nums)) {
            System.out.println(PASSED);
        } else {
            System.out.println(FAILED);
        }

        nums = new int[] {13, 6, 1, 2, 3};
        System.out.print("{13, 6, 1, 2, 3} ---- ");

        if (!firstLast6(nums)) {
            System.out.println(PASSED);
        } else {
            System.out.println(FAILED);
        }

        System.out.println("\n*** sum3 Tests ***");
        nums = new int[] {1, 2, 3};
        System.out.print("{1, 2, 3} ---- ");

        if (sum3(nums) == 6) {
            System.out.println(PASSED);
        } else {
            System.out.println(FAILED);
        }

        nums = new int[] {5, 11, 2};
        System.out.print("{5, 11, 2} ---- ");

        if (sum3(nums) == 18) {
            System.out.println(PASSED);
        } else {
            System.out.println(FAILED);
        }

        nums = new int[] {7, 0, 0};
        System.out.print("{7, 0, 0} ---- ");

        if (sum3(nums) == 7) {
            System.out.println(PASSED);
        } else {
            System.out.println(FAILED);
        }
    }

    /**
     * Given an array of ints, return true if 6 appears as either the first or last element in the array.
     * The array will be length 1 or more.\
     * firstLast6([1, 2, 6]) → true
     * firstLast6([6, 1, 2, 3]) → true
     * firstLast6([13, 6, 1, 2, 3]) → false
     *
     * http://codingbat.com/prob/p185685
     */
    private static boolean firstLast6(int[] nums) {

        return false;
    }

    /**
     *
     * Given an array of ints length 3, return the sum of all the elements.
     *
     * sum3([1, 2, 3]) → 6
     * sum3([5, 11, 2]) → 18
     * sum3([7, 0, 0]) → 7
     *
     * http://codingbat.com/prob/p175763
     */

    private static int sum3(int[] nums) {
        // DO NOT USE A LOOP
        return -1;
    }



    private static ArrayList<Integer> arrayToList(int[] array) {
        ArrayList<Integer> intList = new ArrayList<>();
        for (int index = 0; index < array.length; index++) {
            intList.add(array[index]);
        }
        return intList;
    }
}
