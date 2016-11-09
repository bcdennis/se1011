/*
 * SE1011
 * Fall 2018
 * Array practice
 * Name: Brad Dennis
 * Created: 11/04/2018
 */


import com.sun.deploy.util.ArrayUtil;
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
        no23Tests();
        shiftLeftTests();
        tripleUpTests();
        bigDiffTests();
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
        ArrayList<Integer> list = arrayToList(nums);

        //

        return listToArray(list);
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

    /*
     * Given an int array length 2, return true if it does not contain a 2 or 3.
     *
     * no23([4, 5]) → true
     * no23([4, 2]) → false
     * no23([3, 5]) → false
     */
    private static boolean no23(int[] nums) {

        return false;
    }

    /*
     * Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}.
     * You may modify and return the given array, or return a new array.
     *
     * shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
     * shiftLeft([1, 2]) → [2, 1]
     * shiftLeft([1]) → [1]
     */
    private static int[] shiftLeft(int[] nums) {
        ArrayList<Integer> list = arrayToList(nums);

        //

        return listToArray(list);
    }

    /*
     * Return true if the array contains, somewhere, three increasing adjacent numbers
     * like .... 4, 5, 6, ... or 23, 24, 25.
     *
     * tripleUp([1, 4, 5, 6, 2]) → true
     * tripleUp([1, 2, 3]) → true
     * tripleUp([1, 2, 4]) → false
     */
    private static boolean tripleUp(int[] nums) {

        return false;
    }

    /*
     *  Given an array length 1 or more of ints, return the difference between the largest and
     *  smallest values in the array. Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) \
     *  methods return the smaller or larger of two values.
     *  bigDiff([10, 3, 5, 6]) → 7
     *  bigDiff([7, 2, 10, 9]) → 8
     *  bigDiff([2, 10, 7, 2]) → 8
     */
    private static int bigDiff(int[] nums) {

        return -1;
    }

    private static void firstLast6Tests() {
        System.out.println("\n*** firstLast6 Tests ***");

        int[] nums = new int[] {1, 2, 6};
        System.out.print("{1, 2, 6} ---- ");

        if (firstLast6(nums)) {
            System.out.println(PASSED);
        } else {
            System.out.print(FAILED);
            System.out.println("\tExpected: true  Actual: " + firstLast6(nums));
        }

        nums = new int[] {6, 1, 2, 3};
        System.out.print("{6, 1, 2, 3} ---- ");

        if (firstLast6(nums)) {
            System.out.println(PASSED);
        } else {
            System.out.print(FAILED);
            System.out.println("\tExpected: true  Actual: " + firstLast6(nums));
        }

        nums = new int[] {13, 6, 1, 2, 3};
        System.out.print("{13, 6, 1, 2, 3} ---- ");

        if (!firstLast6(nums)) {
            System.out.println(PASSED);
        } else {
            System.out.print(FAILED);
            System.out.println("\tExpected: false  Actual: " + firstLast6(nums));
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
            System.out.print(FAILED);
            System.out.println("\tExpected: 6  Actual: " + sum3(nums));
        }

        nums = new int[] {5, 11, 2};
        System.out.print("{5, 11, 2} ---- ");

        if (sum3(nums) == 18) {
            System.out.println(PASSED);
        } else {
            System.out.print(FAILED);
            System.out.println("\tExpected: 18  Actual: " + sum3(nums));
        }

        nums = new int[] {7, 0, 0};
        System.out.print("{7, 0, 0} ---- ");

        if (sum3(nums) == 7) {
            System.out.println(PASSED);
        } else {
            System.out.print(FAILED);
            System.out.println("\tExpected: 7  Actual: " + sum3(nums));
        }
    }
    private static void makeMiddleTests() {
        int[] nums;

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

        if (nums[0] == 1 && nums[1] == 2) {
            System.out.println(PASSED);
        } else {
            System.out.print(FAILED);
            System.out.println("\tExpected: {1,2}  Actual: {" + nums[0] + ", " + nums[1] +"}");
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
            System.out.println("\tExpected: 3  Actual: " + maxTriple(nums));
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
    private static void no23Tests() {
        System.out.println("\n*** no23 Tests ***");

        int[] nums = new int[] {4,5};
        System.out.print("{4, 5} ---- ");

        if (no23(nums)) {
            System.out.println(PASSED);
        } else {
            System.out.print(FAILED);
            System.out.println("\tExpected: true  Actual: " + no23(nums));
        }

        nums = new int[] {4,2};
        System.out.print("{4, 2} ---- ");

        if (!no23(nums)) {
            System.out.println(PASSED);
        } else {
            System.out.print(FAILED);
            System.out.println("\tExpected: false  Actual: " + no23(nums));
        }

        nums = new int[] {3, 5};
        System.out.print("{3, 5} ---- ");

        if (!no23(nums)) {
            System.out.println(PASSED);
        } else {
            System.out.print(FAILED);
            System.out.println("\tExpected: false  Actual: " + no23(nums));
        }
    }
    private static void shiftLeftTests() {
        int[] nums;

        System.out.println("\n*** shiftLeft Tests ***");
        nums = shiftLeft(new int[] {6, 2, 5, 3});
        System.out.print("{6, 2, 5, 3} ---- ");

        if (nums[0] == 2 && nums[1] == 5 && nums[2] == 3 && nums[3] == 6) {
            System.out.println(PASSED);
        } else {
            System.out.print(FAILED);
            System.out.println("\tExpected: {2, 5, 3, 6}  "
                    + "Actual: {" + nums[0]
                    + ", " + nums[1]
                    + ", " + nums[2]
                    + ", " + nums[3] +"}");
        }

        nums = shiftLeft(new int[] {1, 2});
        System.out.print("{1, 2} ---- ");

        if (nums[0] == 2 && nums[1] == 1) {
            System.out.println(PASSED);
        } else {
            System.out.print(FAILED);
            System.out.println("\tExpected: {2,1}  Actual: {" + nums[0] + ", " + nums[1] +"}");
        }

        nums = makeMiddle(new int[] { 1});
        System.out.print("{1} ---- ");

        if (nums[0] == 1) {
            System.out.println(PASSED);
        } else {
            System.out.print(FAILED);
            System.out.println("\tExpected: {1}  Actual: {" + nums[0]  +"}");
        }
    }
    private static void tripleUpTests() {
        System.out.println("\n*** tripleUp Tests ***");

        int[] nums = new int[] {1, 4, 5, 6, 2};
        System.out.print("{1, 4, 5, 6, 2} ---- ");

        if (tripleUp(nums)) {
            System.out.println(PASSED);
        } else {
            System.out.print(FAILED);
            System.out.println("\tExpected: true  Actual: " + tripleUp(nums));
        }

        nums = new int[] {1, 2, 3};
        System.out.print("{1, 2, 3} ---- ");

        if (tripleUp(nums)) {
            System.out.println(PASSED);
        } else {
            System.out.print(FAILED);
            System.out.println("\tExpected: true  Actual: " + tripleUp(nums));
        }

        nums = new int[] {1, 2, 4};
        System.out.print("{13, 6, 1, 2, 3} ---- ");

        if (!tripleUp(nums)) {
            System.out.println(PASSED);
        } else {
            System.out.print(FAILED);
            System.out.println("\tExpected: false  Actual: " + tripleUp(nums));
        }
    }
    private static void bigDiffTests() {
        int[] nums;

        System.out.println("\n*** bigDiff Tests ***");
        nums  = new int[] {10, 3, 5, 6};
        System.out.print("{10, 3, 5, 6} ---- ");

        if (bigDiff(nums) == 7) {
            System.out.println(PASSED);
        } else {
            System.out.print(FAILED);
            System.out.println("\tExpected: 7  Actual: " + bigDiff(nums));
        }

        nums  = new int[] {7, 2, 10, 9};
        System.out.print("{7, 2, 10, 9} ---- ");

        if (bigDiff(nums) == 8) {
            System.out.println(PASSED);
        } else {
            System.out.print(FAILED);
            System.out.println("\tExpected: 8  Actual: " + bigDiff(nums));
        }

        nums  = new int[] {2, 10, 7, 2};
        System.out.print("{2, 10, 7, 2} ---- ");

        if (bigDiff(nums) == 8) {
            System.out.println(PASSED);
        } else {
            System.out.print(FAILED);
            System.out.println("\tExpected: 8  Actual: " + bigDiff(nums));
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

    private static int[] listToArray(ArrayList<Integer> list) {
        //TODO implement this
        return new int[0];
    }
}
