/*
 * SE1011
 * Fall 2018
 * ExamList.java
 * Name: Brad Dennis
 * Created: 10/30/2018
 */
package edu.msoe.arrays;

/**
 * This class models a collection of exam scores.
 * The default size of this list is 10, but it will grow automatically.
 *
 * @author bdennis
 * @version 2016.10.30
 */
public class ScoreList {
    private static final int ERROR = -1;
    private static final int INITIAL_CAPACITY = 10;
    private static final double CAPACITY_THRESHOLD = .80;
    private static final int RESIZE_FACTOR = 2;

    private int capacity = INITIAL_CAPACITY;
    private int[] scores;
    private int size = 0;

    /**
     * Instantiates a new ScoreList with the default capacity of 10.
     */
    public ScoreList() {
        scores = new int[capacity];
    }

    /**
     * Instantiates a new ScoreList with the given capacity.
     */
    public ScoreList(int capacity) {
        scores = new int[capacity];
    }
    /**
     * Adds a score to the list.
     *
     * @param score the score to add.
     */
    public void add(int score){
        if (utilization() > CAPACITY_THRESHOLD) {
            grow();
        }
        scores[size] = score;
        size++;
    }

    /**
     * Inserts the score at that index.
     *
     * @param index the index to insert at.
     * @param score the score to insert.
     */
    public void add (int index, int score) {
        if (!isValidIndex(index)) {
            return;
        }
        if (utilization() > CAPACITY_THRESHOLD) {
            grow();
        }

        int[] temp = new int[size - index];

        // copy the scores that are at and after the insertion point
        // to a temp array
        for (int i = 0; i < size() - index; i++) {
            temp[i] = scores[index + i];
        }

        size++;

        // put them back into scores at a spot +1 from where they were
        for (int i = index + 1; i < size() - index; i++) {
            scores[i] = temp[i - index];
        }

        // insert the new score
        scores[index] = score;
    }

    /**
     * Sets a score at particular index.
     *
     * @param index the index to set
     * @param value the value to store
     * @return returns the score that was overwritten.  -1 if none.
     */
    public int set(int index, int value) {
        int oldScore = ERROR;
        if (isValidIndex(index)) {
            oldScore = scores[index];
            scores[index] = value;
        }

        return oldScore;
    }

    /**
     * Gets an exam score at the specified index.
     *
     * @param index the index in the list.
     * @return the score at that index.
     */
    public int get(int index) {
        if (!isValidIndex(index)) {
            return ERROR;
        }
        return scores[index];
    }

    /**
     * Removes the first instance of the score.
     *
     * @param score to remove.
     */
    public void remove(int score) {
        int index = indexOf(score);

        if (index == ERROR) {
            return;
        }

        for (int i = index; i < size(); i++) {
            scores[i] = scores[i+1];
        }
        size--;
    }

    /**
     * Returns the index the first occurrence of the score.
     * -1 if it's not found.
     *
     * @param score the score to look for.
     * @return the index of the score
     */
    public int indexOf(int score) {
        int index = ERROR;


        for (int i = 0; i < size(); i++) {
            if (scores[i] == score) {
                index = i;
                break;
            }
        }
        return index;
    }

    /**
     * Returns the index the first occurrence of the score.
     * -1 if it's not found.
     *
     * @param score the score to look for.
     * @return the index of the score
     */
    public int lastIndexOf(int score) {
        int index = ERROR;
        for (int i = 0; i < size(); i++) {
            if (scores[i] == score) {
                index = i;
            }
        }
        return index;
    }

    /**
     *
     * Removes all the scores from the list.
     */
    public void clear() {
        scores = new int[capacity];
        size = 0;
    }

    /**
     * Returns whether or not the list contains a particular score.
     *
     * @param score the score to look for.
     * @return true if the score is in the list.
     */
    public boolean contains(int score) {
        boolean wasFound = false;

        //enhanced for-loop
        //"for each exam score in scores"
        for (int examScore : scores) {
            if (score == examScore) {
                wasFound = true;
                break;
            }
        }

        return wasFound;
    }

    /**
     * Returns the size of the list.
     *
     * @return the size of the list.
     */
    public int size() {
        return this.size;
    }

    /**
     * Returns if the list is empty or not.
     *
     * @return true if the list is empty.
     */
    public boolean isEmpty() {
        return size() == 0;
    }

    private double utilization() {
        return (double)size()/scores.length;
    }

    private void grow() {
        int[] copy = new int[capacity * RESIZE_FACTOR];

        for (int i = 0; i < scores.length; i++) {
            copy[i] = scores[i];
        }
        scores = copy;
    }

    private boolean isValidIndex(int index) {
        return (index >= 0 && index < size());
    }

}
