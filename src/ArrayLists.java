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

        firstLast6Tests();
        sum3Tests();
        makeMiddleTests();
        maxTripleTests();
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

    /*
     * Given an array of ints of even length, return a new array length 2 containing the middle two
     * elements from the original array. The original array will be length 2 or more.
     *
     * makeMiddle([1, 2, 3, 4]) → [2, 3]
     * makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
     * makeMiddle([1, 2]) → [1, 2]
     */
    private static int[] makeMiddle(int[] nums) {

        return new int[]{-1, -1};
    }

    /*
     * Given an array of ints of odd length, look at the first, last, and middle values in the array
     * and return the largest. The array length will be a least 1.
     *
     * maxTriple([1, 2, 3]) → 3
     * maxTriple([1, 5, 3]) → 5
     * maxTriple([5, 2, 3]) → 5
     */
    private static int maxTriple(int[] nums) {

        return -1;
    }


    private static void firstLast6Tests() {
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
    }
    private static void sum3Tests() {
        int[] nums;

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
    private static void makeMiddleTests() {
        int[] nums;
        /*
        * makeMiddle([1, 2, 3, 4]) → [2, 3]
        * makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
        * makeMiddle([1, 2]) → [1, 2]
        */

        System.out.println("\n*** makeMiddle Tests ***");
        nums = makeMiddle(new int[] {1, 2, 3, 4});
        System.out.print("{1, 2, 3, 4} ---- ");

        if (nums[0] == 2 && nums[1] == 3) {
            System.out.println(PASSED);
        } else {
            System.out.print(FAILED);
            System.out.println("\tExpected: {2,3}  Actual: {" + nums[0] + ", " + nums[1] +"}");

        }

        nums = makeMiddle(new int[] {7, 1, 2, 3, 4, 9});
        System.out.print("{7, 1, 2, 3, 4, 9} ---- ");

        if (nums[0] == 2 && nums[1] == 3) {
            System.out.println(PASSED);
        } else {
            System.out.print(FAILED);
            System.out.println("\tExpected: {2,3}  Actual: {" + nums[0] + ", " + nums[1] +"}");
        }

        nums = makeMiddle(new int[] { 1, 2});
        System.out.print("{1, 2} ---- ");

        if (nums[0] == 1 && nums[2] == 2) {
            System.out.println(PASSED);
        } else {
            System.out.print(FAILED);
            System.out.println("\tExpected: {2,3}  Actual: {" + nums[0] + ", " + nums[1] +"}");
        }
    }
    private static void maxTripleTests() {
        int[] nums;

        System.out.println("\n*** maxTriple Tests ***");
        nums  = new int[] {1, 2, 3};
        System.out.print("{1, 2, 3} ---- ");

        if (maxTriple(nums) == 3) {
            System.out.println(PASSED);
        } else {
            System.out.print(FAILED);
            System.out.println("\tExpected: 5  Actual: " + maxTriple(nums));
        }

        nums  = new int[] {1, 5, 3};
        System.out.print("{1, 5, 3} ---- ");

        if (maxTriple(nums) == 5) {
            System.out.println(PASSED);
        } else {
            System.out.print(FAILED);
            System.out.println("\tExpected: 5  Actual: " + maxTriple(nums));
        }

        nums  = new int[] {5, 2, 3};
        System.out.print("{5, 2, 3} ---- ");

        if (maxTriple(nums) == 5) {
            System.out.println(PASSED);
        } else {
            System.out.print(FAILED);
            System.out.println("\tExpected: 5  Actual: " + maxTriple(nums));
        }
    }
    private static ArrayList<Integer> arrayToList(int[] array) {
        ArrayList<Integer> intList = new ArrayList<>();

        for(int i : array) {
            intList.add(i);
        }

        /*  regular for loop
        for (int index = 0; index < array.length; index++) {
            intList.add(array[index]);
        }
        */
        return intList;
    }
}
